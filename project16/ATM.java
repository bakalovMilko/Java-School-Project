package project16;

import java.util.Scanner;

import ObjectOrientedProgramming.Account;

public class ATM {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account[] accounts = new Account[10];
		for(int i=0; i<10; i++) {
			accounts[i] = new Account(i, 100);
		}
		boolean turnOn=true;
		while(turnOn) {
			System.out.println("Enter an id: ");
			int id=sc.nextInt();
			if(id<0 || id>9) System.out.println("Incorrect id.");
			else {
				boolean exit = false;
				while(!exit) {
					System.out.println("Main menu \n 1.check balance \n 2.withdraw\n 3.deposit \n 4.exit");
					System.out.println("Enter a choice: ");
					int choice = sc.nextInt();
					if(choice<1 || choice>4) System.out.println("Error.");
					else if(choice==1) System.out.println("Current balance is " + accounts[id].getBalance());
					else if(choice==2) {
						System.out.println("Enter withdraw: ");
						accounts[id].withdraw(sc.nextDouble());
					}
					else if(choice==3) {
						System.out.println("Enter deposit: ");
						accounts[id].deposit(sc.nextDouble());
					}
					else exit=true;
				}
			}
		}
	}

}
