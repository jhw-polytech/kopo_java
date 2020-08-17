package exam0428.LottoGame;

import java.util.Arrays;
import java.util.Random;

public class GeneratorOne extends LottoGenerator {
	
	Random r;
	
	/**
	 * java.util.Random 클래스를 통해서 
	 * 중복되지 않은 로또 번호를 추출하는 메소드 (정수 배열 사용)
	 * 한 인덱스의 값을 다른 인덱스의 값과 비교해가며 중복을 확인한다.
	 */
	public void lottoGenerator() {
		
		r = new Random();
		int[] lottoArr = new int[6];

		for (int i = 0; i < lottoArr.length; i++) {
			int tempValue = r.nextInt(45) + 1;
			
			for (int j = i; j >= 0; j--) {
				if (tempValue == lottoArr[j]) {
					tempValue = r.nextInt(45) + 1;
					j = i;
				}
			}
			lottoArr[i] = tempValue;
		}
		System.out.print("AlgoOne's Number : " + Arrays.toString(lottoArr));
		System.out.println();
	}
	
}
