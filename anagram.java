package Homework;

import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sorted1="", sorted2 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word:");
		String input1 = (sc.nextLine()).toUpperCase();
		System.out.println("Enetr the second word");
		String input2 = (sc.nextLine()).toUpperCase();
		int j;
		for(int i = 0; i < input1.length(); i++) {
			if(input1.charAt(i) >= 65 && input1.charAt(i) <= 90) {
				for(j=0; j <sorted1.length() && input1.charAt(i)<sorted1.charAt(j); j++) {}
				sorted1 = sorted1.substring(0,j) + input1.charAt (i) + sorted1.substring(j) ;
			}
		}
//		System.out.println(sorted1);
		for(int i = 0; i < input2.length(); i++) {
			if(input2.charAt(i) >= 65 && input2.charAt(i) <= 90) {
				for(j=0; j <sorted2.length() && input2.charAt(i)<sorted2.charAt(j); j++) {}
				sorted2 = sorted2.substring(0,j) + input2.charAt (i) + sorted2.substring(j) ;
			}
		}
//		System.out.println(sorted2);
		System.out.println(sorted1.equals(sorted2) ? "They are anagrams": "They are not anagrams");
		sc.close();
	}

}
