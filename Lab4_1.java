package com.cg.lab;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab4_1 {

	public static void main(String[] args) {
		
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try{
			
			fr=new FileReader("C:/Users/ppallapothu/myfolder/myfile.txt");
			br=new BufferedReader(fr);
			String str=null;
			
			str = br.readLine();
			StringBuffer st = new StringBuffer();
			
			st.append(str);
			
			st.reverse();
			
			str = st.toString();
			
			fw=new FileWriter("C:/Users/ppallapothu/myfolder/myfile.txt");
			
			bw = new  BufferedWriter(fw);
			
			bw.write(str);
			
		}
		catch(Exception e){
			
			
			}
		finally{
				try{
					fr.close();
					br.close();
					bw.close();
					fw.close();
				}catch(IOException e){
					e.printStackTrace();
					
				}
				
			}
		
	}
}
		

	


