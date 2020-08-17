package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class ScissorsRockPaper implements Game{
	final static int SCISSOR = 1; //가위
	final static int ROCK = 2; //바위
	final static int PAPER = 3; //보
	
	@Override
	public int startGame(int you) {
		int re = 0;
		int r = (int)(Math.random() * 3) + 1;
		
		System.out.println("가위바위보 게임입니다.");
		
		System.out.println("가위바위보중 하나를 선택하세요.");
		System.out.println("1:가위, 2:바위, 3:보");
		int me = 0;
		while(true) {
			me = GameMain.scan.nextInt();
			
			if(me >= 1 || me <=3) {
				break;
			}else {
				System.out.println("다시입력하세요.");
			}
		}
		
		
		if(me == r) {
			System.out.println("비겼습니다.");
		}if(me == SCISSOR && r == ROCK) {
			System.out.println("You lose");
			re = 2;
		}else if(me == ROCK && r == PAPER) {
			System.out.println("You lose");
		}else if(me == PAPER && r == SCISSOR) {
			System.out.println("You lose");
		}else if(me == SCISSOR && r == PAPER) {
			System.out.println("You win");
			re = 1;
		}else if(me == ROCK && r == PAPER) {
			System.out.println("You win");
			re = 1;
		}else if(me == PAPER && r == SCISSOR) {
			System.out.println("You win");
			re = 1;
		}
		
		return re;
	}

}
