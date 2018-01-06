package com.cg.day2.pkg1;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentInfo stud = new StudentInfo();
		int age=stud.getAge();
		System.out.println(age);
		stud.setAge(23);
		System.out.println(stud.getAge());
		
		StudentInfo obj1= new StudentInfo(12);
		System.out.println(obj1.getAge());
		
		System.out.println(stud==obj1);
		System.out.println(stud.equals(obj1));
		
		
		String nl="66";
		System.out.println(Integer.parseInt(nl)+8);
		
		
	}

}
