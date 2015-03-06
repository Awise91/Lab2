package game;

import java.util.ArrayList;

public class Card extends Deck{
	
	protected static CardValue card;
	protected static Suit suit;

	public Card (CardValue card, Suit suit){
		super(card, suit);
		this.card = card;
		this.suit = suit;
	}
	public static Card makeCard() {
		Card c = new Card(card, suit);
		return c;
	}
}