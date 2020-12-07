package project15;

public class MyInteger {
	private int value;
	
	MyInteger(int value){
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}
	private void setValue(int value) {
		this.value = value;
	}
	
	public boolean isEven () {
		return value%2==0;
	}
	public boolean isOdd() {
		return value%2==1;
	}
	public boolean isPrime() {
		boolean prime=true;
		for(int i=2; i<value; i++) {
			if(value%i==0) prime=false;
		}
		return prime;
	}
	
	public static boolean isEven (int integer) {
		return integer%2==0;
	}
	public static boolean isOdd(int integer) {
		return integer%2==1;
	}
	public static boolean isPrime(int integer) {
		boolean prime=true;
		for(int i=2; i<integer; i++) {
			if(integer%i==0) prime=false;
		}
		return prime;
	}
	
	public static boolean isEven (MyInteger integer) {
		return integer.getValue()%2==0;
	}
	public static boolean isOdd(MyInteger integer) {
		return integer.getValue()%2==1;
	}
	public static boolean isPrime(MyInteger integer) {
		boolean prime=true;
		for(int i=2; i<integer.getValue(); i++) {
			if(integer.getValue()%i==0) prime=false;
		}
		return prime;
	}
	
	public boolean equalsTo(int integer) {
		return this.value==integer;
	}
	public boolean equalsTo(MyInteger integer) {
		return this.value==integer.getValue();
	}
	
	public static int parseInt(char number[]) {
		String numberInString="";
		for(char a:number) {
			numberInString=a+numberInString;
		}
		return Integer.parseInt(numberInString);
	}
	public static int parseInt(String number) {
		return Integer.parseInt(number);
	}
}
