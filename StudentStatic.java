package com.cg.std.service;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.cg.std.bean.Student;

public class StudentStatic {

	private static Set<Student> obj;
	static{
		obj=new HashSet<>();
		Student stud1=new Student("Ajaykumar","101","21","7666615638","ajaykumar@cg.com");
		obj.add(stud1);
		stud1=new Student("Jabbar","102","20","7021919707","jabbar@cg.com");
		obj.add(stud1);

}
	public static Set<Student> getObj() {
		return obj;
	}
	public static void setObj(Set<Student> obj) {
		StudentStatic.obj = obj;
	}
	public int countToStudents(){
		return obj.size();
	}

	public void addStudent(Student std)
	{
		obj.add(std);
	}
	
	
	
	public void displayStudentDetails()
	{
		
		Student std=new Student();
		//Iterator itr=obj.iterator();
		//while(itr.hasNext())
		
		for(Object val:obj)
		{
			std=(Student)val;
		System.out.println(std.toString());
		}
		
	}
	
}
