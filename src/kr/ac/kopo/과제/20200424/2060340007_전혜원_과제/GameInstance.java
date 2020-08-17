package kr.ac.kopo.day10.homework;


public class GameInstance implements Game {

	private static int win = 0;
	private static int lose = 0;
	private static int draw = 0;


	public GameInstance() { }
	

	@Override
	public void startGame(int you) {
		// TODO Auto-generated method stub
	}

	// 승패를 나타내는 멤버변수의 getter, setter
	public int getWin() {
		return win;
	}

	public int getLose() {
		return lose;
	}

	public int getDraw() {
		return draw;
	}

	public void setWin(int win) {
		GameInstance.win = win;
	}

	public void setLose(int lose) {
		GameInstance.lose = lose;
	}

	public void setDraw(int draw) {
		GameInstance.draw = draw;
	}




}
