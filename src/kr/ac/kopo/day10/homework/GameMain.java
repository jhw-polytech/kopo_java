package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		GameInstance gp = new GameInstance();
		ScissorsRockPaper scrp;
		Dice dice;
		int select;

		loop: while (true) {
			String choice;

			check: while (true) {
				System.out.println("게임을 선택하세요");
				System.out.println("A. 가위바위보");
				System.out.println("B. 주사위 값 맞추기");
				System.out.println("C. 종료");

				choice = sc.nextLine();

				if (choice != "A" && choice != "a"
					&& choice != "B" && choice != "b"
					&& choice != "C" && choice != "c") {
					System.out.println("다시 입력하세요");
				} else {
					break check;
				}
			}

			switch (choice) {
			case "a":
			case "A":
				scrp = new ScissorsRockPaper();
				System.out.println("가위바위보 게임입니다.");
				System.out.println("가위바위보 중 하나를 선택하세요.");
				System.out.println("1: 가위, 2: 바위, 3: 보");

				check: while (true) {
					select = sc.nextInt();
					sc.nextLine();
					if (select != 1 && select != 2 && select != 3) {
						System.out.println("다시 입력하세요");
					} else {
						scrp.startGame(select);
						break check;
					}
				}
				break;
			case "b":
			case "B":
				dice = new Dice();
				System.out.println("주사위 값 맞추기 게임입니다.");
				System.out.println("주사위를 선택하세요(1~6값 중 하나)");

				check: while (true) {
					select = sc.nextInt();
					sc.nextLine();
					if (select != 1 && select != 2 && select != 3 && select != 4 && select != 5 && select != 6) {
						System.out.println("다시 입력하세요");
					} else {
						dice.startGame(select);
						break check;
					}
				}
				break;
			case "c":
			case "C":
				break loop;
			}
		}

		System.out.println("게임을 종료합니다.");
		System.out.printf("당신의 게임 전적은 %d승 %d패 %d무입니다", gp.getWin(), gp.getLose(), gp.getDraw());

		sc.close();
	}

}
