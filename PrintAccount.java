
public class PrintAccount {

	 private double balance;
	 private String name;
	 private PrintAccount printAccount;
	 
	public PrintAccount(String name, double balance) 
	{
		this.name=name;
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return balance;
	}

	public String getName(){
		return name;
	}
	public void deposit (double money)
	{
		balance = balance + money;
	}
	
	public PrintAccount getAccount()
	{
		return printAccount;
		
	}

	public String toString(){
		
		return "Name: " + this.name + ", Balance:" + this.balance;
	}
}
