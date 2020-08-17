package exam0424;

import java.util.Scanner;

public class ScissorsRockPaper implements Game{
	
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int PAPER = 3;

	@Override
	public int startGame(int you) {
		
		int me = (int) (Math.random()*3) + 1;
		
		// 이렇게 한줄로 여러 조건을 나열해도 되나 싶어서 해봤는데 
		// 효율적이지 않은 코드라면, 코멘트 남겨주세요!!
		
		if ((you == 3 && me == 2) || (you == 2 && me == 1) || (you == 1 && me == 3)) {
			return 1;
		}  else if (you == me) {
			System.out.println("\n비겼습니다!\n");
			//이긴 경우 1 나머지 0으로 하라고 하셨는데,
			//비긴 경우도 0을 return하면 무승부를 세고자 코드를 작성해야 해야할 것 같아 2를 리턴했습니다.
			return 2;
		}
		return 0;
	}

}
