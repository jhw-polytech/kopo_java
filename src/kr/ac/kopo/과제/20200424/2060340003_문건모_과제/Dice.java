package kr.ac.kopo.day10.homework;

import java.util.Random;

public class Dice implements Game {
	
	Dice(){
		
	}
	
	
	
	public int startGame(int you) {
		
		Random r = new Random();
		int me = r.nextInt(6) + 1;
		int cnt = 0;
		
		
		if(me == you) {
			System.out.println("You win");
			cnt++;
		}else {
			System.out.println("You lose");
			
		}
		
		return cnt;
		
	}

}
