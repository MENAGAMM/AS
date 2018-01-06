package com.cg.std.pl;

import java.util.Scanner;
import com.cg.std.bean.Student;
import com.cg.std.excp.StudentException;
import com.cg.std.service.StudentStatic;
import com.cg.std.service.StudentValidator;


public class StudentMain {
	Scanner scan=new Scanner(System.in);
	
	StudentValidator stdval=new StudentValidator();
	static StudentStatic st=new StudentStatic();
	

	public void menu()
	{
		int ch = 0;
		try
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("1.To add new Stduent Details");
		System.out.println("2.To see the details of students");
		System.out.println("3.To count numbers of students");
		System.out.println("");
		System.out.println("Enter your choice : ");
		 ch=scan.nextInt();
		switch (ch)
		{
		case 1:
				new StudentMain().acceptStudentDetails();
			break;
		case 2:
			new StudentStatic().displayStudentDetails();
			break;
			
		case 3:
			System.out.println("Count is "+st.countToStudents());
			break;
			
		case 4:
			System.err.println("Please enter the correct choice");
			menu();
		}
		}
		catch(StudentException exp)
		{
			System.err.println(exp.getMessage());
		}
		System.out.println("---------------------------------");
		if(ch>=5 || ch==0 || ch<0 )
		{
		System.err.println("Please enter the correct choice");
		menu();
		}
		else
		{
		
		}
		

	}

	public static void main(String[] args) throws StudentException  {
		
		StudentMain sm=new StudentMain();
		sm.menu();
		
	}

	public void acceptStudentDetails() throws StudentException
	{
		
		String std_name=acceptName();
		String std_roll_number=acceptRoll();
		String std_age=acceptAge();
		String std_number=acceptNumber();
		String std_email=acceptEmail();
		
		Student std=new Student(std_name, std_roll_number, std_age, std_number,std_email);

		st.addStudent(std);
		System.out.println("Student details added successfully");
		menu();
	}	

	public String acceptName()
	{
		String std_name = null;
		try
		{
		System.out.println("Enter Student Name :");
		std_name=scan.next();
		stdval.isValidName(std_name);
		}
		catch(StudentException exp)
		{
			System.err.println(exp.getMessage());
			acceptName();
		}
		return std_name;
	}
	public String acceptRoll()
	{
		String std_roll_number=null;
		
		try
		{
			System.out.println("Enter Student Roll Number :");
		     std_roll_number=scan.next();
			stdval.isValidRollNumber(std_roll_number);
		}
		catch(StudentException exp)
		{
			System.err.println(exp.getMessage());
			acceptRoll();
		}
		 return std_roll_number;
	}  
	public String acceptAge()
	{
		String std_age=null;
		try
		{
			System.out.println("Enter Student Age :");
			std_age=scan.next();
			stdval.isValidAge(std_age);
			
		}
		catch(StudentException exp)
		{
			System.err.println(exp.getMessage());
			acceptAge();
		}
		
		return std_age;
	}
	public String acceptNumber()
	{
		String std_number=null;
		try
		{
			
			System.out.println("Enter Student Phone Number :");
			std_number=scan.next();
			stdval.isValidNumber(std_number);
		}
		catch(StudentException exp)
		{
			System.err.println(exp.getMessage());
			acceptNumber();
		}
		return std_number;
	}
	public String acceptEmail()
	{
		String std_email=null;
		try
		{
			System.out.println("Enter Student Email :");
			std_email=scan.next();
			stdval.isValidEmail(std_email);
			
		}
		catch(StudentException exp)
		{
			System.err.println(exp.getMessage());
			acceptEmail();
		}
		return std_email;
	}
	

}
