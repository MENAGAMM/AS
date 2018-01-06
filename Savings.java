package lab_2;

public class Savings extends AccountClass{
		
	final double minimumBalance = 1000;
		
	@Override
	void withdraw(double amount) {
		
		double balance  = super.getBalance();
		if(amount < minimumBalance){
			System.out.println("Withdraw amount should be higher than " + minimumBalance);
		}else{
			balance = balance - amount;
			System.out.println("Amount Withdrawn: " + amount);
			super.setBalance(balance);
		}
	}
	

}


