package Homework;

import java.util.Scanner;

public class pyramidOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = sc.nextInt();
		for(int i=0; i<number; i++) {
			for(int j=0; j<number; j++) {
				System.out.print((j<i)? " " : "*");
			}
			System.out.print("\n");
		}
	}

}
