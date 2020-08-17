package kr.ac.jinwoo.day10.homework;

/*
 * 명세서 대로 startGame의 리턴 값을 오직 0, 1 로 하던 중에
 * 승부결과를 내부 변수로 저장하게 되었고 getter 사용하게 되면서
 * 오히려 명세서의 스펙을 너무 벗어나게 되는 것 같아 리턴 값에 비긴 결과 2를 추가하였습니다. 
 * 
 * 이 클래스에서만 사용할 private 메소드는 사양서를 벗어나도 된다고 생각하였는데 맞는 판단인가 싶습니다.
   => 네네 괜찮아요... 사실 final이라.. 뭐 상관은 없었을거에요~~ ^^
 */

public class ScissorsRockPaper implements Game {

	private final static int SCISSOR = 1, ROCK = 2, PAPER = 3;
	
	@Override
	public int startGame(int you) {
		
		int ret = -1;
		int me = (int)(Math.random()*3) + 1;
		
		// draw case
		if(me == you) {
			System.out.println("비겼습니다.\n");
			ret = 2;
		}
		// win case
		else if((me == SCISSOR && you == PAPER) || (me == ROCK && you == SCISSOR) || (me == PAPER && you == ROCK)) {
			System.out.println("You win\n");
			ret = 1;
		}
		// lose case
		else { 
			System.out.println("You lose\n");
			ret = 0;
		}
		
		return ret;
	}
}
