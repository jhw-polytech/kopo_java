package kr.ac.yeongnam.day10.homework;

public class Dice implements Game {

	@Override
	public int startGame(int you) {
		int me = (int) (Math.random() * 3) + 1;
		
		if(me == you) {
			System.out.println("You win");
			return 1;
			
		} else {
			System.out.println("You lose");
			return 0;
		}

	}

}
