package project15;

public class MyPointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint[] points = new MyPoint[3];
		points[0] = new MyPoint();
		points[1] = new MyPoint(2, 4);
		points[2] = new MyPoint(3, 4);
		
		System.out.println(points[0].distance(points[2]));
		System.out.println(points[0].distance(5, 7));
		System.out.println(MyPoint.distance(points[1], points[2]));
	}

}
