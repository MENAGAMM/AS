package lab1;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class CalDuration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Enter date:");
		String input=sc.next();
		LocalDate enteredDate = LocalDate.parse(input,formatter);
		LocalDate end = LocalDate.now();
		
		Period period = enteredDate.until(end);
		
		System.out.println("Days:"+ period.getDays());
		System.out.println("Months:"+period.getMonths());
		System.out.println("Years:"+ period.getYears());

	}

}
