package game;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class Deck {

	public Deck(CardValue card, Suit suit) {
	}
	Random generator = new Random();
	static ArrayList<Card> gameDeck = new ArrayList<Card>();

	public static void makeDeck() {
		for (int s = 0; s <= 40 ; s+=10) {
			for (int v = 1; v <= 13; v++) {
			Card c = Card.makeCard();

			gameDeck.add(c);
		}
		Collections.shuffle(gameDeck);
	}
}
	public static Card draw() {
		Card c = gameDeck.get(0);
		gameDeck.remove(c);
		return c;
	}
	public int remainingCards() {
		return gameDeck.size();
	}
}



