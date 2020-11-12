package ObjectOrientedProgramming;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private static double yearInterestRate=0;
	private Date dateCreated = new Date();
	
	Account(){
		
	}
	Account(int id, double balance){
		this.setId(id);
		this.setBalance(balance);
	}
	
	public void setId(int newId) {
		id=newId;
	}
	public int getId() {
		return id;
	}
	public void setBalance (double newBalance) {
		balance=newBalance;
	}
	public double getBalance() {
		return balance;
	}
	public static void setInterestRate(double newInterestRate) {
		yearInterestRate = newInterestRate;
	}
	public static double getInterestRate() {
		return yearInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public static double getMonthlyInterestRate() {
		return yearInterestRate/12;
	}
	public double getMonthlyInterest() {
		return balance*Account.getMonthlyInterestRate();
	}
	public void deposit(double deposit) {
		if(deposit>=0) {
			balance+=deposit;
		}
		else System.out.println("You are not allowed to deposit "+deposit);
	}
	public void withdraw(double withdraw) {
		if(withdraw>=0 && withdraw<=balance) {
			balance-=withdraw;
		}
		else System.out.println("You are not allowed to deposit "+withdraw);
	}
}
