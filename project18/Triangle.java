package project18;

public class Triangle extends GeometricObject {
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	Triangle(){
		
	}
	Triangle(double side1, double side2, double side3, String color){
		super(color);
		this.setSides(side1, side2, side3);
	}
	Triangle(double side1, double side2, double side3){
		this.setSides(side1, side2, side3);
	}
	
	private void setSides(double side1, double side2, double side3) {
		if(side1+side2<=side3 ||side1+side3<=side2 || side3+side2<=side1) {
			System.out.println("This input is not valid, sides are not changed.");
		}
		else {
			this.setSide1(side1);
			this.setSide2(side2);
			this.setSide3(side3);
		}
	}
	public double getSide1() {
		return side1;
	}
	private void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	private void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	private void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea() {
		double area = Math.pow((side1+side2+side3)*(side1+side2-side3)*(side1-side2+side3)*(-side1+side2+side3), 0.5)/4;
		return (int)(area*100)/100.0;
	}
	public double getPerimeter() {
		return side1+side2+side3;
	}
	public String printRectangle() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
