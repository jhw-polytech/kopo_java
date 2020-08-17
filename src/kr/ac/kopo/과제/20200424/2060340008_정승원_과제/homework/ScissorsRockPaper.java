package kr.ac.kopo.day10.homework;

// Game을 상속받는다.
public class ScissorsRockPaper implements Game{
	final static int SCISSOR = 1; // 가위
	final static int ROCK = 2; // 바위 
	final static int PAPER = 3; // 보

	@Override
	public int startGame(int you) {
		int me = random.nextInt(4)+1;
		if (you == me) {
			System.out.println("비겼습니다.");
			return 2;
		} else if ((you == 1 && me == 2) || (you == 2 && me == 3) || (you == 3 && me == 1)) {
			System.out.println("You win"); 
			return 1;
		} else if ((you == 1 && me == 3) || (you == 2 && me == 1) || (you == 3 && me == 2)) {
			System.out.println("You lose");
			return 0;
		}
		return 0;
	}

}
