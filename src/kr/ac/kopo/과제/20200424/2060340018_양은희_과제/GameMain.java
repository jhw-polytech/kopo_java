package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		// 승, 패, 무의 결과를 변수로 지정 후 결과에 따라 승, 패, 무의 결과를 출력할 수 있도록 한다.
		int win = 0;
		int draw = 0;
		int lose = 0;

		while (true) {

			System.out.println("게임을 선택하세요");
			System.out.println("A. 가위바위보");
			System.out.println("B. 주사위 값 맞추기");
			System.out.println("C. 종료");

			while (true) {
				Scanner sc = new Scanner(System.in);
				String input = sc.next();
				sc.nextLine();

				if (input.equals("A") || input.equals("a")) { // 가위바위보 게임
					System.out.println("가위바위보 게임입니다.\n가위바위보중 하나를 선택하세요.");
					System.out.println("(1:가위, 2:바위, 3:보)");
					int you = Integer.parseInt(sc.nextLine()); // 내가 입력
					ScissorsRockPaper srp = new ScissorsRockPaper(); // 클래스 객체 생성
					int result = srp.startGame(you); // 결과값을 result에 저장
					if (result == 1) {
						win++;
					}
					if (result == 0) {
						draw++;
					} else if (result == -1) {
						lose++;
					}
					break;
				} else if (input.equals("B") || input.equals("b")) { // 주사위 게임
					System.out.println(">주사위 값 맞추기 게임입니다.\n주사위를 선택하세요(1~6값 중 하나)");
					int you = Integer.parseInt(sc.nextLine()); // 내가 입력
					Dice d = new Dice(); // 객체 생성
					int result = d.startGame(you); // 결과값을 result에 저장
					if (result == 1) {
						win++;
					}
					if (result == 0) {
						draw++;
					} else if (result == -1) {
						lose++;
					}
					break;
				} else if (input.equals("C") || input.equals("c")) {
					System.out.println("게임을 종료합니다.");
					System.out.println("당신의 게임 전적은" + win + "승" + lose + "패" + draw + "무 입니다.");
				} else { // 잘못 입력 했을 경우
					System.out.println("게임을 다시 입력하세요.");
					break;
				}
			}
		}
	}
}
