package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class GameMain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int mywin = 0;
		int mylose = 0;	
		int mydraw = 0;
		
		
		Dice dice = new Dice();
		ScissorsRockPaper srp = new ScissorsRockPaper();
				
		
		
		while(true) {
			System.out.println("A. 가위바위보");
			System.out.println("B. 주사위 값 맞추기");
			System.out.println("C. 종료");
			String sel = scan.next();
			
			
			if(sel.equals("A")) {
				int r = srp.startGame(0);
				if(r==1) {
					mywin += 1;
				}else if(r == 2) {
					mydraw += 1;
				}else if(r == 0){
					mylose += 1;
				}
			}else if(sel.equals("B")){
				int r = dice.startGame(0);
				if(r==1) {
					mywin += 1;
				}else if(r == 0) {
					mylose += 1;
				}				
			}else if(sel.equals("C")) {
				System.out.println("게임을 종료합니다.");
				System.out.println("당신의 게임 전적은 " + mywin + "승 " + mylose + "패 " + mydraw + "무 입니다.");
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
			
		}
		scan.close();
	}
}



