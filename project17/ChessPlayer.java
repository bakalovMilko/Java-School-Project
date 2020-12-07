package project17;

public class ChessPlayer {
	private String name;
	private Trainer[] trainers = new Trainer[TRAINERS_PER_PLAYER];
	private Rating rating;
	private int numberOfTrainers = 0;
	private static final int TRAINERS_PER_PLAYER = 6;
	
	ChessPlayer(String name, int rating){
		this.name = name;
		this.rating = new Rating(rating);
	}
	ChessPlayer(String name){
		this.setName(name);
		rating = new Rating();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating.setRating(rating);
	}
	public Trainer[] getTrainers() {
		Trainer[] a = new Trainer[numberOfTrainers];
		for(int i=0; i<numberOfTrainers;i++) a[i] = trainers[i];
		return a;
	}
	public void addTrainer(Trainer trainer) {
		boolean found = false;
		for(int i=0; i<numberOfTrainers; i++) {
			if(found) trainers[i-1]=trainers[i];
			if(trainers[i]==trainer) found = true;
		}
		if(!found) {
			if(numberOfTrainers<TRAINERS_PER_PLAYER) {
				trainers[numberOfTrainers] = trainer;
				numberOfTrainers++;
				trainer.addStudent(this);
			}
			else System.out.println("The player doesn't have enough time for more trainers.");
		}
	}
	public void dropTrainer(Trainer trainer) {
		boolean found = false;
		for(int i=0; i<numberOfTrainers; i++) {
			if(found) trainers[i-1]=trainers[i];
			if(trainers[i]==trainer) found = true;
		}
		if(found) {
			trainers[numberOfTrainers] = null;
			numberOfTrainers--;
			trainer.dropStudent(this);
		}
	}
	
}
