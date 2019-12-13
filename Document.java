
public class Document 
{
	private String docID;
	private String filename;
	private float sizeMB;
	private int pages;
	
	public Document(String docID, String filename, float sizeMB, int pages) 
	{
		this.docID=docID;
		this.filename=filename;
		this.sizeMB=sizeMB;
		this.pages=pages;
	}
	public int getpages()
	{
		return pages;
	}
	public String getDocID()
	{
		return docID;
	}
	public float getSizeMB()
	{
		return pages/5;
	}
	public String toString()
	{	
		return "DocID: " + this.docID + ", Filename: " + this.filename + ", Size: " + this.sizeMB
				+ ", pages: "+pages;
	}
	
}