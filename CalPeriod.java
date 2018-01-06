package lab1;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class CallPeriod {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Enter date1:");
		String date1=sc.next();
		LocalDate start = LocalDate.parse(date1,formatter);
		System.out.println("Enter date2:");
		String date2=sc.next();
		LocalDate end = LocalDate.parse(date2,formatter);
		
		Period period = start.until(end);
		
		System.out.println("Days:"+ period.getDays());
		System.out.println("Months:"+period.getMonths());
		System.out.println("Years:"+ period.getYears());

	
	}

}
