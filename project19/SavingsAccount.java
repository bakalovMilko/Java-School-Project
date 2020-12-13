package project19;

public class SavingsAccount extends Account {
	SavingsAccount(){
		
	}
	SavingsAccount(int id, double balance){
		super(id, balance);
	}
	
	public void withdraw(double withdraw) {
		if(super.getBalance()<withdraw) {
			System.out.println("You don't have enough money in your account.");
		}
		else {
			super.withdraw(withdraw);
		}
	}
	public String toString() {
		return "This is savings account. " + super.toString();
	}
}
