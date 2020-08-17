package kr.ac.kopo.day10.homework;

import java.util.Random;

public class ScissorsRockPaper extends GamePlay {

	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;	

	public ScissorsRockPaper() { }

	@Override
	public void startGame(int you) {
		Random r = new Random();

		int me = r.nextInt(2) + 1;

		if (me == 1 && you == 3) {
			System.out.println("You lose");
			setLose(getLose() + 1);

		} else if (me == 1 && you == 2) {
			System.out.println("You win");
			setWin(getWin() + 1);

		} else if (me == 2 && you == 1) {
			System.out.println("You lose");
			setLose(getLose() + 1);

		} else if (me == 2 && you == 3) {
			System.out.println("You win");
			setWin(getWin() + 1);

		} else if (me == 3 && you == 1) {
			System.out.println("You lose");
			setLose(getLose() + 1);

		} else if (me == 3 && you == 1) {
			System.out.println("You win");
			setWin(getWin() + 1);

		} else {
			System.out.println("Draw!");
			setDraw(getDraw() + 1); //나머지 경우는 모두 비긴걸로 처리
		}

	}

}
