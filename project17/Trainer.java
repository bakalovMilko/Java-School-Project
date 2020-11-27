package project17;

public class Trainer {
	private String name;
	private ChessPlayer[] students = new ChessPlayer[20];
	private int numberOfStudents = 0;
	
	Trainer(String name){
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ChessPlayer[] getStudents() {
		ChessPlayer[] a =new ChessPlayer[numberOfStudents];
		for(int i=0; i<numberOfStudents; i++) a[i] = students[i];
		return a;
	}
	
	public void addStudent(ChessPlayer player) {
		boolean found = false;
		for(int i=0; i<numberOfStudents; i++) {
			if(found) students[i-1]=students[i];
			if(students[i]==player) found = true;
		}
		if(!found) {
			if(numberOfStudents<20) {
				students[numberOfStudents] = player;
				numberOfStudents++;
				player.addTrainer(this);
			}
			else System.out.println("The teacher is too busy.");
		}
	}
	public void dropStudent(ChessPlayer player) {
		boolean found = false;
		for(int i=0; i<numberOfStudents; i++) {
			if(found) students[i-1]=students[i];
			if(students[i]==player) found = true;
		}
		if(found) {
			students[numberOfStudents] = null;
			numberOfStudents--;
			player.dropTrainer(this);
		}
		/*else {
			System.out.println("There is no such student.");
		}*/
	}
}
