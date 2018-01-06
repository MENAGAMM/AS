import java.util.Scanner;


public class Number {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a number:");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		if(a<0)
			System.out.println("Number is negative");
		else
			System.out.println("Number is positive");
	}

}
