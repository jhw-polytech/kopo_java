package kr.ac.kopo.day10.homework;


public class ScissorsRockPaper implements Game {
	
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER =3;

	@Override
	public int startGame(int you) {
		
		int me = (int)(Math.random()*3)+1;
		info(me);
		
		if(you==me) {
			System.out.println("비겼습니다.");
			return -1;
		}
		else if((me != PAPER && me <you) ||(me == PAPER && you == SCISSOR)) {
			
			System.out.println("You win");
			return 1;
		}
		else if((me != SCISSOR && me > you) || (me == SCISSOR && you == PAPER)) {
			System.out.println("You lose");
		}

		return 0;
	}

	public void info(int me) {
		if(me == ROCK) {
			System.out.print("컴퓨터는 바위를 냈습니다. ");
		}
		else if(me == SCISSOR) {
			System.out.print("컴퓨터는 가위를 냈습니다. ");
		}
		else {
			System.out.print("컴퓨터는 보를 냈습니다. ");
		}
		
	}
}
