package project18;

public class Rectangle extends GeometricObject {
	private double length;
	private double width;
	
	Rectangle(String color, double length, double width){
		super(color);
		this.length=length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return 2*(length+width);
	}
	
}
