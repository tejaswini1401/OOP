/*
 4. Write a Program DeckOfCards.java, to initialize deck of cards having suit
("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8",
"9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random
method and then distribute 9 Cards to 4 Players and Print the Cards received by
the 4 Players using 2D Array...
 */
package oop.programs;

import java.util.Random;

public class DeckOfCards {
	
	static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	static String[] ranks = {"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};
	static String[] decks = new String[52];

	public static void main(String[] args) {
		initializeDeck();
		suffleDeck();
		String[][] players = distributeCards();
		printPlayerCards(players);
	}
	
	static void initializeDeck() {
		int index =0;
		for(String suit : suits) {
			for(String rank : ranks) {
				decks[index++] = rank +" of "+ suit;
			}
		}
	}
	
	static void suffleDeck() {
		Random random = new Random();
		
		for(int i=0;i<decks.length;i++) {
			int randomIndex = random.nextInt(decks.length);
			String temp = decks[i];
			decks[i]=decks[randomIndex];
			decks[randomIndex]=temp;
		}
	}
	
	static String[][] distributeCards(){
		
		String[][] players = new String[4][9];
		
		int deckIndex =0;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<9;j++) {
				players[i][j] = decks[deckIndex++];
			}
		}
		
		return players;
	}
	
	static void printPlayerCards(String[][] players) {
		
		for(int i=0;i<4;i++) {
			System.out.println("Player "+i+1+" 's cards : ");
			for(int j=0;j<9;j++) {
				System.out.println(players[i][j]);
			}
			System.out.println();
		}
	}

}
