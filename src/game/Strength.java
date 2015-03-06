package game;

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
}
