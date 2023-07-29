/*Zhijian Chen
chen5340@brandeis.edu
10/19/2021
PA4
This program/class mainly focus on create the pre-game situations such as a set of poker, discard pile of cards.
Known Bugs: unknown.
*/

import java.util.Arrays;
import java.util.Random;

public class Deck {
	private Card[] deck;
	private Card[] discardPile;
	//private Card[] currentDeck;

	public static void main(String[] args) {
		Deck d = new Deck();
		Card c1 = d.drawNextCard();
		Card c2 = d.drawNextCard();
		Card c3 = d.drawNextCard();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		//d.shuffle();
		System.out.println(d.deck[2]);
		//d.drawNextCard();
		//d.discard(d.drawNextCard());
		//for (int i = 0; i <=51; i++) {
			//System.out.println(d.deck[i]);
		//}
		
	}
	
	public Deck() {
		deck = new Card[52];
		discardPile = new Card[52];
		int i = 0;
		for(int n = 1; n <= 13; n++) {
			deck[i] = new Card(n, "Hearts");
			i++;
		}
		i = 13;
		for(int d = 1; d <= 13; d++) {
			deck[i] = new Card(d, "Diamonds");
			i++;
		}
		i = 26;
		for(int s = 1; s <= 13; s++) {
			deck[i] = new Card(s, "Spades");
			i++;
		}
		i = 39; 
		for(int c = 1; c <= 13; c++) {
			deck[i] = new Card(c, "Clubs");
			i++;
		}
	}
	
	public void shuffle() {
		Random rand = new Random();
		Card tmp = new Card(1, "Hearts");
		for(int i = 51; i >= 1; i--) {
			int j = rand.nextInt(i+1);
			tmp = deck[i];
			deck[i] = deck[j];
			deck[j] = tmp;
		} 
	}
	
	public Card drawNextCard() {
		int i = 0;
		Card c = null;
		if (deck[0] != null) {
			c = deck[0];
			deck[0] = null;
		}else {
			while (deck[i] == null) {
				if(i<51) {
					if (deck[i+1] == null) {
						i++;
					}else {
						c = deck[i+1];
						deck[i+1] = null;
						deck[i] = c;
					}
				
				}else {
					deck = discardPile.clone();
					shuffle();
					c = deck[0];
					discardPile = new Card[52];
				}
			}
			deck[i] = null;
		}
		
		
		//System.out.println(c);
		return c;
		
		
		
	}
	
	public void discard(Card c) {
		int i = 0;
		while (discardPile[i] != null) {
			i++;
		}
		discardPile[i] = c;
	}

}
