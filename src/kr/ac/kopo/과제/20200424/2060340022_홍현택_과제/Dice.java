package kr.co.hana.day10.homework;

public class Dice implements Game {

	public int startGame(int you) {
		int me = (int) ((Math.random() * 6) + 1);
		if (you == me) {
			System.out.println("You Win");
			return GameMain.win;
		} else {
			System.out.println("You Lose");
			return GameMain.lose++;
		}
	}
}
