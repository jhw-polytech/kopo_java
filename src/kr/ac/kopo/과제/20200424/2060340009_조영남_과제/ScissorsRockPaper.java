package kr.ac.yeongnam.day10.homework;

public class ScissorsRockPaper implements Game {

	final static int SCISSOR = 1; // 가위
	final static int ROCK = 2; // 바위
	final static int PAPER = 3; // 보
	
	@Override
	public int startGame(int you) {
		
		int me = (int) (Math.random() * 3) + 1;
		
		if(you == me) {
			System.out.println("비겼습니다.");
			return 2;
			
		} else if((me == 1 && you == 3) || (me == 2 && you == 1) || (me == 3 && you == 2)) {
			System.out.println("You lose");
			return 0;
			
		} else {
			System.out.println("You win");
			return 1;			
		} 

	}

}

