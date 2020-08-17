package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class GameMain {
	static int[] scores = new int[3]; // 스코어를 인덱스로 저장해 관리한다. 0:패 1:승 2:무
	static Game game; // 인터페이스의 다형성
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		stop: while (true) {
			System.out.println("게임을 선택하세요.\n A. 가위바위보 \n B. 주사위 값 맞추기 \n C. 종료");
			String selectAlp = scanner.next();
			scanner.nextLine();
			switch (selectAlp.charAt(0)) {
			case 'A':
			case 'a':
				while (true) {
					System.out.println("가위바위보 게임입니다. \n 가위바위보중 하나를 선택하세요. \n (1:가위, 2:바위, 3:보) ");
					int you = Integer.parseInt(scanner.nextLine());
					Boolean check = Acheck(you);
					if (check) { // true가 반환되면 제대로 입력되어 게임을 실행했으므로 while을 빠져나온다.
						break;
					}
				}
				break;
			case 'B':
			case 'b':
				while (true) {
					System.out.println("주사위 값 맞추기 게임입니다. \n 주사위를 선택하세요(1~6값 중 하나)");
					int you = Integer.parseInt(scanner.nextLine());
					Boolean check = Bcheck(you);
					if (check) { // true가 반환되면 제대로 입력되어 게임을 실행했으므로 while을 빠져나온다.
						break;
					}
				}
				break;
			case 'C':
			case 'c':
				System.out.println("게임을 종료합니다.");
				System.out.printf("당신의 게임 전적은 %d승 %d패 %d무 입니다.", scores[1], scores[0], scores[2]);
				break stop;
			default:
				System.out.println("다시 입력하세요.");
			
			}	
		}
		scanner.close();
	}
	
	
	public static boolean Acheck(int you) {
		if ( 0 >= you && you >= 4 ) {
			System.out.println("다시 입력하세요.");
			return false;
		}
		game = new ScissorsRockPaper();
		int result = game.startGame(you);
		scores[result] += 1;
		return true;
	}
	
	public static boolean Bcheck(int you) {
		if ( 0 >= you && you >= 7 ) {
			System.out.println("다시 입력하세요.");
			return false;
		}
		game = new Dice();
		int result = game.startGame(you);
		scores[result] += 1;
		return true;
	}
	
}
