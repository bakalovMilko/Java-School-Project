package project16;

public class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course1 = new Course ("Chess theory");
		course1.addStudent("Max");
		course1.addStudent("Vladimir");
		course1.addStudent("Garry");
		course1.dropStudent("Vladimir");
		
		System.out.println("The number of studets in course " + course1.getName() + 
				" is " + course1.getNumberOfStudents() + " and they are ");
		String[] students = course1.getStudents();
		for(int i=0; i<course1.getNumberOfStudents(); i++) {
			System.out.print(students[i]);
			if(i<course1.getNumberOfStudents()-1) System.out.print(", ");
		}
		
	}

}
