package milko;

import java.util.Scanner;

public class trnsponedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the matrix: ");
		int length = sc.nextInt();
		System.out.print("Enter the width of the matrix: ");
		int width = sc.nextInt();
		int[][] matrix=new int[width][length];
		for(int i=0; i<width; i++){
			for(int j=0; j<length; j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<length; i++){
			for(int j=0; j<width; j++){
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
