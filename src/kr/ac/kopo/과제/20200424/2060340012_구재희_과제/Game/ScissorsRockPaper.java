package jaeheehomework;

import java.util.Random;

public class ScissorsRockPaper implements Game {

	// 상수
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	Random r = new Random();

	// 메소드 override
	@Override
	public int startGame(int you) {
		
		int me = r.nextInt(3) + 1;
		
		if(you == me) {
			System.out.println("비겼습니다");
			return -1;
		} else if(
				(you == 1 && me == 2) || (you == 2 && me == 3) || (you == 3 && me == 1) ) {
			System.out.println("You lose");
			return 0;
		} else {
			System.out.println("You win");
			return 1;
		}
		
		
	}

}
