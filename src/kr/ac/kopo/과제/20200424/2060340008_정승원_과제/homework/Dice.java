package kr.ac.kopo.day10.homework;

//Game을 상속받는다.
public class Dice implements Game{

	@Override
	public int startGame(int you) {
		int me = random.nextInt(7)+1;
		if (you == me) {
			System.out.println("You win");
			return 1;
		} else {
			System.out.println("You lose");
			return 0;
		}
	}
	

}
