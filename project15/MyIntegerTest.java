package project15;

import java.util.Scanner;

public class MyIntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MyInteger[] number= new MyInteger[2];
		number[0] = new MyInteger(sc.nextInt());
		number[1] = new MyInteger(sc.nextInt());
		System.out.println("The number: "+number[1].getValue()+" is "+
		((number[1].isEven())?"even":"odd") + " and " +((number[1].isPrime())?"prime":"not prime") );
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("The number " + x+" is " +((MyInteger.isOdd(x))?"odd":"even")+ " and " + ((MyInteger.isPrime(x))?"prime":"not prime"));
		
		String integer = sc.next();
		System.out.println("Number 1 is " + ((number[1].equalsTo(MyInteger.parseInt(integer)))? "":"not") + 
				" equal to " + integer);
	}

}
