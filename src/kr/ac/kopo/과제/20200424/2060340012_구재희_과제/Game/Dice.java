package jaeheehomework;

import java.util.Random;

public class Dice implements Game{

	Random r = new Random();
	
	public int startGame(int you) {
		
		int me = r.nextInt(6) + 1;
		
		if(you == me) {
			System.out.println("You win");
			return 1;
		} else {
			System.out.println("You lose");
			return 0;
		}
		
	}
}
