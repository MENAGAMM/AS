package lab1_13;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Product {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		String inputString1 = "03 01 2018";
		int month = 8;
		int year = 3;

		try {
		    Date date1 = myFormat.parse(inputString1);
		  
		     date1.setMonth(date1.getMonth()+month) ;
		     date1.setYear(date1.getYear()+year);
		 
		    System.out.println ("Days: " + date1);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		
		
	}
}


