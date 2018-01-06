package com.cg.eis.service;

import com.cg.eis.exception.EmployeeException;

public interface EmployeeService {
	
	public String getEmployeeInsuranceScheme();

	String getEmployeeInsuranceScheme(int salary, String desig) throws EmployeeException;
		
	

}
