package com.cg.std.service;
import com.cg.std.pl.StudentMain;
import com.cg.std.excp.StudentException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentValidator {
	
	public boolean isValidName(String std_name) throws StudentException
	{
		boolean flag=false;
		
		Pattern pat_name=Pattern.compile("^[A-Z]{3,10}$");
		Matcher mat_name=pat_name.matcher(std_name);
		if(!mat_name.find())
		{
			throw new StudentException("please enter name correctly");
		}
		return flag;
	}
	public boolean isValidRollNumber(String std_roll_number) throws StudentException
	{
		boolean flag=false;
		
		Pattern pat_roll=Pattern.compile("^[0-9]{3}$");
		Matcher mat_roll=pat_roll.matcher(std_roll_number);
		if(!mat_roll.find())
		{
			throw new StudentException("please enter roll number in valid format");
		}
		return flag;
	}
	public boolean isValidAge(String std_age) throws StudentException
	{
		boolean flag=false;
		
		Pattern pat_age=Pattern.compile("^[0-9]{2}$");
		Matcher mat_age=pat_age.matcher(std_age);
		if(!mat_age.find())
		{
			throw new StudentException("please enter age in digits");
		}
		return flag;
	}
	public boolean isValidNumber(String std_number) throws StudentException
	{
		boolean flag=false;
		
		Pattern pat_number=Pattern.compile("^[7-9][0-9]{9}$");
		Matcher mat_number=pat_number.matcher(std_number);
		if(!mat_number.find())
		{
			throw new StudentException("please enter valid phone number format");
		}
		return flag;
	}
	public boolean isValidEmail(String std_email) throws StudentException
	{
		boolean flag=false;
		
		Pattern pat_email=Pattern.compile("^[a-z0-9]{2,20}@[a-z]{3,5}.[a-z]{2,3}$");
		Matcher mat_email=pat_email.matcher(std_email);
		if(!mat_email.find())
		{
			throw new StudentException("please enter valid email id format");
		}
		return flag;
	}
	

}
