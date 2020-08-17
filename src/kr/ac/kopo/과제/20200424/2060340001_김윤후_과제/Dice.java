package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class Dice implements Game {

	
	Scanner sc=new Scanner(System.in);

	int result=0;

	
	
	public int startGame(int you) {

		
		
		
		
		int me=(int)(Math.random()*6)+1;
		
		if(me==you) {
			System.out.println("You Win");
			result=1;
			
		}
		else if(me!=you) {
			System.out.println("You Lose");
			result=-1;
		}
		
	return result;
		
		
	}
}
