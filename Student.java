package com.cg.std.bean;

public class Student {
	

	private String student_id;
	private String student_name;
	private String student_age;
	private String student_phone_number;
	private String student_email;
	
	
	
	public Student(String student_id, String student_name, String student_age,
			String student_phone_number, String student_email) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_age = student_age;
		this.student_phone_number = student_phone_number;
		this.student_email = student_email;
	}
	
	
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name="
				+ student_name + ", student_age=" + student_age
				+ ", student_phone_number=" + student_phone_number
				+ ", student_email=" + student_email + "]";
	}
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
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
