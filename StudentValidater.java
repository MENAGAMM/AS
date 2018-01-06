package com.cg.std.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.cg.std.exception.StudentException;



public class StudentValidater {

	
	// implement each validateMethod
	public boolean isStdIdValid(String std_id)throws StudentException{
		boolean flag=false;

		
		Pattern pat = Pattern.compile("^[0-9]{2,5}$");
		Matcher mat= pat.matcher(std_id);
		if(!mat.find()){
			
			throw new StudentException("Sorry Your data is not in digit format");
			
		}
		
		return flag;

	}
	
	
	public boolean isStdNameValid(String std_name)throws StudentException{
		boolean flag=false;

		
		Pattern pat = Pattern.compile("^[A-Za-z]{2,15}$");
		Matcher mat= pat.matcher(std_name);
		if(!mat.find()){
			
			throw new StudentException("Sorry name should be string type");
			
		}
		
		return flag;

	}
	
	public boolean isStdAgeValid(String std_age)throws StudentException{
		boolean flag=false;

		
		Pattern pat = Pattern.compile("^[0-9]{2}$");
		Matcher mat= pat.matcher(std_age);
		if(!mat.find()){
			
			throw new StudentException("Sorry Your data is not in digit format");
			
		}
		
		return flag;

	}
	
	public boolean isStdMobNumValid(String std_Mob_Num)throws StudentException{
		boolean flag=false;

		
		Pattern pat = Pattern.compile("^[7-9][0-9]{9}$");
		Matcher mat= pat.matcher(std_Mob_Num);
		if(!mat.find()){
			
			throw new StudentException("Sorry Your data is not in mobile number format");
			
		}
		
		return flag;

	}
	
	public boolean isStdEmailValid(String std_email)throws StudentException{
		boolean flag=false;

		
		Pattern pat = Pattern.compile("^[A-Za-z]{2,15}@[A-Za-z]{3,5}.[A-Za-z]{3}$");
		Matcher mat= pat.matcher(std_email);
		if(!mat.find()){
			
			throw new StudentException("Sorry Your data is not in Email id format");
			
		}
		
		return flag;

	}
}
