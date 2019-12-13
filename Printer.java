
import java.util.ArrayList;

public class Printer 
{
	private int printerID;
	private float tonerLevel;
	private int paperLeft;
	public ArrayList<PrintJob> printQueue = new ArrayList<PrintJob>();
	
	public Printer(int printerID) 
	{
		this.printerID=printerID;
		this.tonerLevel=100;
		this.paperLeft=500;
	}
	public ArrayList<PrintJob> getQueue()
	{
		return printQueue;
	}

	public boolean canPrint(PrintJob printJob)
	{
		if (paperLeft>printJob.getFile().getpages())
		{
			if (tonerLevel>printJob.getFile().getpages()/50)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	public int getprinterID()
	{
		return printerID;
	}
	public void lowerLevels(Document doc)
	{
		tonerLevel = tonerLevel - doc.getpages();
		paperLeft = paperLeft - doc.getpages();
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