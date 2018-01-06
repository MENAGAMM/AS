package com.capgemini.lab5.jUnit;

import static org.testng.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.lab5.Employee;
import com.capgemini.lab5.exception.EmployeeException;

public class EmployeeExceptionCheck {
	
	Employee emp ;
	
	@Before
	public void doSetUp(){
		emp = new Employee();
	}
	
	@Test
	public void testEmployeeException() throws EmployeeException{
		
		try {
			emp.setSalary(2500);
		} catch (EmployeeException e) {
			e.equals("Salary cannot be lesser then 3000");
			
		}
	}
	
	@Test
	public void negativeTestEmployeeException() throws EmployeeException{
		
		emp.setSalary(5000);
		assertEquals((int)emp.getSalary(), 5000);
	}

}
