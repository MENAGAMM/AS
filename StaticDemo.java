package com.cg.day2.lesson4.staticprg;

public class StaticDemo {

	public static int num1;
	int num2;
	public static int ctr;
	
	
	
	public StaticDemo() {
		
		ctr++;
	}

	static{
		System.out.println(num1+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(num1+" "+new StaticDemo().num2+" "+new StaticDemo().ctr);
		//new StaticDemo();
	System.out.println(new StaticDemo().ctr);
	//new StaticDemo();
	System.out.println(new StaticDemo().ctr);
	}
	
	void show(){
		System.out.println(num1+" "+num2);
	}

}
