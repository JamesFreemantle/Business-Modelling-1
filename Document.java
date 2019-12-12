
public class Document 
{
	private int docID;
	private String filename;
	private int sizeMB;
	private int pages;
	
	public Document(int ID, String filename, int sizeMB, int pages) 
	{
		this.docID=c;
		this.filename=filename;
		this.sizeMB=sizeMB;
		this.pages=pages;
	}
	public int getpages()
	{
		return pages;
	}
	public int getDocID()
	{
		return docID = docID+1;
	}
	public float getSizeMB()
	{
		return pages/5;
	}
	public String toString()
	{	
		return "docID: " + this.docID + ", filename: " + this.filename + ", Size: " + this.sizeMB
				+ ", pages: "+pages;
	}
	
}
