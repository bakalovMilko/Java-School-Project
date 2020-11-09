package ObjectOrientedProgramming;

public class FanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setSwitchedOn(true);
		
		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.MEDIUM);
		
		fan1.text();
		fan2.text();
	}

}