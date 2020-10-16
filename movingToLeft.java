package Homework;

import java.util.Scanner;

public class movingToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for(int i=0; i<10; i++) {
			array[i]=sc.nextInt();
		}
		int temp=array[0];
		for(int i=0; i<9; i++) {
			array[i]=array[i+1];
		}
		array[10]=temp;
	}

}
