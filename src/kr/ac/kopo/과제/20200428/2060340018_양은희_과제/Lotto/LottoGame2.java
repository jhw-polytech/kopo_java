package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LottoGame2 {


	// 2. ArrayList
	public void game2() {
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 1; i <= 45; i++) {
			num.add(i);
		}
		
		Collections.shuffle(num);
		
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			arr[i] = num.get(i);
		}
		System.out.print(Arrays.toString(arr));
	}

}
