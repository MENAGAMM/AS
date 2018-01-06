package com.cg.eis.service;

import com.cg.eis.exception.EmployeeException;

public class EmployeeServices implements EmployeeService {

	@Override
	public String getEmployeeInsuranceScheme(int salary, String desig) throws EmployeeException {
		String isc = null;

		if(salary<=3000)
			throw new EmployeeException("Salary must be more than 3000");
		if ((salary > 5000 && salary < 20000)
				&& desig.equalsIgnoreCase("System Associate")) {

			isc = "Scheme A";

		}

		if (salary >= 20000 && salary < 40000
				&& desig.equalsIgnoreCase("Programmer")) {
			isc = "Scheme B";
		}

		if (salary >= 40000 && desig.equalsIgnoreCase("Manager")) {
			isc = "Scheme C";
		}

		if (salary <= 5000 && desig.equalsIgnoreCase("Clerk")) {
			isc = "No Scheme";
		}
		return isc;
	}

	@Override
	public String getEmployeeInsuranceScheme() {
		// TODO Auto-generated method stub
		return null;
	}

}
