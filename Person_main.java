import java.util.Scanner;


public class Person_main {

	public static void main(String[] args) {
		Person abc= new Person();
		String gen;
		
		abc.setFirstName("Divya");
		abc.setLastName("Bharti");
		//abc.setGender("F");
		abc.setPhoneNumber("9874563215");
		
		
		System.out.println("Enter gender(M/F) : ");
		Scanner sc= new Scanner(System.in);		
		gen=sc.nextLine();
		if(gen.equals("M")|| gen.equals("F"))
			abc.gender=gen;
		else
			System.out.println("Please enter either M or F");
		abc.display();

	}

}
