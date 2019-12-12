import java.util.ArrayList;
import java.util.Scanner;

public class PrintAccount {

	 private double balance;
	 private String ID;
	 private ArrayList<Document> documents;
	 private ArrayList<PrintJob> jobList;
	 
	public PrintAccount(String ID, double balance) 
	{
		this.ID=ID;
		this.balance=balance;
	}
	
	public void printAccountMenu()
	{
		Scanner scan = new Scanner(System.in);
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
            	
            }
        }
            while (option2 != 4);
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