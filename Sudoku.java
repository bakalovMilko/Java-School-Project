package milko;

import java.util.Scanner;

public class Sudoku {
	public static boolean row (int[] x){
		//String sorted, ;
		//for(int i=; i<1){
			
		//}
		//return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sudoku solution:");
		final int size = 9;
		int[][] sudoku = new int[size][size];
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				sudoku[i][j]=sc.nextInt();
			}
		}
		
		sc.close();
	}

}
