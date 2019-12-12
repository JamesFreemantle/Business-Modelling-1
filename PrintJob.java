import java.util.Scanner;
public class PrintJob 
{
	private String jobID;
	private String status;
	private Document file;
	private boolean colour;
	private boolean bothsides;
	Scanner scan = new Scanner(System.in);
	
	public PrintJob(Document file, boolean colour, boolean bothsides)
	{
		this.jobID=jobID;
		this.status=status;
		this.file=file;
		this.colour=colour;
		this.bothsides=bothsides;
	}
	
	public double calculatePrice(Document file) 
	{
		double price;
		int pages = file.getpages();
		if (colour == true)
		{
			price = pages * 0.5;
		}
		else
		{
			price = pages *0.3;
		}
		if (bothsides == true)
		{
			price = price/1.2;
		}
		return price;
	}
	
	public PrintJob uploadDocument(Document file,boolean colour,boolean bothsides)
	{  	
		System.out.println("Print in colour? Y/N ");
    	String a = scan.nextLine();
    	if((a=="y")||(a=="Y"))
    	{
    		colour=true;
    	}
    	else
    	{
    		colour =false;
    	}
    	System.out.println("Print both sides? Y/N");
    	String b = scan.nextLine();
    	if((b=="y")||(b=="Y"))
    	{
    		bothsides=true;
    	}
    	else
    	{
    		bothsides =false;
    	}
    	PrintJob pjob = new PrintJob(file,colour,bothsides);
		return pjob;
	}
	

	public Document getFile() {
		return file;
	}

		
}
