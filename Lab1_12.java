package com.cg.lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lab1_12 {
	
	Date formatDate(String d){
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		Date date = null;
		try {
			date = myFormat.parse(d);			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		int days, months, years;
		Scanner sc = new Scanner(System.in);
		Lab1_12 l = new Lab1_12();
		System.out.println("Enter first date in dd mm yyyy format: ");
		String firstDateString = sc.nextLine();
		System.out.println("Enter second date in dd mm yyyy format: ");
		String secondDateString = sc.nextLine();
		
		Date firstDate = l.formatDate(firstDateString);
		Date secondDate = l.formatDate(secondDateString);
		
		days = Math.abs(firstDate.getDay() - secondDate.getDay());
		months = Math.abs(firstDate.getMonth() - secondDate.getMonth());
		years = Math.abs(firstDate.getYear() - secondDate.getYear());
		
		System.out.println("Days = " + days + " Months = " + months + " Years = " + years);
		long endTime = System.currentTimeMillis();
		long diff = endTime - startTime;
		System.out.println("Total Execution time: " + diff);
		

	}

}
