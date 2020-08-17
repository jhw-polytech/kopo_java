package kr.ac.kopo.day10.homework;

/*
 * 2060340017 신형재 과제 1번
 * 게임 만들기
 * 
 */

import java.util.Scanner;

public class Main {
	public static void main(String args) {
		Scanner sc = new Scanner(System.in);
		ScissorsRockPaper srp = new ScissorsRockPaper();
		Dice dice = new Dice();
		String select = null;
		int user;
		int result;
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		while(!select.equals("C")) {
			System.out.println(" 게임을 선택하세요. ");
			System.out.println(" A. 가위바위보 ");
			System.out.println(" B. 주사위 값 맞추기 ");
			System.out.println(" C. 종료 ");
			select = sc.nextLine();
			if(!select.equals("A")&&!select.equals("B")&&!select.equals("C")) {
				System.out.println(" 다시 입력하세요. ");
				select = sc.nextLine();
			}
			if(select.equals("A")) {
				System.out.println(" 가위바위보 게임입니다. ");
				System.out.println(" 가위, 바위, 보 중 하나를 선택하세요. ");
				System.out.println(" ( 1: 가위, 2: 바위, 3: 보 )");
				user = sc.nextInt();
				sc.nextLine();
				//가위바위보 게임 진행
				result = srp.startGame(user);
				if(result == 2) {
					win++;
				}else if(result == 1) {
					draw++;
				}else if(result == 0 ) {
					lose++;
				}else {
					System.out.println(" 오류");
				}
			}
			if(select.equals("B")) {
				System.out.println(" 주사위 값 맞추기 게임입니다. ");
				System.out.println(" 주사위 값을 선택하세요(1~6 중 하나) ");
				user = sc.nextInt();
				sc.nextLine();
				if((user<1) || (user>6)){
					System.out.println("다시 입력하세요(1~6 중 하나)");
					user = sc.nextInt();
					sc.nextLine();
				}
				//주사위 게임 진행
				result = dice.startGame(user);
				if(result == 2) {
					System.out.println(" You Win ");
					win++;
				}else if(result == 1) {
					System.out.println(" Draw ");
					draw++;
				}else if(result == 0 ) {
					System.out.println(" You Loose");
					lose++;
				}else {
					System.out.println(" 오류");
				}
			}
			if(select.equals("C")) {
				System.out.println(" 게임을 종료합니다. ");
				System.out.printf(" 당신의 게임 전적은 %d승 %d패 %d무입니다. ", win, lose, draw);
			}
		}
	}
}
