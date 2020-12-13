package project19;

public class People {
	private String name;
	private String address;
	private String phoneNumber;
	private String eMail;
	
	People(){
		
	}
	People(String name, String address, String phoneNumber, String eMail){
		this.setAddress(address);
		this.seteMail(eMail);
		this.setName(name);
		this.setPhoneNumber(phoneNumber);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	public String toString() {
		return "Name: " + name + "\nAdress" + address + "\ne-mail:" + eMail + "\nPhone number" + phoneNumber;
	}
}
