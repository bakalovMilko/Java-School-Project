package project18;

public class GeometricObject {
	private String color = "no";
	private boolean filled=false;

	GeometricObject(){
		
	}
	GeometricObject(String color){
		this.setColor(color);
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		filled=true;
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		if(!filled) {
			color="no";
		}
		this.filled = filled;
	}
}
