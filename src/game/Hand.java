package game;

import java.util.ArrayList;

class Hand extends Deck{

	public static ArrayList<Card> newHand = new ArrayList<Card>();

	public Hand(CardValue card, Suit suit, Strength strength) {
		super(card, suit);
	}
	public ArrayList<Card> makeHand() {
		for (int o = 0; o < 5; o++) {
			Card h = draw();
			newHand.add(h);
		}
		return newHand;
	}
}


