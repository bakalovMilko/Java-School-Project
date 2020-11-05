package ObjectOrientedProgramming;

public class Students {
	private double grade=5;
	private String name ="gosho";
	
	Students(){		
	}
	Students(String name, double grade){
		this.name=name;
		this.grade=grade;
	}
	public void setName(String newName) {
		name=newName;
	}
	public void setGrade(double newGrade) {
		grade=newGrade;
	}
	public String getName() {
		return name;
	}
	public double getGrade() {
		return grade;
	}
}
