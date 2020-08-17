package kr.ac.kopo.day10.homework;

public class Dice implements Game {
	
	int you;
	int me;
	int result=1;
	
	@Override
	public int startGame(int you) {
		this.you = you;
		this.me = (int)(Math.random()*6)+1;
		
		if(you==me) {
			System.out.println("You win");
			result++;
		}else{
			System.out.println("You lose");
			result--;
		}
		return result;
	}

}
