package game;

class play extends Hand {
	public play(CardValue card, Suit suit, Strength strength) {
		super(card, suit, strength);
		}
	
	public boolean royalFlush() {
		if (gameHand == Strength.royalFlush)
			return true;
		else {
			return false;
		}
	}
	// Need to set up a method that allows game play
}
