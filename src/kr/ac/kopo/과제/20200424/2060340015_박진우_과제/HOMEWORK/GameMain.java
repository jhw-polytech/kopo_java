package kr.ac.jinwoo.day10.homework;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String cmd;
		
		int judge;
		int[] loseWinDraw = new int[3]; 
		
		Game game = null;
		
		ScissorsRockPaper srpGame = new ScissorsRockPaper();
		Dice diceGame = new Dice();
		
		while(true) {
			System.out.println("게임을 선택하세요");
			System.out.println("\tA. 가위바위보");
			System.out.println("\tB. 주사위 값 맞추기");
			System.out.println("\tC. 종료");
			
			cmd = sc.nextLine();
			int you;
			
			// 가위바위보
			if(cmd.equals("a") || cmd.equals("A")) {
				
				System.out.println("\n가위바위보 게임입니다.");
				while(true) {
					System.out.print("가위바위보 중 하나를 선택하세요.");
					System.out.print("(1:가위, 2:바위, 3:보) : ");
					you = Integer.parseInt(sc.nextLine());
					System.out.println();
					if(0 < you && you <= 3)
						break;
					System.out.print("다시 입력하세요 : ");
					System.out.println();
				}
				game = srpGame;
				judge = game.startGame(you);
				
				if(judge == 0) loseWinDraw[0]++;
				else if(judge == 1) loseWinDraw[1]++;
				else if(judge == 2) loseWinDraw[2]++;
			}
			// 주사위 게임
			else if(cmd.equals("b") || cmd.equals("B")) {
				
				System.out.println("\n주사위 게임입니다.");
				while(true) {
					System.out.print("주사위를 선택하세요(1~6 값중 하나) : ");
					you = Integer.parseInt(sc.nextLine());
					if(0 < you && you <= 6)
						break;
					System.out.println("다시 입력하세요.");
				}
				game = diceGame;
				judge = game.startGame(you);
				
				if(judge == 0) loseWinDraw[0]++;
				else if(judge == 1) loseWinDraw[1]++;
				else if(judge == 2) loseWinDraw[2]++;
			}
			// 종료
			else if(cmd.equals("c") || cmd.equals("C")) {
				System.out.println("게임을 종료합니다.");
				System.out.printf("당신의 게임 전적은 %d승 %d패 %d무 입니다.\n", loseWinDraw[1], loseWinDraw[0], loseWinDraw[2]);
				break;
			}
			else
				System.out.println("다시 입력하세요.\n");
		}		
	}
}
