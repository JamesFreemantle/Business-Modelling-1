import java.util.ArrayList;

public class Printer 
{
	private String printerID;
	private float tonerLevel=50;
	private int paperLeft =50;
	private  ArrayList<PrintJob> printQueue;
	
	public Printer(String printerID, String filename, int sizeMB, ArrayList<PrintJob> printQueue, float tonerLevel, int paperLeft) 
	{
		this.printerID=printerID;
		this.tonerLevel=tonerLevel;
		this.paperLeft=paperLeft;
		this.printQueue = printQueue;
	}
	public boolean canPrint(PrintJob printJob)
	{
		if (paperLeft>printJob.getFile().getpages())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void queueJob(PrintJob printJob)
	{
		printQueue.add(printJob);
	}
	public void dequeueJob(PrintJob printJob)
	{
		printQueue.remove(printJob);
	}
	
}
