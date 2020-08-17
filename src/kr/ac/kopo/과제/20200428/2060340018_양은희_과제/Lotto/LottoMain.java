package lotto;

import java.util.Random;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {

		LottoGame1 g1 = new LottoGame1();
		LottoGame2 g2 = new LottoGame2();
		LottoGame3 g3 = new LottoGame3();
		LottoGame4 g4 = new LottoGame4();

		Scanner sc = new Scanner(System.in);
		System.out.print("게임수를 입력하세요 (최대 4) : ");

		int game = sc.nextInt();

		switch (game) {
		case 4:
			g1.game1();
			System.out.println();

		case 3:
			g2.game2();
			System.out.println();

		case 2:
			g3.game3();
			System.out.println();

		case 1:
			g4.game4();
			break;

		}
	}
}
