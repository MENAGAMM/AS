package com.cg.lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lab1_11 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days, months, year;
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		Date currentDate = new Date();
		System.out.println("Enter date in dd mm yyyy format");
		String date = sc.nextLine();
		Date d;
		try {
			d = myFormat.parse(date);
			//System.out.println(d);
			days = Math.abs(d.getDay() - currentDate.getDay());
			months = Math.abs(d.getMonth() - currentDate.getMonth());
			year = Math.abs(d.getYear() - currentDate.getYear());
			
			System.out.println("Day= " + days + " Months= " + months + "Years = " + year );
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
