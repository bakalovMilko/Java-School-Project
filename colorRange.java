package Homework;

import java.util.Scanner;

public class colorRange {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a color code");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.println(x);
		sc.close();
		if(x >= 380 && x < 450) System.out.println("The color is Violet");
		else if(x > 450 && x < 495) System.out.println("The color is Blue");
		else if(x >= 495 && x < 570) System.out.println("The color is Green");
		else if(x >= 570 && x < 590) System.out.println("The color is Yellow");
		else if(x >= 590 && x < 620) System.out.println("The color is Orange");
		else if(x >= 620 && x < 750) System.out.println("The color is Red");
		else System.out.println("The entered lenght is not part of the visible spectrum");
	}

}
