package ObjectOrientedProgramming;

public class Circle {
	private double radius=1;
	
	Circle(){
		
	}
	Circle(double radius){
		this.radius=radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	public void setRadius (double newRadius) {
		radius=newRadius;
	}
	public double getRadius() {
		return radius;
	}
}
