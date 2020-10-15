package milko;

import java.util.Scanner;

public class shuffling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int temp;
 		for(int i=0; i<10; i++){
			array[i]=sc.nextInt();
		}
		for(int i=0; i<10; i++){
			int x = (int)(Math.random()*(10-i))+i-1;
			temp=array[i];
			array[i]=array[x];
			array[x]=temp;
		}
		for(int i=0; i<10; i++){
			System.out.println(array[i]);
		}
		sc.close();
	}

}
