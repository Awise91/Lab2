package game;

import java.util.ArrayList;

public class Hand extends Deck{

	static ArrayList<Card> gameHand = new ArrayList<Card>();

	public Hand(CardValue card, Suit suit, Strength strength) {
		super(card, suit);
	}
	public ArrayList<Card> makeHand() {
		for (int o = 0; o < 5; o++) {
			Card h = Deck.draw();
			gameHand.add(h);
		}
		return gameHand;
	}
}


