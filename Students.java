package ObjectOrientedProgramming;

public class Students {
	public double average=5;
	public String name="gosho";
	
	Students(){		
	}
	Students(String name, double average){
		this.name=name;
		this.average=average;
	}
	public void getName(String newName) {
		name=newName;
	}
	public void getAverage(double newAverage) {
		average=newAverage;
	}
}
