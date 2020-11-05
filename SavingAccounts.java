package ObjectOrientedProgramming;

public class SavingAccounts {
	public double balance;
	public double interestRate;
	public String name;
	
	public void displayCustomer() {
		System.out.println("Customer: " + name);
	}
	public void deposit(double x) {
		balance+=x;
	}
	public void withdraw (double x) {
		if(x>balance || x<=0) {
			System.out.println("You can't do this withdraw.");
		}
		else {
			balance-=x;
			System.out.println("New balance is "+balance);
		}
	}
}
