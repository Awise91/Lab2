package game;

public enum Suit{
	HEART(10), 
	CLUB(20), 
	SPADE(30) , 
	DIAMOND(40);
	
	private int suit2;
	
	Suit(int s) {
		suit2 = s;
	}
	int getSuit() {
		return suit2;
	}
}

	
