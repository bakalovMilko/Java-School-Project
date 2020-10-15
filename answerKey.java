package milko;

import java.util.Scanner;

public class answerKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int questions=10;
		System.out.print("Enter the number of students: ");
		int students = sc.nextInt();
		char[][] answers = new char[students][questions];
		for(int i=0; i<students; i++){
			System.out.print("Student "+(i+1)+" ");
			for(int j=0; j<questions; j++){
				//char answer = in.next().charAt(0);
				answers[i][j]=sc.next().charAt(0);
				//System.out.print(" ");
			}
		}
		char[] key = new char[questions];
		System.out.print("Key: ");
		for(int i=0; i<questions; i++){
			key[i] = sc.next().charAt(0);
		}
		int[] points = new int[students] ;
		for(int i=0; i<students; i++){
			points[i]=0;
			for(int j=0; j<questions;j++){
				if(key[j]==answers[i][j]){points[i]++;}
			}
			System.out.println("Student "+(i+1)+" has "+points[i]+ " points.");
		}
		sc.close();
	}

}
