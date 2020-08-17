package lottogame;

import java.util.Random;

/*
	진희씨... 2차원배열이 왜 필요했을까요????
	흠.... 궁금하네...
*/

public class Lotto {
	Random ran = new Random();
	int lotto[][] = null;

	void printLotto(int count , int printCount) {
		for (int i = 0; i < count; i++) {
			System.out.print("게임 " + (i + 1) + " : [ ");
			for (int n = 0; n < printCount; n++) {
				System.out.print(lotto[i][n] + " ");
			}
			System.out.println("]");

		}
	}

	void basicSet(int count) {
		lotto = new int[count][45];
		for (int i = 0; i < lotto.length; i++) {
			for (int n = 0; n < lotto[i].length; n++) {
				lotto[i][n] = n + 1;
			}
		}
		//printLotto(count , 45);
	}

	void suffleSet(int count) {
		for (int i = 0; i < count; i++) {
			for (int n = 0; n < 1000; n++) {
				int r = ran.nextInt(45);
				int temp = lotto[i][r];
				lotto[i][r] = lotto[i][0];
				lotto[i][0] = temp;
			}
		}
	}

	void setLotto(int count) {
		basicSet(count);
		suffleSet(count);
		printLotto(count , 6);
	}
}
