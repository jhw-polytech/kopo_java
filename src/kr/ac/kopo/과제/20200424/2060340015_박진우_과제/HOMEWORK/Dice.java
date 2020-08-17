package kr.ac.jinwoo.day10.homework;

public class Dice implements Game {

	private int win() {
		System.out.println("You win\n");
		return 1;
	}
	
	private int lose() {
		System.out.println("You lose\n");
		return 0;
	}
	
	@Override
	public int startGame(int you) {
		
		int ret = -1;
		int me = (int)(Math.random()*6) + 1;
		
		if(you == me) 
			ret = win();
		else
			ret = lose();
		
		return ret;
	}
}
