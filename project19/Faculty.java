package project19;

public class Faculty extends Employee {
	private int officeHours;
	private String rank;
	
	Faculty(){
		
	}
	Faculty(String name, String address, String phoneNumber, String eMail, String office, int salary,
			int officeHours, String rank){
		super(name, address, phoneNumber, eMail, office, salary);
		this.setOfficeHours(officeHours);
		this.setRank(rank);
	}
	
	public int getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
	}
}
