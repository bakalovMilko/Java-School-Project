package ObjectOrientedProgramming;

public class AcountTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a0001 = new Account(1122, 20000);
		Account.setInterestRate(0.045);
		a0001.withdraw(2500);
		a0001.deposit(3000);
		System.out.println("Current Balance: "+a0001.getBalance() + 
				"\nMonthly interest rate: "+ Account.getMonthlyInterestRate() + 
				"\nDate created: " + a0001.getDateCreated().toString());
	}

}
