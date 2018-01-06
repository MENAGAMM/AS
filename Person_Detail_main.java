package com.cg;

public class Person_Detail_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PERSON DETAILS");
		System.out.println("-------------------------");
		
		Person_Detail p= new Person_Detail();
		p.FirstName="Divya";
		p.LastName="Bharti";
		p.Gender="F";
		p.age=20;
		p.weight=85.23;
		p.detail();
	}

}
