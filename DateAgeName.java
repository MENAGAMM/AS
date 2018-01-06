package lab1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAgeName {
	
		
	private Scanner scanner;
	public void fullName(String fname,String lname)
	{
		System.out.println("Full name : "+fname+" "+lname);
	}
	
	public void age()
	{
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	scanner = new Scanner(System.in);
	System.out.println("Enter date in dd/MM/yyyy format:");
	String dob  = scanner.nextLine();
	LocalDate enteredDate = LocalDate.parse(dob,formatter);
	LocalDate end = LocalDate.now();
	Period period = enteredDate.until(end);
	System.out.println("Age is:"+ period.getYears()+" years, "+period.getMonths()+" months, "+period.getDays()+" days");
	
	
	}
	public static void main(String[] args)
	{
		DateAgeName d=new DateAgeName();
		d.fullName("Ajaykumar","Yadav");
		d.age();

	}

}
