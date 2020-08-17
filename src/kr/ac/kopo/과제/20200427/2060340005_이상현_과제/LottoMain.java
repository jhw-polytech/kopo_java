package shlee1993.day11.homework;

import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		int playerNum = 0;
		Scanner sc = new Scanner(System.in);

		try {
			while (true) {
				System.out.println("좋아하는 번호를 입력하세요(1~45) : ");
				playerNum = Integer.parseInt(sc.nextLine());

				if (0 < playerNum && playerNum < 46) {
					sc.close();
					break;
				} else
					throw new LottoNumberException("1 - 45 사이의 정수만 가능합니다.");
			}

			LottoRandom lr = new LottoRandom(playerNum);
			lr.start();
			lr.printNumber();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
