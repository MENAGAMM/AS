package com.cg.lab1;

import java.util.Scanner;

public class Lab1_10 {
	
	boolean isPositive(String str){
		boolean flag = false;
		int i, currentElement, nextElement;
		for(i=0; i<str.length()-1; i++){
			currentElement = str.charAt(i);
			nextElement = str.charAt(i+1);
			if(nextElement < currentElement){
				flag = false;
				break;
			}else{
				flag = true;
			}
		}
		return flag;		
		
	}
	
	public static void main(String[] args) {
		Lab1_10 l = new Lab1_10();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.next();
		System.out.println("Result = " + l.isPositive(str));
	}

}
