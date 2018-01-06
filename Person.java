
public class Person 
{
private String firstName,lastName,phoneNumber;
public String gender;

	
	Person()
	{
		
	}
	Person(String firstName, String lastName, String gender, String phoneNumber)
	{
	
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	//public String getGender() {
		//return gender;
	//}
	//public void setGender(String gender) {
		
	
	
		void display()
	{
		System.out.println("First Name: " +getFirstName());
		System.out.println("Last Name: " +getLastName());
		System.out.println("Gender: " +gender);
		System.out.println("Phone number: " +getPhoneNumber());
	}
}

