package shlee1993.day10.homework;

import java.util.Scanner;

//12라인에 질문있습니다.
//진행 중 너무 헷갈려서 you, me의 단어대신 player, computer로 작성했습니다.

public class GameMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int win = 0, lose = 0, draw = 0;
		//0으로 초기화를 안했더니 57, 60, 63라인에서 에러가 났습니다.
		//원래 초기화를 안하면 int 값의 디폴트 값인 0으로 자동으로 초기화가 되는 것 아닌가요? 에러가 나는 이유가 궁금합니다.
		/*
			자동으로 초기화되는 변수느 멤벼변수와 new를 한 인스턴스 객체만이에요
			int win, lose, draw는 지역변수여서 직접 초기화를 해줘야 합니다
		*/

		int result = 0, player;	//여기 result 값도 마찬가지 입니다.

		end: while (true) {
			System.out.println("게임을 선택하세요.");
			System.out.printf("A. 가위바위보\nB. 주사위 값 맞추기\nC. 종료\n");

			char gameSelect = sc.nextLine().charAt(0);

			switch (gameSelect) {
			//가위바위보 게임
			case 'A':
				System.out.println("가위바위보 게임입니다.");
				System.out.println("가위바위보중 하나를 선택하세요.");
				System.out.println("1.가위 2.바위 3.보");
				player = Integer.parseInt(sc.nextLine());

				ScissorsRockPaper srp = new ScissorsRockPaper();
				result = srp.startGame(player);	//result에 값을 저장하고 break
				break;

			//주사위 게임
			case 'B':
				System.out.println("주사위 값 맞추기 게임입니다.");
				System.out.println("1~6 중 하나를 선택하세요.");
				player = Integer.parseInt(sc.nextLine());

				Dice dice = new Dice();
				result = dice.startGame(player);	//result에 값을 저장하고 break
				break;

			//게임 끝
			case 'C':
				break end;

			default:	//A, B, C외 기타입력시 에러 출력
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			
			//결과저장 switch문
			switch (result) {
			case 0:
				draw++;
				break;
			case 1:
				win++;
				break;
			case 2:
				lose++;
				break;
			}
		}

		sc.close();
		System.out.println("게임을 종료합니다.");
		System.out.printf("당신의 전적은 %d승 %d패 %d무 입니다.", win, lose, draw);
	}
	
}
