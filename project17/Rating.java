package project17;

public class Rating {
	private int rating = 1000;
	
	Rating(){
		
	}
	Rating(int rating){
		setRating(rating);
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
