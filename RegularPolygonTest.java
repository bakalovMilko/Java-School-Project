package ObjectOrientedProgramming;

public class RegularPolygonTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon polygon1 = new RegularPolygon();
		System.out.println("The first polygon has perimeter "+ polygon1.getPerimeter()
				+ "and area "+polygon1.getArea());
		
		RegularPolygon polygon2 = new RegularPolygon(6,4); 
		System.out.println("The second polygon has perimeter "+ polygon2.getPerimeter()
				+ "and area "+polygon2.getArea());
		
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("The third polygon has perimeter "+polygon3.getPerimeter()+
				" and area "+ polygon3.getArea());
	}
}
