package project19;

import java.util.Date;

public class Employee extends People{
	private String office;
	private int salary;
	private Date dateHired = new Date();
	
	Employee(){
		
	}
	Employee(String name, String address, String phoneNumber, String eMail, String office, int salary){
		super(name, address, phoneNumber, eMail);
		this.setOffice(office);
		this.setSalary(salary);
	}
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getDateHired() {
		return dateHired;
	}
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	
	public String toString() {
		return super.toString() + "\nOffice: " + office + "\nSalary: " + salary + "\nDate hired: " + dateHired.toString();
	}
}
