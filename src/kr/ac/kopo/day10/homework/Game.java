package kr.ac.kopo.day10.homework;


public interface Game {
	
	// 사용자의 입력값을 확인하는 메소드
	public int check(int choice);
	
	// 게임이 진행되는 메소드
	public void startGame(int you);
	

}
