package Homework;

import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an integer:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i=number; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print(j+ " ");
			}
			for(int j=2; j<=i; j++ ) {
				System.out.print(j+ " ");
			}
			System.out.print("\n");
		}
		sc.close();
	}

}
