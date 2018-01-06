package com.cg.lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab4_2 {

	public static void main(String[] args) throws FileNotFoundException {
			
		Scanner sc= new Scanner(new File("C:/Users/ppallapothu/myfolder/numbers.txt"));		
		
		String[] s = sc.next().split(",");
		
		
		for(int i =0; i<s.length; i++)
		{
			if(i%2==0 && i!=0)
			{
				System.out.println(s[i]);
			}
		}
	
	}
}
