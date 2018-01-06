package com.cg.day3.lesson10;

import java.util.Arrays;

public class DecalreWithDefineArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= new String[]{
			"red","blue"
		};
		Arrays.sort(names);
		for(String val:names){
			System.out.println(val);
		}
		
		
	}

}
