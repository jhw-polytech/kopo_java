package jaeheehomework;

import java.util.Scanner;

public class GamePlay {
	
private Scanner sc;
	
	private char gameChar;      // 게임 A B C 고르는 변수
	private Game gameNow;       // 형변환을 위해 부모클래스 변수를 미리 선언
	
	private int winNum;         // 축적 승
	private int drawNum;        // 축적 무
	private int loseNum;        // 축적 패

	private int gameNum;        // 가위바위보에서는 1, 2, 3 중 하나, 주사위에서는 1, 2, 3, 4, 5, 6 중 하나 

	
	//생성자
	GamePlay(){
		sc = new Scanner(System.in);
	}
	
	// 게임 고르는 메소드 
	public void start() {
		
		while (true) {
			System.out.println("게임을 선택하세요");
			System.out.println("\tA. 가위바위보");
			System.out.println("\tB. 주사위 값 맞추기");
			System.out.println("\tC. 종료");
			gameChar = sc.nextLine().charAt(0);
			
			if (gameChar == 'A' || gameChar == 'B' || gameChar == 'C') {
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
		}
	}
	
	// 가위바위보 시작하는 메소드
	public void rspMain() {
		
		while(true) {
			System.out.println("가위바위보 게임입니다.");
			System.out.println("가위바위보 중 하나를 선택하세요.");
			System.out.println("1: 가위,  2: 바위,  3:보");
			gameNum = Integer.parseInt(sc.nextLine());
			
			if(gameNum == 1 || gameNum == 2 || gameNum == 3) {
				break;
			} else {
				System.out.println("다시 선택하세요!");
			}
		}
	}
	
	// 주사위 시작하는 메소드
	public void diceMain() {

		while (true) {
			System.out.println("주사위 값 맞추기 게임입니다.");
			System.out.println("주사위를 선택하세요(1~6) 선택하세요.");
			gameNum = Integer.parseInt(sc.nextLine());

			if (gameNum == 1 || gameNum == 2 || gameNum == 3 || gameNum == 4 || gameNum == 5 || gameNum == 6) {
				break;
			} else {
				System.out.println("다시 선택하세요!");
			}
		}
	}
	


	// 묵시적 형변환 후 게임 시행
	// return값 받아서 승무패 축적하기
	public void gamePlay() {
		if (gameChar == 'A') {
			rspMain();
			gameNow = new ScissorsRockPaper();
		} else {
			diceMain();
			gameNow = new Dice();
		}
		
		int gameResult = gameNow.startGame(gameNum);    // 조건에 맞게 오버로딩된 게임의 startGame 메소드를 호출
		
		if(gameResult == -1) {
			drawNum++;
		} else if(gameResult == 0) {
			loseNum++;
		} else {
			winNum++;
		}
	}
	

	// 게임 진행하기
	public void gameMain() {
		while(true) {
			start();
			if(gameChar == 'C') {
				break;	
			} 
			gamePlay();
		}
		System.out.println("게임을 종료합니다.");
		System.out.printf("당신의 게임 전적은 %d승 %d패 %d무입니다.", winNum, loseNum, drawNum);
		
		
	}
}


