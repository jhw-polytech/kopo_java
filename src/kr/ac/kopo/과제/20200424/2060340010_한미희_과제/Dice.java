package kr.ac.kopo.day10.homework;

public class Dice implements Game {

	@Override
	public int startGame(int you) {
		//난수 1~6의 값을 구한다
		int me = (int) (Math.random()*6 + 1);
		
		//사용자가 이긴 경우
		if(me == you) {
			System.out.println("You win");
			return 1;
			
		//사용자가 진 경우	
		}else {
			System.out.println("You lose");
			return 0;
		}
	}
}
