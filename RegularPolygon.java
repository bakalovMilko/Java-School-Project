package ObjectOrientedProgramming;

public class RegularPolygon {
	private int n = 3;
	private double sideLength = 1;
	private double x = 0;
	private double y = 0;
	
	RegularPolygon(){
		
	}
	RegularPolygon(int n, double sideLength){
		this.n=n;
		this.sideLength=sideLength;
	}
	RegularPolygon(int n, double sideLength, double x, double y){
		this.n=n;
		this.sideLength=sideLength;
		this.x=x;
		this.y=y;
	}
	
	public void setN(int newN) {
		n=newN;
	}
	public int getN() {
		return n;
	}
	public void setSideLength(double newSideLength) {
		sideLength=newSideLength;
	}
	public double getSideLength() {
		return sideLength;
	}
	public void setX(double newX) {
		x=newX;
	}
	public double getX() {
		return x;
	}
	public void setY(double newY) {
		y=newY;
	}
	public double getY() {
		return y;
	}
	
	public double getPerimeter() {
		return (int)(n*sideLength*100)/100.0;
	}
	public double getArea() {
		return (int)((n*sideLength*sideLength)/(4*Math.tan(Math.PI/n))*100)/100.0;
	}
}
