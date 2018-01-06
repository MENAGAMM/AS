
public class ValidateAge {
	public void Personinit(String name,float age)
	{
		try
		{
		if(age<15)
			throw new Excepthrow("Age must be greater than 15");
		}
		catch(Excepthrow e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main()
	{
		ValidateAge obj=new ValidateAge();
		obj.Personinit("XYZ",11);
	}

}
