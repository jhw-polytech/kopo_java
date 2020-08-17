package kr.ac.jinwoo.day10.homework2;

public abstract class WinLoseJudgeableGame extends LoggableGame implements WinLoseJudgeable {

	protected final static int DRAW = 2, WIN = 1, LOSE = 0;
	
	protected int win, lose, draw;
	
	public int getWin() { return win; }
	public int getLose() { return lose; }
	public int getDraw() { return draw; }
	
	@Override
	public int win() {
		System.out.println("You win");
		win++;
		return WIN;
	}
	
	@Override
	public int draw() {
		System.out.println("Draw.");
		draw++;
		return DRAW;
	}
	
	@Override
	public int lose() {
		System.out.println("You lose");
		lose++;
		return LOSE;
	}
	
}
