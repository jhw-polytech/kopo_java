package kr.ac.kopo.day10.homework;

import java.util.Random;

public class ScissorsRockPaper implements Game {
	
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
	int draw;
	
	ScissorsRockPaper(){
		
	}
	
	ScissorsRockPaper(int draw){
		this.draw = draw;
	}
	
	
	
	public int startGame(int you) {
		
		Random r = new Random();
		int me = r.nextInt(3) + 1;
		int cnt = 0;
		
		
		
		
		if(me == you) {
			System.out.println("비겼습니다");
			draw++;
		}
			
		
		if(me == SCISSOR) {
			if(you == PAPER) {
				System.out.println("You lose");
			}else if(you == ROCK) {
				System.out.println("You win");
				cnt++;
			}
		}
		
		if(me == ROCK) {
			if(you == SCISSOR) {
				System.out.println("You lose");
			}else if(you == PAPER) {
				System.out.println("You win");
                cnt++;
			}
		}
		
		if(me == PAPER) {
			if(you == SCISSOR) {
				System.out.println("You win");
				cnt++;
			}else if(you == ROCK) {
				System.out.println("You lose");
			}
		}
			
		return cnt;	
		
	}
	

}
