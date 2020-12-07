package project17;

public class Trainer {
	private String name;
	private ChessPlayer[] students = new ChessPlayer[PLAYERS_PER_TRAINER];
	private int numberOfStudents = 0;
	private static final double PLAYERS_PER_TRAINER=20;
	
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
			if(numberOfStudents<PLAYERS_PER_TRAINER) {
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
	}
}
