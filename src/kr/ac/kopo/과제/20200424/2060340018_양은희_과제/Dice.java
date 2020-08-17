package kr.ac.kopo.day10.homework;

public class Dice implements Game {

	int result;	// 승, 패, 무의 결과를 받기 위한 변수선언

	@Override
	public int startGame(int you) {	// 메소드 오버라이딩

		int me = (int) (Math.random() * 6 + 1);

		if (me == you) {
			System.out.println("You win");
			result++;
		} else {
			System.out.println("You lose");
			result--;
		}
		return result;
	}

}
