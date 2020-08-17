package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class ScissorsRockPaper implements Game {

	final static int SCISSOR=1;
	final static int Rock=2;
	final static int Paper=3;
	int result=0;
	
	
	Scanner sc=new Scanner(System.in);
	
	
	@Override
	public int startGame(int you) {
		
		
			int me= (int)(Math.random()*3)+1;
		
		
		if(me==you) {
			System.out.println("비겼습니다.");
			result=0;
		}
		
		if(me==1) {
			if(you==3) {
				System.out.println("You lose");
				result=-1;
			}
			else if(you==2){
				System.out.println("You Win");
				result=1;
			}
		}
		
		if(me==2) {
			if(you==1) {
				System.out.println("You lose");
				result=-1;
			}
			else if(you==3){
				System.out.println("You Win");
				result=1;
			}
		}
		if(me==3) {
			if(you==2) {
				System.out.println("You lose");
				result=-1;
			}
			else if(you==1){
				System.out.println("You Win");
				result=1;
			}
		}
		
		return result;
		
		
	}
}
