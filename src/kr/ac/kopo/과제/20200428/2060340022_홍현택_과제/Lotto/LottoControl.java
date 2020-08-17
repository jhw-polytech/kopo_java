package kr.co.hana.homework12.Lotto;

import java.util.Scanner;

public class LottoControl {
	public static int cntGame;

	static void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("게임수를 입력하세요 : ");
		cntGame = sc.nextInt();
	}
}
