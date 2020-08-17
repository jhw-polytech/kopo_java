package kr.ac.kopo.day10.homework;

import java.util.Random;

public class Dice  implements Game  {
	
	private int me;
	private int result=2; //이기면 1, 지면0 반환, 2는 무승부
	
	
	@Override
	public int startGame(int you) {
		Random r = new Random();
		me = (r.nextInt(6)+1);
		if (me==you) {
			GameMain.tie++;
		}
		else if(me<you) {
			GameMain.win++;
			result=1;
		}
		else {
			GameMain.lose++;
			result=0;
		}
		
		return result;
	}

}
