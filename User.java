
public class User 
{
	private String ID;
	private String name;
	private String email;
	
	public User(String ID, String name, String email) 
	{
		this.ID=ID;
		this.name=name;
		this.email =email;
	}
	public String toString()
	{	
		return "ID: " + this.ID + ", Name: " + this.name + ", Email:" + this.email;
	}
}
