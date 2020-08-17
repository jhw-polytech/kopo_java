package lotto;

import java.util.Random;

public class LottoGame4 {
	// 4. Random 클래스
		public void game4() {

			Random r = new Random();
			int[] arr = new int[6];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = r.nextInt(45) + 1;

				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						i--;
					}
				}
				System.out.print(arr[i] + " ");
			}
		}
}
