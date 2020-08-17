package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class GameMain {
	public static int win;
	public static int lose;
	public static int tie;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ipt = 0;
		int num=-1;
		Scanner sc = new Scanner(System.in);
		int result;

		while (ipt != 'C') {
			System.out.println("게임을 선택하세요.");
			System.out.println("  A. 가위바위보");
			System.out.println("  B. 주사위 값 맞추기");
			System.out.println("  C. 종료");

			ipt = sc.next().charAt(0);

			if (ipt == 'A') {
				while(4<=num || num<=0) {
					System.out.println(">가위바위보 게임입니다.");
					System.out.println("가위, 바위, 보 중 하나를 선택하여 숫자를 입력하세요");
					System.out.println("( 1:가위,  2:바위,  3:보 )");
					num = sc.nextInt();
					sc.nextLine();
				}
				ScissorsRockPaper srp = new ScissorsRockPaper();
				result = srp.startGame(num);
				if (result == 0) {
					System.out.println("you lose\n");
				} else if (result == 1) {
					System.out.println("you win\n");
				} else {
					System.out.println("tie\n");
				}
				num=-1;

			} else if (ipt == 'B') {
				while(7<=num || num<=0) {
					System.out.println(">주사위 값 맞추기 게임입니다.");
					System.out.println("1~6 사이의 주사위 값을 선택하세요");
					num = sc.nextInt();
					sc.nextLine();
				}
				Dice dice = new Dice();
				result = dice.startGame(num);
				if (result == 0) {
					System.out.println("you lose\n");
				} else if (result == 1) {
					System.out.println("you win\n");
				} else {
					System.out.println("tie\n");
				}
				num=-1;
			} else if (ipt == 'C') {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("**다시 입력하세요!**");
			}
		}

		System.out.printf("당신의 게임 전적은 %d승 %d패 %d무 입니다.", win, lose, tie);
	}

}
