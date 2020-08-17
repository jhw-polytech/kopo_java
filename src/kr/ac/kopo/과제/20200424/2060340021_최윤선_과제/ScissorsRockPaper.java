package kr.ac.kopo.day10.homework;

import java.util.Random;

public class ScissorsRockPaper implements Game {
	final static int SCISSOR=1;
	final static int ROCK=2;
	final static int PAPER=3;
	private int me;
	private int result=2; //이기면 1, 지면0 반환, 2는 무승부
	
	
			
	@Override
	public int startGame(int you) {
		
		Random r = new Random();
		me = (r.nextInt(3)+1);
		if(me==you) {
			GameMain.tie++;
		}
		else if(me==1) {
			if(you==3) {
				result=0;
				GameMain.lose++;
			}
			else {
				result=1;
				GameMain.win++;
			}
		}
		else if(me==2) {
			if(you==1) {
				result=0;
				GameMain.lose++;
			}
			else {
				result=1;
				GameMain.win++;
			}
		}
		else if(me==3) {
			if(you==1) {
				result=1;
				GameMain.win++;
			}
			else {
				result=0;
				GameMain.lose++;
			}
		}
		
		
		return result;
	}

}
