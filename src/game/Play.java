package game;

import java.util.ArrayList;

class play extends Hand {
	public play(CardValue card, Suit suit, Strength strength) {
		super(card, suit, strength);
		}

	ArrayList<Card> yourHand = new ArrayList<Card>();
	ArrayList<Card> otherHand = new ArrayList<Card>();
	
	public ArrayList<Card> GameHand() {		
		for (int u = 0; 0 < newHand.size(); u++) {
			yourHand.add(newHand.get(u));
		}
		return yourHand;
	}
	public ArrayList<Card> otherPlayer() {
		for(int q = 0; 0 < newHand.size(); q++){
			otherHand.add(newHand.get(q));
		}	
		return otherHand;
	}
		static int outcome = 0;
		public void RF(){
		if(yourHand.contains(Strength.RoyalFlush) && otherHand.contains(Strength.RoyalFlush)){
			outcome = 0;
		}
		else {
			outcome = 1;
		}
	}
		public void SF() {
			if(yourHand.contains(Strength.straightFlush) && otherHand.contains(Strength.royalFlush)){
				outcome = 2;
			}
			else if(yourHand.contains(Strength.straightFlush) && otherHand.contains(Strength.straightFlush)){
				outcome = 0;
			}
			else {
				outcome = 1;
			}
		}
		public void FK() {
			if(yourHand.contains(Strength.fourOfAKind) && otherHand.contains(Strength.straightFlush) || otherHand.contains(Strength.royalFlush)){
				outcome = 2;
		}
			else if(yourHand.contains(Strength.fourOfAKind) && otherHand.contains(Strength.fourOfAKind)){
				outcome = 0;
			}
			else{
				outcome = 1;
			}
		}
		public void FH(){
			if(yourHand.contains(Strength.fullHouse) && otherHand.contains(Strength.royalFlush) || otherHand.contains(Strength.straightFlush) || otherHand.contains(Strength.fourOfAKind)){
				outcome = 2;
			}
			else if (yourHand.contains(Strength.fullHouse) && otherHand.contains(Strength.fullHouse)){
				outcome = 0;
			}
			else {
				outcome = 1;
			}
		}
		public void F() {
			if(yourHand.contains(Strength.flush) && otherHand.contains(Strength.royalFlush) || otherHand.contains(Strength.straightFlush) || otherHand.contains(Strength.fourOfAKind) || otherHand.contains(Strength.fullHouse)){
				outcome = 2;
			}
			else if (yourHand.contains(Strength.flush) && otherHand.contains(Strength.flush)){
				outcome = 0;
			}
			else {
				outcome = 1;
			}
		}
		public void S() {
			if (yourHand.contains(Strength.straight) && otherHand.contains(Strength.flush) ||otherHand.contains(Strength.royalFlush) || otherHand.contains(Strength.straightFlush) || otherHand.contains(Strength.fourOfAKind) || otherHand.contains(Strength.fullHouse)){
				outcome = 2;
			}
			else if(yourHand.contains(Strength.straight) && otherHand.contains(Strength.straight)){
				outcome = 0;
			}
			else {
				outcome = 1;
			}
		}
		public void TK() {
			if (yourHand.contains(Strength.threeOfAKind) && otherHand.contains(Strength.straight) ||otherHand.contains(Strength.flush) ||otherHand.contains(Strength.royalFlush) || otherHand.contains(Strength.straightFlush) || otherHand.contains(Strength.fourOfAKind) || otherHand.contains(Strength.fullHouse)){
				outcome = 2;
			}
			else if (yourHand.contains(Strength.threeOfAKind) && otherHand.contains(Strength.threeOfAKind)){
				outcome = 0;
			}
			else {
				outcome = 1;
			}
		}
		public void TP() {
			if (yourHand.contains(Strength.TwoPair) && otherHand.contains(Strength.threeOfAKind) ||otherHand.contains(Strength.straight) ||otherHand.contains(Strength.flush) ||otherHand.contains(Strength.royalFlush) || otherHand.contains(Strength.straightFlush) || otherHand.contains(Strength.fourOfAKind) || otherHand.contains(Strength.fullHouse)){
				outcome = 2;
			}
			else if 
				(yourHand.contains(Strength.twoPair) && otherHand.contains(Strength.twoPair)){
				outcome = 0;
			}
				else {
					outcome = 1;
				}
			}
		public void OP(){
			if (yourHand.contains(Strength.onePair) && otherHand.contains(Strength.twoPair) ||otherHand.contains(Strength.threeOfAKind) ||otherHand.contains(Strength.straight) ||otherHand.contains(Strength.flush) ||otherHand.contains(Strength.royalFlush) || otherHand.contains(Strength.straightFlush) || otherHand.contains(Strength.fourOfAKind) || otherHand.contains(Strength.fullHouse)){
				outcome = 2;
			}
			else if (yourHand.contains(Strength.onePair) && otherHand.contains(Strength.onePair)){
				outcome = 0;
			}
			else {
				outcome = 1;
			}
		}
		public void HC(){
			if (yourHand.contains(Strength.highCard) && otherHand.contains(Strength.onePair) || otherHand.contains(Strength.twoPair) ||otherHand.contains(Strength.threeOfAKind) ||otherHand.contains(Strength.straight) ||otherHand.contains(Strength.flush) ||otherHand.contains(Strength.royalFlush) || otherHand.contains(Strength.straightFlush) || otherHand.contains(Strength.fourOfAKind) || otherHand.contains(Strength.fullHouse)){
				outcome = 2;
			}
			else if (yourHand.contains(Strength.highCard) && otherHand.contains(Strength.highCard)){
				outcome = 0;
			}
		}
		public static void main(String args[]){
			if (outcome == 1){
				System.out.println("Congratulations, you win!");
			}
			else if (outcome == 2){
				System.out.println("Sorry, you lose. Better luck next time!");
			}
			else {
				System.out.println("It's a draw!");
			}
		}
	}

	
	

	
