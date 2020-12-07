package project16;

public class Course {
	private String name;
	private String[] students = new String[100];
	private int numberOfStudents=0;
	
	Course(String name){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getStudents() {
		return students;
	}

	private void setStudents(String[] students) {
		this.students = students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	private void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents= numberOfStudents;
	}
	
	public void addStudent(String name) {
		students[numberOfStudents]=name;
		numberOfStudents++;
	}
	public void dropStudent(String name) {
		boolean found = false;
		for(int i=0; i<numberOfStudents; i++) {
			if(name==students[i]) {
				found=true;
			}
			if(found) {
				students[i] = students[i+1];
			}
		}
		if(found && numberOfStudents>0) numberOfStudents--;
	}
	
}
