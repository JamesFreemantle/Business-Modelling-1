import java.util.ArrayList;
import java.util.Scanner;

public class Printer {
	private ArrayList<PrintAccount> printAccounts;
	public Printer()
	{
		printAccounts = new ArrayList<PrintAccount>();
	}
	public void menu() 
	{       
		Scanner scan = new Scanner(System.in);
        int option = 0;
        do {
            System.out.print("\nWelcome to our Printing system");
            System.out.print("\n1.  Create new user account");
            System.out.print("\n2.  Display all accounts");
            System.out.print("\n3.  Deposit credit");
            System.out.print("\n4.  Send document to printer");
            System.out.print("\n5.  Quit");
         
            option = scan.nextInt();
            scan.nextLine();
            if (option == 1)
            {
            	createNewUserAccount();
            }
            else if (option == 2)
            {
            	displayAccounts();
            }
            else if (option == 3)
            {
            	depositintoAccounts();
            }
            else if (option == 4)
            {
                sendDoctoprinter();
            }
            
        } while (option != 5);
    }
	public void sendDoctoprinter() 
	{	
		
	}
	public  void createNewUserAccount()
	{
	    Scanner scan = new Scanner(System.in);
		for (int i=0; i<3; i++)
		{
			double balance =0;
			System.out.println("Account name: ");
			String name = scan.nextLine();
			PrintAccount PrintAcc = new PrintAccount(name, balance);
			printAccounts.add(PrintAcc);		
		 }
	}
	public void displayAccounts()
	{
		if(!printAccounts.isEmpty())
		 {
			 for (PrintAccount anAccount: printAccounts)
			 {
				 System.out.println(anAccount.toString());
			 }
		 }
		 else{
			 System.out.println("There are no accounts yet");
		 }
	}
	public void depositintoAccounts()
	{
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Name of the Account you want to deposit : "  );
		 String name = scan.nextLine();
		
		 boolean found = false;
		 int i =0;
		 PrintAccount anAccount = searchAccount(name);
		while (!found && (i<=2))
		{
			if ( (printAccounts.get(i).getName()).equals(name)) 
			{
				
				 System.out.print("How much:" );
				 double amount = scan.nextDouble();
				 anAccount.deposit(amount);				 
				 System.out.println("Successful deposit !" );
				 found = true;
			}
			i++;
			if (!found)
			{
				System.out.println("Cannot find the account name " + name);
			}
		}
	}
		
		private PrintAccount searchAccount(String name)
		{
			if(!printAccounts.isEmpty())
			{
				for (PrintAccount anAccount: printAccounts)
				{
					if(anAccount.getName().equalsIgnoreCase(name))
					{
						return anAccount;
					}
				}
			}
			else 
			{
				System.out.println("There are no accounts yet");
			}
			return null;	
		}
		
		public static void main(String[] args) 
		{			
			Printer obj = new Printer();	
			obj.menu();	
		}
}
