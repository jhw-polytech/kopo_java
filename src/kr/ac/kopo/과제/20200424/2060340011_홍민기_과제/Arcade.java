package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class Arcade {
	
	private Game game;
	private Scanner sc;
	private int win;
	private int lose;
	private int drow;

	void insertCoin(){
		while(true) {
			sc = new Scanner(System.in);
			
			game = null;
			
			System.out.println("게임을 선택하세요");
			System.out.println("  A. 가위바위보");
			System.out.println("  B. 주사위 값 맞추기");
			System.out.println("  C. 종료");
			System.out.print("입력 : ");
			String choice = sc.nextLine();
			if(choice.equals("A")) {
				game = new ScissorsRockPaper();
			}
			else if(choice.equals("B")) {
				game = new Dice();
			}
			else if(choice.equals("C")) {
				System.out.println("종료합니다.");
				totalScore();
				break;
			}
			else {
				System.out.println("잘못된 입력 입니다. 다시 입력하세요.");
			}
			
			if(game instanceof ScissorsRockPaper) {
				playSRP();
			}
			else if(game instanceof Dice) {
				playDice();
			}
		}
	}
	void playSRP() {
		System.out.println("가위바위보 게임입니다.");
		System.out.println("가위바위보중 하나를 선택하세요.");
		System.out.println("(1:가위, 2:바위, 3:보)");
		System.out.print("입력 : ");
		int you = sc.nextInt();
		sc.nextLine();
		if(you<1 || you>3) {
			System.out.print("다시 입력하세요. : ");
			you = sc.nextInt();
			sc.nextLine();
		}
		int result = game.startGame(you);
		if(result == -1) {
			this.drow++;
		}
		if(result == 1) {
			this.win++;
		}
		if(result == 0) {
			this.lose++;
		}
	}
	
	void playDice() {
		System.out.println("주사위 값 맞추기 게임입니다.");
		System.out.println("주사위를 선택하세요(1~6값 중 하나)");
		System.out.print("입력 : ");
		int you = sc.nextInt();
		sc.nextLine();
		if(you<1 || you>6) {
			System.out.print("다시 입력하세요. : ");
			you = sc.nextInt();
			sc.nextLine();
		}
		int result = game.startGame(you);

		if(result == 1) {
			this.win++;
		}
		if(result == 0) {
			this.lose++;
		}
	}
	
	void totalScore() {
		System.out.println("게임을 종료합니다.");
		System.out.println("당신의 게임 전적은 "+this.win+"승 "+this.lose+"패 "+this.drow+"무 입니다.");
	}
	
}
