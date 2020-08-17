package kr.ac.kopo.day10.homework;

public class ScissorsRockPaper implements Game {

	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;
	
	int result; // 승, 패, 무의 결과를 받기 위한 변수선언

	@Override
	public int startGame(int you) {	// 메소드 오버라이딩

		int me = (int) (Math.random() * 3 + 1);
		
		// 가위바위보에서 발생할 수 있는 모든 경우의 수
		// 교수님 혹시 과제풀이시간에 이보다 더 간단하게 할 수 있는 방법 알려주실 수 있을까요?
		/*
			네네~~ 수업시간에 잠시 언급하겠습니다!!! ^^
		*/
		
		if (me == 1 && you == 1) {
			System.out.println("비겼습니다.");
		}
		if (me == 1 && you == 2) {
			System.out.println("You win");
			result++;
		}
		if (me == 1 && you == 3) {
			System.out.println("You lose");
			result--;
		}
		if (me == 2 && you == 2) {
			System.out.println("비겼습니다.");
		}
		if (me == 2 && you == 3) {
			System.out.println("You win");
			result++;
		}
		if (me == 2 && you == 1) {
			System.out.println("You lose");
			result--;
		}
		if (me == 3 && you == 3) {
			System.out.println("비겼습니다.");
			result--;
		}
		if (me == 3 && you == 1) {
			System.out.println("You win");
			result++;
		}
		if (me == 3 && you == 2) {
			System.out.println("You lose");
			result--;
		}
		return result;
	}
}
