package kr.co.hana.day10.homework;

import java.util.Scanner;

public class GameMain {
	
	/*	
	 * 반복되는 print 따로 빼주면서 static으로 선언했는데 문제가 없는지 => 확인필요
	 * 요구 명세에 "게임에서 이긴경우만 1을 반환하고 나머지 경우 0 반환합니다" 의미랑 구현 => 확인필요 
	 * ScissorRockPaper의 변수 사용안함. => 확인필요

	 	==> 
		 그냥 편하게 작성하시면 되었어요~~~
		 choiecgame(), choiceScissorRockPaper(), choiceDice()들을 GameMain 클래스에 작성하지 않고 Control Class를 하나더 작성하면 static을 사용하지 않고 구현하실 수 있을 거 같아요
		 ScissorRockPaper는 제가 중간에 변경하면서 사용을 안하게 되었네요 ㅜㅜ
	 */
	
	static Scanner sc = new Scanner(System.in);
	static int win = 0;
	static int lose = 0;
	static int tie = 0;
	static char input = 0;
	static int you;

	public static void choiceGame() {
		System.out.printf("가위바위보 게임입니다.\n 가위바위보중 하나를 선택하세요.\n (1.가위 2.바위 3.보)");
		you = sc.nextInt();
		sc.nextLine();
	}

	public static void choiceScissorRockPaper() {
		System.out.printf("게임을 선택하세요.\n A. 가위바위보 \n B. 주사위 값 맞추기 \n C. 종료");
		input = sc.nextLine().charAt(0);
	}

	public static void choiceDice() {
		System.out.printf("주사위 값 맞추기 게임입니다.\n주사위 값을 선택하세요\n (1~6값 중 하나)");
		you = sc.nextInt();
		sc.nextLine();
	}

	public static void main(String[] args) {

		while (input != 'C' && input != 'c') {
			GameMain.choiceScissorRockPaper();

			if (input == 'A' || input == 'a') {
				GameMain.choiceGame();

				while (you != 1 && you != 2 && you != 3) {
					System.out.print("다시 입력하세요.\n");
					GameMain.choiceGame();
				}

				ScissorRockPaper srp = new ScissorRockPaper();
				srp.startGame(you);

			} else if (input == 'B' || input == 'b') {
				GameMain.choiceDice();

				while (you > 6 || you < 1) {
					System.out.printf("다시 입력하세요.\n");
					GameMain.choiceDice();
				}
				Dice dice = new Dice();
				dice.startGame(you);
			} else if (input == 'C' || input == 'c') {
				System.out.println("게임을 종료합니다.");
				System.out.println("당신의 게임 전적은 " + win + "승" + lose + "패" + tie + "무");
			} else {
				System.out.println("다시 입력해주세요.");
			}

		}

	}
}
