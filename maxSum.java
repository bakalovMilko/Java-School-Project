package milko;

import java.util.Scanner;

public class maxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int [5][5];
		int maxLine=0, line=0;
		System.out.println("Enter a 5x5 matrix:");
		for(int i=0; i<5; i++){
			line = 0;
			for(int j=0; j<5; j++){
				matrix[i][j]=sc.nextInt();
				System.out.print(" ");
				line+=matrix[i][j];
			}
			System.out.print("\n");
			if(line>maxLine) maxLine=line;
		}
		System.out.println(maxLine);
		sc.close();
	}

}
