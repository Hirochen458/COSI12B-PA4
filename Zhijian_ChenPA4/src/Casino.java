/*Zhijian Chen
chen5340@brandeis.edu
10/19/2021
PA4
This program/class mainly focus on user interaction to play poker game with computer.
Known Bugs: unknown.
*/

import java.util.Scanner;

public class Casino {

	public static void main(String[] args) {
		play();
	}
	/*
	public static boolean isplay() {
		Scanner s = new Scanner(System.in);
		String ans = s.nextLine();
		if(ans == "yes")
			return true;
		else return false;
	}*/

	public static void play() {
		Deck d = new Deck();
		d.shuffle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Initial money is: ");
		int money = sc.nextInt();
		System.out.println("Your bat is: ");
		int bat = sc.nextInt();
		boolean flag = true;
		while(flag != false) {
			System.out.println("Do you wanna play this game? yes or no?");
			Scanner s = new Scanner(System.in);
			String ans = s.nextLine();
			if(ans.equals("yes")) {
				flag = true;
				Card u = d.drawNextCard();
				Card c = d.drawNextCard();
				d.discard(u);
				d.discard(c);
				if(u.getValue() < c.getValue()) {
					money -= bat;
					System.out.println("Your card is: " + u);
					System.out.println("computer's card is: " + c);
					System.out.println("You lost! ");
					System.out.println("Your balance is: " + money);
					if(money < 0) 
						flag = false;
				}
				else if(u.getValue() == c.getValue()){
					System.out.println("Your card is: " + u);
					System.out.println("computer's card is: " + c);
					System.out.println("Draw!");
					System.out.println("But as princlpe, computer win! ");
					money -= bat;
					System.out.println("Your balance is: " + money);
				}
				else {
					System.out.println("Your card is: " + u);
					System.out.println("computer's card is: " + c);
					System.out.println("You win! ");
					money += bat;
					System.out.println("Your balance is: " + money);
				}
			}
				
			else {
				flag = false;
			}
			
		}
		System.out.println("See you next time! ");
	}
}
