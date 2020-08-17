package kr.co.hana.day10.homework;

public class ScissorRockPaper implements Game {

	// 필드
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	// startGame
	public int startGame(int you) {
		int me = (int) (Math.random() * 3) + 1;
		if (you == me) {
			System.out.println("비겼습니다.");
			return GameMain.tie++;
		} else if (you == 1 && me == 3) {
			System.out.println("You Win");
			return GameMain.win++;
		} else if (you > me) {
			System.out.println("You Win");
			return GameMain.win++;
		} else {
			System.out.println("You Lose");
			return GameMain.lose++;
		}

	}

}
