package kr.ac.kopo.day10.homework;

import java.util.Random;

public class Dice extends GameInstance {

	Random r = new Random();
	
	@Override
	public void startGame(int you) {
		int me = r.nextInt(5)+1;
		
		if(me == you) {
			System.out.println("You win");
			setWin(getWin()+1);
		} else {
			System.out.println("You lose");
			setLose(getLose()+1);
		}
		
	}

	
	
}
