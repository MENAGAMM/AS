package com.cg.std.service;

import java.util.HashSet;
import java.util.Set;

import com.cg.std.bean.Student;
public class StaticPrg {

	private static Set<Student> obj;
	
	
	static{
		obj=new HashSet<>();
		Student stud1=new Student("123","sam","24","9876543210","samraj@gmail.com");
		
		obj.add(stud1);
		stud1=new Student("124","raj","24","9876543210","jabbar@gmail.com");
		obj.add(stud1);
		
		
	}
	public static Set<Student> getObj() {
		return obj;
	}
	public static void setObj(Set<Student> obj) {
		StaticPrg.obj = obj;
	}
	// business methods
	
	public void addStudent(Student stud){
		obj.add(stud);
	}
	
	public int countTotStudents(){
		return obj.size();
	}
	
	
	
}
