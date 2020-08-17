package kr.ac.kopo.assignment.day10;

import java.util.Scanner;

public class GameMenu {
	
	private Scanner sc;
	
	public GameMenu() {		
		sc = new Scanner(System.in);
	}
	
	//게임을 선택하는 메소드
	public char select() {
		
		char userSelect = 0;
		
		while(userSelect < 65 || userSelect > 67) {
			
			System.out.println("---------------------");
			System.out.println("게임을 선택하세요");
			System.out.println("A. 가위바위보");
			System.out.println("B. 주사위 값 맞추기");
			System.out.println("C. 종료");
			
			userSelect = sc.nextLine().charAt(0);	
			//A, B, C를 입력하면 while문 빠져나옴
			
			if(userSelect < 65 || userSelect > 67) {
				System.out.println("다시 입력하세요.");
			}
		}
		
		return userSelect;
	}
	
	//선택한 게임을 실행하는 메소드
	public void execute() {
		
		boolean gameExecute = true;
		
		while(gameExecute) {
			
			char userSelect = select();

			
			if(userSelect == 'A') {
				//가위바위보 게임
				ScissorsRockPaper srp = new ScissorsRockPaper();
				srp.printGame();							
			}else if(userSelect == 'B') {
				//주사위 게임
				Dice dice = new Dice();
				dice.printGame();
			}else {
				GameSuper gameSup = new GameSuper();
				gameSup.finalResult();
				gameExecute = false;				
			}
		}
		
		
	}
	
	

}
