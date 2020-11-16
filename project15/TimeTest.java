package project15;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time[] time = new Time[3];
		time[0] = new Time();
		time[1] = new Time(555550000);
		time[2] = new Time(5, 23, 55);
		for(int i=0; i<3; i++) {
			System.out.println("Timer ¹"+(i+1)+": " + time[i].getHours()+ ":" +
		time[i].getMinutes() + ":" + time[i].getSeconds());
		}
	}

}
