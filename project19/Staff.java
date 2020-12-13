package project19;

public class Staff extends Employee {
	private String title;
	
	Staff(){
		
	}
	Staff(String name, String address, String phoneNumber, String eMail, String office, int salary, String title){
		super(name, address, phoneNumber, eMail, office, salary);
		this.setTitle(title);
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
	
}
