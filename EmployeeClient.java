package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeServices;

public class EmployeeClient {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws EmployeeException {
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter salary: ");
		int salary = sc.nextInt();
		System.out.println("Enter designation: ");
		sc.nextLine();
		String desig = sc.nextLine();

		EmployeeServices es = new EmployeeServices();
		System.out.println(es.getEmployeeInsuranceScheme(salary, desig));

	}

}
