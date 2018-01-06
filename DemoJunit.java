package Com.capgemini.lab5;

public class DemoJunit {
	
	private String firstName;
	private String lastName;
	public DemoJunit(String fname,String lname)
	{
	if(fname == null &&lname==null){
	throw new IllegalArgumentException("Both Names Cannot be NULL");
	}
	this.firstName = fname;
	this.lastName = lname;
	}
	public String getFullName()
	{
	String first=(this.firstName != null)? this.firstName:"?";
	String last=(this.lastName != null)? this.lastName:"?";
	return first + " " + last;
	}
	public String getFirstName(){
	return this.firstName;
	}
	public String getLastName(){
	return this.lastName;
	}
	public static void main(String args[])
	{
		DemoJunit p=new DemoJunit("a","b");
	System.out.println(p.getFullName());
	}


}
