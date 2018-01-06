package com.cg.day2.lesson4;

public class SecondDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*System.out.print(new FstDemo().name);// Anonymous object creation statement
	System.out.print(new FstDemo().num1);
	System.out.print(new FstDemo().price);// Anonymous object creation statement
	System.out.print(new FstDemo().address);
	*/
	// Reference addresss not value
		FstDemo obj =new FstDemo();
	
	System.out.print(obj.num1+" "+obj.name+" "+obj.price+" "+obj.address);
	
	}

}
