package game;

import java.util.Collections;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Random;

public class Deck {

	public Deck(CardValue card, Suit suit) {
	}
	Random generator = new Random();
	static ArrayList<Card> gameDeck = new ArrayList<Card>();

	public static void makeDeck() {
		for (Suit s : EnumSet.allOf(Suit.class)) {
			for (CardValue v : EnumSet.allOf(CardValue.class)){
			Card c = new Card(v, s);

			gameDeck.add(c);
		}
		Collections.shuffle(gameDeck);
	}
}
	public Card draw() {
		Card c = (Card) gameDeck.get(0);
		gameDeck.remove(c);
		return c;
	}
	public int remainingCards() {
		return gameDeck.size();
	}
}



