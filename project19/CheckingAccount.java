package project19;

public class CheckingAccount extends Account {
	private double limit;
	CheckingAccount(){
		
	}
	CheckingAccount(int id, double balance, double limit){
		super(id, balance);
		this.setLimit(limit);
	}
	
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	public void withdraw(double withdraw) {
		if(super.getBalance()+limit<withdraw) {
			System.out.println("You will overdraft!");
		}
		else {
			super.withdraw(withdraw);
		}
	}
	public String toString() {
		return "This is checking account. " + super.toString();
	}
}
