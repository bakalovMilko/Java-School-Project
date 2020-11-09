package ObjectOrientedProgramming;

public class Fan {
	public final static int SLOW = 1;
	public final static int MEDIUM = 2;
	public final static int FAST = 3;
	
	private int speed = SLOW;
	private boolean switchedOn = false;
	private double radius = 5;
	private String color = "blue";
	
	Fan(){
		
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int newSpeed) {
		speed=newSpeed;
	}
	public void setSpeed(String newSpeed) {
		if(newSpeed=="Slow") speed=SLOW;
		else if(newSpeed=="Medium") speed=MEDIUM;
		else if(newSpeed=="Fast") speed=FAST;
	}
	public boolean getSwitchedOn() {
		return switchedOn;
	}
	public void setSwitchedOn(boolean newCondition) {
		switchedOn=newCondition;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double newRadius) {
		radius=newRadius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	public void text () {
		if(switchedOn) {
			System.out.println( "Speed: "+ ((speed==SLOW)? "Slow" : ((speed==MEDIUM)? "Medium":"Fast"))
					+" Color: "+ color+" Radius: "+ radius);
		}
		else {
			System.out.println("The fan is not working. Color: "+color +" Radius "+radius);
		}
	}
}
