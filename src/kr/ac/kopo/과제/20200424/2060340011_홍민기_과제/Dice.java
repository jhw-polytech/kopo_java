package kr.ac.kopo.day10.homework;

public class Dice implements Game {

	@Override
	public int startGame(int you) {
		
		int me = (int)(Math.random()*3)+1;
		
		System.out.print("주사위의 눈은 "+me+"입니다. ");
		
		if(you==me) {
			System.out.println("You win");
			return 1;
		}
		System.out.println("You lose");
		return 0;
	}
}
