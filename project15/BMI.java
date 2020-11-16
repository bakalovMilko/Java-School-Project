package project15;

public class BMI {
	private String name;
	private int age;
	private double height;
	private double weight;
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;
	
	public BMI(String name, int age, double height, double weight){
		this.setName(name);
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
	}
	public BMI(String name, double height, double weight){
		this.setName(name);
		age=20;
		this.setHeight(height);
		this.setWeight(weight);
	}
	public BMI(String name, int age, double weight, double feet, double inches){
		this.setName(name);
		this.setAge(age);
		this.setHeight(feet*12+inches);
		this.setWeight(weight);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getBMI() {
		double bmi = weight*BMI.KILOGRAMS_PER_POUND/(height*BMI.METERS_PER_INCH*height*BMI.METERS_PER_INCH);
		return (int)(bmi/100)*100;
	}
	public String getStatus() {
		double bmi = getBMI();
		if(bmi<18.5) return "Underweight";
		else if(bmi<25) return "Normal";
		else if(bmi<30) return "Overweight";
		else return "Obese";
	}
}
