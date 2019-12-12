
public class Document 
{
	private String docID;
	private String filename;
	private int sizeMB;
	private int pages;
	
	public Document(String docID, String filename, int sizeMB, int pages) 
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
	public String toString()
	{	
		return "docID: " + this.docID + ", filename: " + this.filename + ", Size: " + this.sizeMB
				+ ", pages: "+pages;
	}
	
}
