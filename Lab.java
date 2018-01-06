import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Lab {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		String inputString1 = "08 11 2017";
		int month = 5;
		int year = 2;

		try {
		    Date date1 = myFormat.parse(inputString1);
		    //Date date2 = myFormat.parse(inputString2);
		     date1.setMonth(date1.getMonth()+month) ;
		     date1.setYear(date1.getYear()+year);
		    //Date sumDate = new Date(diff);
		    System.out.println ("Days: " + date1);
		} catch (ParseException e) {
		    e.printStackTrace();
		}
		
		
	}}


