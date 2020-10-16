package Homework;

import java.util.*;

public class randomCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] cardNum = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String[] chosenCard = new String[4];
		for(int i=0; i<4; i++) {
			chosenCard[i]=cardNum[(int)(Math.random()*13)] + " of " + suits[(int)(Math.random()*4)];
			for(int j=0; j<i; j++) {
				if(chosenCard[j].equals(chosenCard[i])) {
					j=i;
					i--;
				}
			}
		}
		for(int i=0; i<4; i++) {System.out.println(chosenCard[i]);}
		
	}

}
