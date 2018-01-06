package com.cg.day2.lesson4;

public class FstDemo {

	// instance variable or global variable for that class
	private final int num1;
	String name;
	protected float price;
	public String address;
	
public void disp(){
	
	final int CTR=0;// local variable
	CTR=90;
	System.out.print(num1+" "+name+" "+price+" "+address+""+CTR);
	
}
public FstDemo() {
	// TODO Auto-generated constructor stub
num1=90;
}

public void show(){
	
	System.out.print(num1+" "+name+" "+price+" "+address);
	
}
	
	
}
