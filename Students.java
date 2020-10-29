package ObjectOrientedProgramming;

public class Students {
	public double average=5;
	public String name;
	
	Students(){		
	}
	Students(String name, double grade){
		this.name=name;
		this.grade=grade;
	}
	public void getName(String newName) {
		name=newName;
	}
	public void getGrade(double newGrade) {
		grade=newGrade;
	}
}
