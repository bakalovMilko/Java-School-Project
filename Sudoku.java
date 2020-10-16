package milko;

import java.util.Scanner;

public class Sudoku {
	public static boolean row (int[] x,int size){
		boolean ans;
		for(int i=0; i<size;i++ ){
			ans=false;
			for(int j=0; j<size && !ans; j++) {
				if(i==x[j]) {
					ans=true;
				}
			}
			if(!ans) return false;
		}
		return true;
	}
	public static int[][] transponedMatrix(int[][] x,int size) {
		int[][] ans = new int[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				ans[i][j]=x[j][i];
			}
		}
		return ans;
	}
	public static int[][] subMatrix (int[][] matrix, int x, int y, int sizeX, int sizeY){
		int[][] ans = new int[sizeX][sizeY];
		for(int i=0; i<sizeY; i++) {
			for(int j=0; j<sizeX; j++) {
				ans[i][j]=matrix[y+j][x+i];
			}
		}
		return ans;
	}
	public static boolean square(int[][] x,int size) {
		boolean ans=true;
		for(int i=0; i<size*size; i++) {
			ans=false;
			for(int j=0; j<size; j++) {
				for(int t=0; t< size; t++) {
					if(i==x[j][t]) {
						ans=true;
					}
				}
			}
			if(!ans) return false;
		}
		return true;
	}
	public static boolean solutionOfSudoku (int[][] x, int size) {
		for(int i=0; i<size; i++) {
			if(!row(x[i], size)) return false;
		}
		for(int i=0; i<size; i++) {
			if(!row(transponedMatrix(x, size)[i], size)) return false;
		}
		for(int i=0; i<Math.sqrt(size);i++) {
			for(int j=0; j<Math.sqrt(size);j++) {
				if(!square(subMatrix(x, (int)(i*Math.sqrt(size)), 
						(int)(j*Math.sqrt(size)), 
						(int)(Math.sqrt(size)), 
						(int)(Math.sqrt(size))),
						(int)(Math.sqrt(size)))) {
					return false;
				}
			}
		}
		return true;
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
		System.out.println((solutionOfSudoku(sudoku,size))? "Yes":"No");
		sc.close();
	}

}
