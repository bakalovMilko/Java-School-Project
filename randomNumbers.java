package milko;

import java.util.*;

public class randomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int[] array = new int[20];
		for(int i=0; i<20; i++){
			array[i]=(int)(Math.random() * 2147483647);
			System.out.println(array[i]);
		}
	}

}
