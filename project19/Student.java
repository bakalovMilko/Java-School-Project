package project19;

public class Student extends People {
	private static final String[] LASS_STATUS = {"fresh_man", "sophomore", "junior", "senior"};
	private int yearsInSchool=1;
	
	Student(){
		
	}
	Student(String name, String address, String phoneNumber, String eMail, int yearsInSchool){
		super(name, address, phoneNumber, eMail);
		this.setYearsInSchool(yearsInSchool);
	}
	
	public void setYearsInSchool(int yearsInSchool) {
		this.yearsInSchool = yearsInSchool;
	}
	public String getStatus() {
		return LASS_STATUS[yearsInSchool];
	}
	
	public String toString() {
		return super.toString() + "\nStudent lass status: " + LASS_STATUS[yearsInSchool-1];
	}
}
