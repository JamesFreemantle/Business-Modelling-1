import java.util.ArrayList;

public class Printer 
{
	private int printerID;
	private float tonerLevel;
	private int paperLeft;
	public ArrayList<PrintJob> printQueue = new ArrayList<PrintJob>();
	
	public Printer(int printerID, int tonerLevel, int paperLeft) 
	{
		this.printerID=printerID;
		this.tonerLevel=100;
		this.paperLeft=50;
		this.printQueue = printQueue;
	}
	public ArrayList<PrintJob> getQueue()
	{
		return printQueue;
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
