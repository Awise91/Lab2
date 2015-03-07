package game;

public class Card extends Deck{

	@SuppressWarnings("unused")
	private static CardValue card;
	@SuppressWarnings("unused")
	private static Suit suit;

	public Card (CardValue card, Suit suit){
		super(card, suit);
		this.card = card;
		this.suit = suit;
	}
}