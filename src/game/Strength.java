package game;

import java.util.ArrayList;
import java.util.Collection;

public enum Strength {
	royalFlush(90),
	straightFlush(80),
	fourOfAKind(70),
	fullHouse(60),
	flush(50),
	straight(40),
	threeOfAKind(30),
	twoPair(20),
	onePair(10),
	highCard(1);
	
private int strength;
	
	Strength(int S) {
		strength = S;
	}
	int getStrength() {
		return strength;
	}
	public static Card[] RoyalFlush = {new Card(CardValue.TEN, Suit.SPADE), new Card(CardValue.JACK, Suit.SPADE), new Card(CardValue.QUEEN, Suit.SPADE), new Card(CardValue.KING, Suit.SPADE), new Card(CardValue.ACE, Suit.SPADE)};	
	public static Card[] StraightFlush = {new Card(CardValue.FOUR, Suit.HEART), new Card(CardValue.FIVE, Suit.HEART), new Card(CardValue.SIX, Suit.HEART), new Card(CardValue.SEVEN, Suit.HEART), new Card(CardValue.EIGHT, Suit.HEART)};
	public static Card[] FourOfAKind = {new Card(CardValue.ACE, Suit.HEART), new Card(CardValue.ACE, Suit.DIAMOND), new Card(CardValue.ACE, Suit.CLUB), new Card(CardValue.ACE, Suit.SPADE), new Card(CardValue.FOUR, Suit.DIAMOND)};
	public static Card[] FullHouse = {new Card(CardValue.EIGHT, Suit.HEART), new Card(CardValue.EIGHT, Suit.DIAMOND), new Card(CardValue.EIGHT, Suit.CLUB), new Card(CardValue.KING, Suit.HEART), new Card(CardValue.KING, Suit.SPADE)};
	public static Card[] Flush = {new Card(CardValue.TEN, Suit.CLUB), new Card(CardValue.FOUR, Suit.CLUB), new Card(CardValue.QUEEN, Suit.CLUB), new Card(CardValue.SEVEN, Suit.CLUB), new Card(CardValue.TWO, Suit.CLUB)};
	public static Card[] Straight = {new Card(CardValue.SEVEN, Suit.CLUB), new Card(CardValue.EIGHT, Suit.HEART), new Card(CardValue.NINE, Suit.DIAMOND), new Card(CardValue.TEN, Suit.HEART), new Card(CardValue.JACK, Suit.SPADE)};
	public static Card[] ThreeOfAKind = {new Card(CardValue.QUEEN, Suit.HEART), new Card(CardValue.QUEEN, Suit.CLUB), new Card(CardValue.QUEEN, Suit.DIAMOND), new Card(CardValue.FIVE, Suit.SPADE), new Card(CardValue.ACE, Suit.DIAMOND)};
	public static Card [] TwoPair = {new Card(CardValue.THREE, Suit.HEART), new Card(CardValue.THREE, Suit.DIAMOND), new Card(CardValue.SIX, Suit.CLUB), new Card(CardValue.SIX, Suit.HEART), new Card(CardValue.KING, Suit.SPADE)};
	public static Card[] OnePair = {new Card(CardValue.FIVE, Suit.HEART), new Card(CardValue.FIVE, Suit.CLUB), new Card(CardValue.TWO, Suit.CLUB), new Card(CardValue.JACK, Suit.CLUB), new Card(CardValue.ACE, Suit.DIAMOND)};
	public static Card[] NoPair = {new Card(CardValue.TWO, Suit.DIAMOND), new Card(CardValue.FIVE, Suit.SPADE), new Card(CardValue.SIX, Suit.SPADE), new Card(CardValue.JACK, Suit.HEART), new Card(CardValue.ACE, Suit.CLUB)};	
}

