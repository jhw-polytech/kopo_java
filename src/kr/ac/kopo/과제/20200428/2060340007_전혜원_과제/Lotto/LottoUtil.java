package kr.ac.kopo.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class LottoUtil {

	private Random random;

	private int[] luckyNumbers;

	public LottoUtil() {
		this.random = new Random();
		this.luckyNumbers = new int[6];

	}

	// 방법 1. 숫자가 뽑힐 때마다 오름차순 정렬하여,
	// 중복되는 숫자가 있으면 다시 난수뽑기 진행
	public int[] method01() {

		for (int i = 0; i < 6; i++) {
			// 난수 생성하여 배열에 삽입
			int number = random.nextInt(44) + 1;
			luckyNumbers[i] = number;

			// 배열의 숫자들을 오름차순 정렬
			for (int j = 0; j < i; j++) {

				// 앞 수가 더 크면 자리를 서로 바꿈
				if (luckyNumbers[j] > luckyNumbers[i]) {
					int convert;
					convert = luckyNumbers[i];
					luckyNumbers[i] = luckyNumbers[j];
					luckyNumbers[j] = convert;
				}

			}

			if (i != 0 && luckyNumbers[i] == luckyNumbers[i - 1]) {
				i--;
			}
		}

		return luckyNumbers;
	}

	// 방법 2. 새로 뽑은 수를 앞서 뽑힌 숫자들과 비교해 중복이 없을 때 배열에 입력
	public int[] method02() {
		for (int i = 0; i < 6; i++) {
			int number = random.nextInt(44) + 1;
			luckyNumbers[i] = number;

			// 이미 뽑힌 숫자들과 비교하여 같은 숫자가 있으면 반복문 다시 돌려 진행
			for (int j = 1; j < i; j++) {
				if (i != 0 && luckyNumbers[j - 1] == luckyNumbers[i]) {
					i--;
					break;
				}
			}
		}
		return luckyNumbers;
	}

/*
	혜원씨 TreeSet이나 HashSet이나 알고리즘은 같은거 아니에요?? ㅋㅋㅋㅋ
*/

	// 방법 3. HashSet
	public void method03() {
		HashSet<Integer> set = new HashSet<Integer>();

		// 난수를 생성해 Hashset에 입력 * 6번 반복
		while (set.size() < 7) {
			int number = random.nextInt(45) + 1;
			set.add(number);
		}

		System.out.println(set);

	}

	// 방법 4.TreeSet
	public TreeSet<Integer> method04() {
		TreeSet<Integer> set = new TreeSet<Integer>();

		// 난수를 생성해 treeset에 입력 * 6번 반복
		while (set.size() < 7) {
			int number = random.nextInt(45) + 1;
			set.add(number);
		}

		return set;
	}

}
