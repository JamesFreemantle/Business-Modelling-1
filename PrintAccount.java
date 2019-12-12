import java.util.ArrayList;
import java.util.Scanner;

public class PrintAccount {

	 private double balance;
	 private String ID;
	 private ArrayList<Document> uploads;
	 private ArrayList<PrintJob> jobList;
	 
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
            	getAccount();
            }
            else if (option2 == 2)
            {
            	System.out.println("How much would you like to TopUp your account by?");
            	topUp(balance);
            	System.out.println("New Balance: "+ getBalance());
            }
            else if (option2 == 3)
            {
            	uploadDocument();
            }
        }
            while (option2 != 4);
	}
	public void uploadDocument()
	{
		System.out.println("Document ID: ");
		String docID = scan.nextLine();
		System.out.println("Filename: ");
    	String filename = scan.nextLine();
    	System.out.println("Enter number of pages: ");
    	int numpages = scan.nextInt();
    	scan.nextLine();   	
    	System.out.println("Print both sides? Y/N");
    	String bsides = scan.nextLine();
    	Document doc = new Document(docID, filename, sizeMB, numpages);
		uploads.add(doc);System.out.println("Print in colour? Y/N ");
    	String a = scan.nextLine();
    	if((a=="y")||(a=="Y"))
    	{
    		boolean colour=true;
    	}
    	else
    	{
    		boolean colour =false;
    	}
		createJob(doc,colour,bsides);
    	
    	
	}
	public PrintJob createJob(Document document, boolean colour, boolean bothSides)
	{
		PrintJob a = new PrintJob(document, colour, bothSides);
		return a;
	}
	public void sendToPrinter(PrintJob a)
	{
		a.
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
	
	public double calculateBalance(double amount)
	{
		amount = balance+amount;
		return amount;		
	}
	public void changeBalance(float amount)
	{
		balance = balance - amount;
	}
	
	public String getAccount()
	{
		return toString();	
	}

	public String toString(){
		
		return "ID: " + this.ID + ", Balance:" + this.balance+", Documents"+this.documents
				+", joblist: "+this.jobList;
	}
}