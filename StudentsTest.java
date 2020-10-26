package ObjectOrientedProgramming;

import java.util.Scanner;

public class StudentsTest {
	public static boolean scholarship (Students student) {
		final double scholarship = 5.5;
		if(student.average>scholarship)  return true;
		else return false;
	}
	public static void scholarship(Students students[]) {
		for(int i=0; i<students.length; i++) {
			if(scholarship(students[i])) System.out.println(students[i].name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int size=5;
		Scanner sc = new Scanner(System.in);
		Students[] students = new Students[size];
		for(int i=0; i<size; i++) {
			System.out.print("Enter the name of student "+(i+1)+":");
			students[i].getName(sc.next());
			System.out.print("Eneter the average success of student "+(i+1)+":");
			students[i].getAverage(sc.nextDouble());
		}
		scholarship(students[size]);
	}

}
