package Homework;

import java.util.Scanner;

public class paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the room");
		double height = sc.nextDouble();
		System.out.println("Enter the lenght of the room");
		double lenght = sc.nextDouble();
		System.out.println("Enter the width of the room");
		double width = sc.nextDouble();
		double area = 2*height*lenght + 2*height*width + lenght*width;
		int answer = 15*(int)(area/140) + 4*(-(int)(-area/30));
	}

}

