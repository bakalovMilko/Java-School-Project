package Homework;
import javax.swing.JOptionPane;
public class multiPlanetaryWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = Double.parseDouble((String)JOptionPane.showInputDialog(null,
                "What is your weight on Earth?",
                "Earth",
                2,
                null,
                null,
                "Type something here."));
		
		String[] Planets = {"Mercury" , "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		String chosenPlanet = (String) JOptionPane.showInputDialog(null, 
			"Choose your planet:", 
			"Planets",
			2,
			null,
			Planets,
			Planets[0]
		);
		if(chosenPlanet.equals("Mercury")) weight=weight * 0.38;
		else if(chosenPlanet.equals("Venus")) weight=weight * 0.91;
		else if(chosenPlanet.equals("Mars")) weight=weight * 0.38;
		else if(chosenPlanet.equals("Jupiter")) weight=weight * 2.36;
		else if(chosenPlanet.equals("Saturn")) weight=weight * 0.92;
		else if(chosenPlanet.equals("Uranus")) weight=weight * 0.87;
		else if(chosenPlanet.equals("Neptune")) weight=weight * 1.13;
		
		JOptionPane.showMessageDialog(null,
                "Your weight on "+ chosenPlanet + " is " + weight,
                null,
                0);
		
	}
}
