package kr.ac.kopo.day10.homework;

public class ScissorsRockPaper implements Game {
	
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	
	int you;
	int me;
	int result=1;
	
	@Override
	public int startGame(int you) {
		this.you = you;
		this.me = (int)(Math.random()*3)+1;
		
		if(you==me) {
			System.out.println("비겼습니다.");
		}else if(you == 3&& me == 1) {
			System.out.println("You lose");
			result--;
		}else if(you == 2&& me == 1) {
			System.out.println("You win");
			result++;
		}else if(you == 1&& me == 2) {
			System.out.println("You lose");
			result--;
		}else if(you == 3&& me == 2) {
			System.out.println("You win");
			result++;
		}else if(you == 3&& me == 1) {
			System.out.println("You win");
			result++;
		}else if(you == 2&& me == 3) {
			System.out.println("You lose");
			result--;
		}
		return result;
	}

}
