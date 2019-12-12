import java.util.ArrayList;
import java.util.Scanner;

public class PrintAccount {

	 private double balance;
	 private String ID;
	 private ArrayList<Document> uploads= new ArrayList<Document>();
	 private ArrayList<PrintJob> jobList = new ArrayList<PrintJob>();
	 
	 Printer printerOne = new Printer(1,50,100);
	 
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
            System.out.print("\nWelcome to our Printing system");
            System.out.print("\n1.  Show Account details");
            System.out.print("\n2.  Top up account");
            System.out.print("\n3.  Send document to printer");
            System.out.print("\n4.  Quit");
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
            	sendToPrinter(pjob, printerOne);
            }
        }
            while (option2 != 4);
	}
	
	public PrintJob createJob()
	{
		System.out.println("Document ID: ");
		int docID = scan.nextInt();
		scan.nextLine();
		System.out.println("Filename: ");
    	String filename = scan.nextLine();
    	System.out.println("MB: ");
    	int mb = scan.nextInt();
    	scan.hasNextLine();
    	System.out.println("Enter number of pages: ");
    	int numpages = scan.nextInt();
    	scan.nextLine(); 
    	Document doc = new Document(docID, filename, mb,numpages);
    	boolean colour =false;
		boolean bothsides = false;
		PrintJob pjob = new PrintJob(doc, colour, bothsides);
		pjob = pjob.uploadDocument(doc, colour, bothsides);
		jobList.add(pjob);
		return pjob;
	}
	public void canAfford(PrintJob pjob)
	{
		double expense = pjob.calculatePrice(pjob.getFile());
		if (expense>getBalance())
		{
			System.out.println("Sorry, you need to TopUp, current balance : "+getBalance()+" Cost: "+expense);
		}
		else
		{
			changeBalance(expense);
		}
	}
	
	public void sendToPrinter(PrintJob pjob, Printer printerOne)
	{
		
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