package lab_2;

import java.util.Random;

public class Account {
	private int accNum;
	private double balance;
	private Person accHolder;
	
	public int getAccNum() {
		return accNum;
	}
	
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Person getAccHolder() {
		return accHolder;
	}
	
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	void deposit(double amount){
		balance = balance + amount;
		
	}
	
	void withdraw(double amount){
		if(amount > balance){
			System.out.println("Balance Insufficient");
		}else{
			balance = balance - amount;
			System.out.println("Amount Withdrawn: " + amount);
		}
		
	}
	
	
	
	
	
}
