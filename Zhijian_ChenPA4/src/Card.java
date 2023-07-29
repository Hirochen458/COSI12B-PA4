
/*Zhijian Chen
chen5340@brandeis.edu
10/19/2021
PA4
This program/class mainly focus on get a card's value, suit, color and return card.
Known Bugs: unknown.
*/

public class Card {
	private int value;
	private String suit;

	public Card(int value, String suit) {
		
		// v = String.valueOf(value);
		//String[] cardi = new String[2];
		//cardi[0] = v;
		//cardi[1] = suit;
		
		//return cardi;
		//int val;
		//String col;
		this.value = value;
		this.suit = suit;
		
		

	}
	
	public int getValue() {
		return value;
	}
	
	public String getColor() {
		String red = "Red";
		String black = "Black";
		if(suit == "Hearts" || suit == "Diamonds") {
			return red;
		}else {
			return black;
		}
	}
	
	public String getSuit() {
		return suit;
	}

	public String toString() {
		if(value == 1) {
			return "Ace" + " of " + suit;
		}
		if(value == 11){
			return "Jack" + " of "+ suit;
		}
		if(value == 12) {
			return "Queen" + " of " + suit;
		}
		if(value == 12) {
			return "King" + " of " + suit;
		}
		return String.valueOf(value) + " of " + suit;
	}
	public static void main(String []args) {
		//Card c = new Card(1, "Hearts");
		//System.out.println(c.getSuit());
		//System.out.println(c.getColor());
		//System.out.println(c.getValue());
		//System.out.print(c.toString());
	}
}
