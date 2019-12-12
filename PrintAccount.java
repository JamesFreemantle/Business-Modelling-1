import java.util.ArrayList;

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
	
	public PrintJob createJob(Document, boolean color, boolean bothSides) 
	{
		this.
	}
	
	public PrintAccount getAccount()
	{
		return printAccount;
		
	}

	public String toString(){
		
		return "Name: " + this.name + ", Balance:" + this.balance;
	}
}