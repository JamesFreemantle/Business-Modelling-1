import java.util.ArrayList;
import java.util.Scanner;

public class PrintAccount {

	 private double balance;
	 private String ID;
	 public double expense;
	 private ArrayList<Document> uploads= new ArrayList<Document>();
	 private ArrayList<PrintJob> jobList = new ArrayList<PrintJob>();
	 
	 Printer printerOne = new Printer(1);
	 Printer printerTwo = new Printer(2);
	 Printer printerThree = new Printer(3);
	 
	 Scanner scan = new Scanner(System.in);
	public PrintAccount(String ID, double balance) 
	{
		this.ID=ID;
		this.balance=balance;
	}
	
	public void printAccountMenu()
	{
        int option2 = 0;
        do {
            System.out.print("\nWelcome "+ID+" !");
            System.out.print("\n1.  Show Account details");
            System.out.print("\n2.  Top up account");
            System.out.print("\n3.  Send document to printer");
            System.out.print("\n4.  Print documents from printer");
            System.out.print("\n5.  Quit");
            option2 = scan.nextInt();
            scan.nextLine();
            if (option2 == 1)
            {
            	getAccountDetails();
            }
            else if (option2 == 2)
            {
            	System.out.println("How much would you like to TopUp your account by?");
            	double topupfigure = scan.nextDouble();
            	topUp(topupfigure);
            	System.out.println("New Balance: "+ getBalance());
            }
            else if (option2 == 3)
            {
            	PrintJob pjob = createJob();
            	canAfford(pjob);
            }
            else if (option2 ==4)
            {
            	System.out.println("Enter document ID to print: ");
            	String docResponse = scan.nextLine();
            	for (PrintJob pjob: jobList)
				{
					if(pjob.getFile().getDocID().equalsIgnoreCase(docResponse))
					{
						print(pjob);
					}
				}
            	dequeueJob();
            }
        }
            while (option2 != 5);
	}
	
	public PrintJob createJob()
	{
		System.out.println("Document ID: ");
		String docID = scan.nextLine();
		System.out.println("Filename: ");
    	String filename = scan.nextLine();
    	System.out.println("Enter number of pages: ");
    	int numpages = scan.nextInt();
    	scan.nextLine(); 
    	Document doc = new Document(docID, filename, numpages/5,numpages);
    	uploads.add(doc);
    	boolean colour =false;
		boolean bothsides = false;
		PrintJob pjob = new PrintJob(doc, colour, bothsides);
		pjob = pjob.uploadDocument(doc, colour, bothsides);
		jobList.add(pjob);
		return pjob;
	}
	public void canAfford(PrintJob pjob)
	{
		expense = pjob.calculatePrice(pjob.getFile());
		if (expense>getBalance())
		{
			System.out.println("Sorry, you need to TopUp, current balance : "+getBalance()+" Cost: "+expense);
		}
		else
		{
			sendToPrinter(pjob);
		}
	}
	
	public void sendToPrinter(PrintJob pjob)
	{
		if(printerOne.canPrint(pjob))
		{
			printerOne.queueJob(pjob);
			System.out.println("Sent to printer! "+pjob.getFile());
		}
		else
		{
			System.out.println("The printer needs restocking");
		}
	}
	public void print(PrintJob pjob)
	{
			printerOne.dequeueJob(pjob);
			changeBalance(expense);
			System.out.println("Printing document: "+pjob.getFile());
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getID()
	{
		return ID;
	}
	
	public void topUp (double amount)
	{
		balance = balance + amount;
	}
	public void dequeueJob()
	{
		jobList.clear();
		uploads.clear();
	}
	
	public void changeBalance(double expense)
	{
		balance = balance - expense;
	}
	
	public void getAccountDetails()
	{
		System.out.println( "ID: " + ID + ", Balance:" + balance+", Documents"+uploads
		+", joblist: "+jobList);
	}

}