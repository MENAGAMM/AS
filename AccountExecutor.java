package lab_2;

import java.util.Random;

public class AccountExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("Kathy");
		p1.setAge(20);
		
		Account acc1 = new Account();
		acc1.setAccHolder(p1);
		acc1.setBalance(3000);
		acc1.withdraw(2000);
		acc1.setAccNum(generateAccountNumber());
		
		
		System.out.println("Account Number: " + acc1.getAccNum());
		System.out.println("Account holder name: " + acc1.getAccHolder().getName());
		System.out.println("Account Holder age: " + acc1.getAccHolder().getAge());
		System.out.println("Account Balance: " + acc1.getBalance());
		
		System.out.println("--------------------------------");
		
		Person p2 = new Person();
		p2.setName("Smith");
		p2.setAge(22);
		
		Account acc2 = new Account();
		acc2.setAccHolder(p2);
		acc2.setBalance(2000);
		acc2.withdraw(2000);
		acc2.setAccNum(generateAccountNumber());
		
		System.out.println("Account Number: " + acc2.getAccNum());
		System.out.println("Account holder name: " + acc2.getAccHolder().getName());
		System.out.println("Account Holder age: " + acc2.getAccHolder().getAge());
		System.out.println("Account Balance: " + acc2.getBalance());
		
		

	}
	
	static int generateAccountNumber(){
		Random rand  = new Random();
		
		while(true){
			int num = rand.nextInt(999999999);
			if(num > 10000000){
				return num;
				
			}
		}
	}

}
