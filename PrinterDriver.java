import java.util.ArrayList;
import java.util.Scanner;

public class PrinterDriver {
	private ArrayList<PrintAccount> printAccounts;
	private ArrayList<User> userAccounts;
	public PrinterDriver()
	{
		userAccounts = new ArrayList<User>();
		printAccounts = new ArrayList<PrintAccount>();
	}
	public void mainMenu() 
	{       
		Scanner scan = new Scanner(System.in);
        int option = 0;
        do {
            System.out.print("\nWelcome to our Printing system");
            System.out.print("\n1.  Create User");
            System.out.print("\n2.  Display all Users");
            System.out.print("\n3.  Login");
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
            	displayUsers();
            }
            else if (option == 3)
            {
            	System.out.println("Please enter your accountID to login");
            	String ID = scan.nextLine();
            	login(ID);
            }
            else if (option == 4)
            {
                sendDoctoprinter();
            }
            
        } while (option != 5);
    }
	public PrintAccount login(String ID)
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
	public void sendDoctoprinter() 
	{	
		
	}
	public  void createNewUserAccount()
	{
	    Scanner scan = new Scanner(System.in);
		for (int i=0; i<3; i++)
		{
			int balance = 0;
			System.out.println("User ID: ");
			String ID = scan.nextLine();
			System.out.println("User name:");
			String name = scan.nextLine();
			System.out.println("User email:");
			String email = scan.nextLine();
			User UserAcc = new User(ID, name, email);
			userAccounts.add(UserAcc);		
		 }
	}
	public void displayUsers()
	{
		if(!userAccounts.isEmpty())
		 {
			 for (User anAccount: userAccounts)
			 {
				 System.out.println(anAccount.toString());
			 }
		 }
		 else{
			 System.out.println("There are no accounts yet");
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
			PrinterDriver obj = new PrinterDriver();	
			obj.mainMenu();	
		}
}