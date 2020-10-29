package ObjectOrientedProgramming;

import java.util.Scanner;

public class StudentsTest {
	public static boolean scholarship (Students student) {
		final double scholarship = 5.5;
		if(student.grade>scholarship)  return true;
		else return false;
	}
	public static void scholarship(Students students[]) {
		for(Students s:students) {
			if(scholarship(s)) System.out.println(s.name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int size=5;
		Scanner sc = new Scanner(System.in);
		Students[] students = new Students[size];
		for(int i=0; i<size; i++) {
			System.out.print("Enter the name of student "+(i+1)+":");
			String name = sc.next();
			System.out.print("Eneter the grade of student "+(i+1)+":");
			double grade = sc.nextDouble();
			students[i] = new Students(name, grade);
		}
		scholarship(students);
	}

}
