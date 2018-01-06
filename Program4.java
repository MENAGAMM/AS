package com.program4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;




public class Program4 {

		
public static List<Details> detailsList = new ArrayList<Details>();
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		Details d =new Details();
		d.setName("abc");
		d.setAge(21);
		
		Details d1 = new Details();
		d1.setName("xyz");
		d1.setAge(22);
		Details d2  =new Details();
		d2.setName("def");
		d2.setAge(23);
		
		detailsList.add(d);
		detailsList.add(d1);
		detailsList.add(d2);
		
		try{
			fos  = new FileOutputStream("D:/mydata.obj");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(oos);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			try{
				fos.close();
				oos.close();				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}

}