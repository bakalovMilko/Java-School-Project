package project18;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first side of the triangle:");
		double side1 = sc.nextDouble();
		System.out.print("Enter the second side of the triangle:");
		double side2 = sc.nextDouble();
		System.out.print("Enter the third side of the triangle:");
		double side3 = sc.nextDouble();
		System.out.println("Enter if the triangle is filled or not: ");
		boolean filled = (sc.next().compareTo("yes")==0)? true : false;
		Triangle a;
		if(filled) {
			System.out.println("Enter the color of the triangle:");
			String color = sc.next();
			a = new Triangle(side1, side2, side3, color);
		}
		else {
			a = new Triangle(side1, side2, side3);
		}
		System.out.print(a.printRectangle() + " area: " + a.getArea() +
				" perimeter: " + a.getPerimeter() + " color: "+a.getColor());
		if(filled) {
			System.out.println(", filled");
		}
	}

}
