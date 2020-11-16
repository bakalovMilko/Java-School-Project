package project15;

public class MyPoint {
	private double x=0;
	private double y=0;
	
	MyPoint(){
		
	}
	MyPoint(double x, double y){
		setX(x);
		setY(y);
	}
	
	public void setX(double x) {
		this.x=x;
	}
	public double getX() {
		return x;
	}
	public void setY(double y) {
		this.y=y;
	}
	public double getY() {
		return y;
	}
	
	public double distance(MyPoint point) {
		return Math.sqrt((x-point.getX())*(x-point.getX())+(y-point.getY())*(y-point.getY()));
	}
	public double distance(double x, double y) {
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}
	public static double distance(MyPoint point1, MyPoint point2) {
		return point2.distance(point1);
	}
}
