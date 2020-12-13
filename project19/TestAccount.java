package project19;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account gosho = new Account(1, 200);
		gosho.withdraw(50);
		gosho.deposit(60);
		System.out.println(gosho.toString());
		
		SavingsAccount pesho = new SavingsAccount(2, 200);
		pesho.withdraw(50);
		pesho.withdraw(160);
		pesho.deposit(60);
		System.out.println(pesho.toString());
		
		CheckingAccount misho = new CheckingAccount(3, 200, 50);
		misho.withdraw(220);
		misho.withdraw(50);
		misho.deposit(50);
		System.out.println(misho.toString());
	}

}
