package com.cg.std.pl;

import com.cg.std.bean.Student;
import com.cg.std.exception.StudentException;
import com.cg.std.service.StaticPrg;
import com.cg.std.service.StudentValidater;

import java.util.Scanner;

public class MainPrg {
	static Scanner scan= new Scanner(System.in);
	StudentValidater val = new StudentValidater();
	static StaticPrg obj = new StaticPrg();
	static MainPrg mainobj = new MainPrg();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainobj.menu();
		

		//System.out.println(obj.countTotStudents());
	
	//obj.addStudent(new Student(1,"ds"));
	//System.out.println(obj.countTotStudents());
	
	}

	public void menu(){
try{
	
	//switch case
	System.out.println("Enter your choice (1 , 2 , 3)");
	System.out.println("1. Add a new student");
	System.out.println("2. Show total number ");
	System.out.println("3. Exit");
	String ch = scan.next();
	switch(ch){
	case "1":
		mainobj.acceptStudent();
		mainobj.menu();
		break;
		
	case "2":
		System.out.println(obj.countTotStudents());
		mainobj.menu();
		break;
		
	case "3":
		
	    break;
	    
	default:
		System.out.println("enter a valid choice"); 		
		mainobj.menu();
		    
			
	}
}catch(StudentException exp){

System.err.println(exp.getMessage());
}
	}
	
	public void acceptStudent() throws StudentException {
		
		
				
      /*private String student_id;
		private String student_name;
		private String student_age;
		private String student_phone_number;
		private String student_email;*/
		String std_id = acceptStudentId();
		String std_name = acceptStudentName();
		String std_age = acceptStudentAge();
		String std_Mob_Num = acceptStudentMobNum();
		String std_email = acceptStudentEmail();
		// call validate method after data accept from user

		//----
		Student  std = new Student(std_id, std_name, std_age, std_Mob_Num, std_email);
		//Student stud=new Student(roll, name);
		
		new StaticPrg().addStudent(std);
	}
    
	public String acceptStudentId() throws StudentException{
	
		String std_id = null;
		
	try{
		System.out.println("Enter Student Id:");
		std_id=scan.next();
		val.isStdIdValid(std_id);
		
	}
	catch(StudentException exp){
		
		System.err.println(exp.getMessage());
		acceptStudentId();
	}
	return std_id;
	}

	public String acceptStudentName() throws StudentException {
		String std_name= null;
	try{
		System.out.println("Enter Student name:");
		std_name=scan.next();
		val.isStdNameValid(std_name);
	}
	catch(StudentException exp){
		
		System.err.println(exp.getMessage());
		acceptStudentName();
	}
	return std_name;
	}

	public String acceptStudentAge() throws StudentException{
		String std_age = null;
	try{
		System.out.println("Enter Student age:");
		std_age=scan.next();
		val.isStdAgeValid(std_age);
	}
	catch(StudentException exp){
		
		System.err.println(exp.getMessage());
		acceptStudentAge();
	}
	return std_age;
	}

	public String acceptStudentMobNum() throws StudentException{
		
		String std_Mob_Num = null;
		
		try{
			System.out.println("Enter Student phone number:");
			std_Mob_Num=scan.next();
			val.isStdMobNumValid(std_Mob_Num);
		}
		catch(StudentException exp){
			
			System.err.println(exp.getMessage());
			acceptStudentMobNum();
		}
		return std_Mob_Num;
		}

	public String acceptStudentEmail() throws StudentException{
		
		String std_email = null;
		
		try{
			System.out.println("Enter Student email id:");
			std_email=scan.next();
			val.isStdEmailValid(std_email);
		}
		catch(StudentException exp){
			
			System.err.println(exp.getMessage());
			acceptStudentEmail();
		}
		return std_email;
		}
}
