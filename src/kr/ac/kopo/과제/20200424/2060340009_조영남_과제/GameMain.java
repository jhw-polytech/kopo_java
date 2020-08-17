package kr.ac.yeongnam.day10.homework;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String game = "";
		int you;
		
		int record = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;

		while(!game.equals("C")) {			
			System.out.println("게임을 선택하세요");
			System.out.println(" A. 가위바위보");
			System.out.println(" B. 주사위 값 맞추기");
			System.out.println(" C. 종료");		
			game = sc.nextLine();	
			
			while(!game.equals("A") && !game.equals("B") && !game.equals("C")) {
				System.out.println("다시 입력하세요");
				game = sc.nextLine();
			}
			
			if(game.equals("A")) {
				System.out.println("가위바위보 게임입니다.");
				System.out.println("가위바위보 중 하나를 선택하세요.");
				System.out.println("1:가위, 2:바위, 3:보");
				you = Integer.parseInt(sc.nextLine());
				
				while(you != 1 && you != 2 && you != 3) {
					System.out.println("다시 입력하세요");
					you = Integer.parseInt(sc.nextLine());				
				}
				
				ScissorsRockPaper srp = new ScissorsRockPaper();
				record = srp.startGame(you);
				
				if(record == 1) {
					win++;
				} else if(record == 0) {
					lose++;
				} else {
					draw++;
				}
								
			} else if(game.equals("B")) {
				System.out.println(">주사위 값 맞추기 게임입니다.");
				System.out.println("주사위를 선택하세요(1~6 값 중 하나)");
				you = Integer.parseInt(sc.nextLine());
				
				while(you != 1 && you != 2 && you != 3 && you != 4 && you != 5 && you != 6) {
					System.out.println("다시 입력하세요");
					you = Integer.parseInt(sc.nextLine());				
				}
				
				Dice d = new Dice();
				record = d.startGame(you);
				
				if(record == 1) {
					win++;
				} else {
					lose++;
				}
				
			} else {
				System.out.println("게임을 종료합니다.");
				System.out.println("당신의 게임 전적은 " + win + "승 " + lose + "패 " + draw + "무 입니다." );
			}
		}
		
	}

}
	
