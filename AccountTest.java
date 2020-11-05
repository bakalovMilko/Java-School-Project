package ObjectOrientedProgramming;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SavingAccounts s0001 = new SavingAccounts();
		s0001.name="pesho";
		s0001.balance=1000;
		s0001.interestRate=0.01;
		System.out.println("Enter a withdraw sum:");
		s0001.withdraw(sc.nextDouble());
	}

}
