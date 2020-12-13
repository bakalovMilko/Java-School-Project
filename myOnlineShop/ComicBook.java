package myOnlineShop;

public class ComicBook extends Book {
	private String charachter;

	ComicBook(double regularPrice,
            String publisher,
            int yearPublished,
            String charachter){
		super(regularPrice, publisher, yearPublished);
		this.setCharachter(charachter);
	}
	
	public double computeSalePrice(){
		return getRegularPrice() * 0.6;
	}
	public String getCharachter() {
		return charachter;
	}

	public void setCharachter(String charachter) {
		this.charachter = charachter;
	}
	
	
}
