package kr.co.hana.homework12.Lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoExtractNum {

	static void gamePlay() {

		for (int l = 1; l <= LottoControl.cntGame; l++) {
			System.out.print("게임 " + l + ": ");
			gameNum4();
			System.out.println();
		}
	}

	// 알고리즘 1 - for문, array 사용
	private static void gameNum1() {
		int[] numArr = new int[6];
		Random r = new Random();

		for (int i = 0; i < 6; i++) { // 6개의 난수 추출
			numArr[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) { // 지금까지 추출된 난수와 비교해 중복되는 수는 제외
				if (numArr[i] == numArr[j]) {
					i--;
				}
			}
		}
		for (int k = 0; k < 6; k++) { // 6개 난수 프린트
			System.out.print(numArr[k] + " ");
		}
	}

	// 알고리즘 2 - List, shuffle
	private static void gameNum4() {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 45; i++) {
			list.add(i + 1);
		}
		Collections.shuffle(list);

		for (int j = 0; j < 6; j++) {
			System.out.print(list.get(j) + " ");
		}
	}

	// 알고리즘 3 - HashSet

	private static void gameNum3() {
		Random r = new Random();
		Set<Integer> set = new HashSet<Integer>();
		while(set.size() != 6) {
			set.add(r.nextInt(45) + 1);
		}
		System.out.println(set);
	}

	// 알고리즘 4 - 
	
	private static void getNum4() {
		Random r = new Random();
		TreeSet<Integer> tree = new TreeSet<Integer>();
		while(tree.size() != 6) {
			tree.add(r.nextInt(45) + 1);
		}
		System.out.println(tree);
	}
	
	
}
