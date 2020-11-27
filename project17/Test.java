package project17;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ChessPlayer anand = new ChessPlayer("Wishi Anand", 2760);
		ChessPlayer carlsen = new ChessPlayer("Magnus Carlsen", 2890);
		ChessPlayer vasilev = new ChessPlayer("Marin Vasilev", 2150);
		ChessPlayer genov = new ChessPlayer("Petar Genov", 2340);
		Trainer nakamura = new Trainer("Hikaru Nakamura");
		Trainer karpov = new Trainer("Anatoly Karpov");
		NationalTeam bulgaria = new NationalTeam("Bulgaria");
		
		//adding a player to a national team
		bulgaria.addPlayer(vasilev);
		bulgaria.addPlayer(genov);
		System.out.println("Bulgarian team:");
		for(ChessPlayer a: bulgaria.getPlayers()) System.out.println(a.getName());
		
		//drop a player from a national team
		bulgaria.dropPlayer(genov);
		System.out.println("Bulgarian team:");
		for(ChessPlayer a: bulgaria.getPlayers()) System.out.println(a.getName());
		
		//add a student
		nakamura.addStudent(carlsen);
		nakamura.addStudent(anand);
		System.out.println("The students of " +  nakamura.getName() + " are: ");
		for(ChessPlayer a: nakamura.getStudents()) System.out.println(a.getName());
		
		//drop a student
		nakamura.dropStudent(carlsen);
		System.out.println("The students of " +  nakamura.getName() + " are: ");
		for(ChessPlayer a: nakamura.getStudents()) System.out.println(a.getName());
		
		//add a trainer
		anand.addTrainer(karpov);
		System.out.println("The trainers of "+anand.getName()+" are:");
		for(Trainer a:anand.getTrainers()) System.out.println(a.getName()); 
		
		//drop a Trainer
		anand.dropTrainer(nakamura);
		System.out.println("The trainers of "+anand.getName()+" are:");
		for(Trainer a:anand.getTrainers()) System.out.println(a.getName()); 
		
	}

}
