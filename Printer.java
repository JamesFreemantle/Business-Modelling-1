import java.util.ArrayList;

public class Printer 
{
	private String printerID;
	private float tonerLevel;
	private int paperLeft;
	private  ArrayList<PrintJob> printQueue;
	
	public Printer(String printerID, float tonerLevel, int paperLeft, ArrayList<PrintJob> printQueue) 
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
