
public class PrintJob 
{
	private String jobID;
	private String status;
	private Document file;
	private boolean color;
	private boolean bothsides;
	
	public PrintJob(String jobID,String status,Document file, boolean color, boolean bothsides)
	{
		this.jobID=jobID;
		this.status=status;
		this.file=file;
		this.color=color;
		this.bothsides=bothsides;
	}
	
	public double calculatePrice(Document file) 
	{
		double price;
		int pages = file.getpages();
		if (color == true)
		{
			price = pages * 1.5;
		}
		else
		{
			price = pages *1.1;
		}
		if (bothsides == true)
		{
			price = price/1.2;
		}
		return price;
	}
	public void setStatus(String status)
	{
		
	}
		
}
