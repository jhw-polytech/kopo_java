package exam0424;

import java.util.Random;
import java.util.Scanner;

public class Dice implements Game{
	
	private int inputNum;
	Scanner sc;

	@Override
	public int startGame(int you) {
		Random r = new Random();
		int me = r.nextInt(6) + 1;
		if (you == me) {
			System.out.println("\nYou win!!\n");
			return 1;
		} 
		System.out.println("\nYou lose..\n");
		return 0;
	}

}
