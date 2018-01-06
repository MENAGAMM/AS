package com.cg.std.bean;

public class Student {

	@Override
	public String toString() {
		return "Student [student_name=" + student_name
				+ ", student_roll_number=" + student_roll_number
				+ ", student_age=" + student_age + ", student_phone_number="
				+ student_phone_number + ", student_email=" + student_email
				+ "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String student_name;
	private String student_roll_number;
	private String student_age;
	private String student_phone_number;
	private String student_email;
	
	public Student(String student_name, String student_roll_number,
			String student_age, String student_phone_number,
			String student_email) {
		super();
		this.student_name = student_name;
		this.student_roll_number = student_roll_number;
		this.student_age = student_age;
		this.student_phone_number = student_phone_number;
		this.student_email = student_email;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_roll_number() {
		return student_roll_number;
	}
	public void setStudent_roll_number(String student_roll_number) {
		this.student_roll_number = student_roll_number;
	}
	public String getStudent_age() {
		return student_age;
	}
	public void setStudent_age(String student_age) {
		this.student_age = student_age;
	}
	public String getStudent_phone_number() {
		return student_phone_number;
	}
	public void setStudent_phone_number(String student_phone_number) {
		this.student_phone_number = student_phone_number;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	
}
