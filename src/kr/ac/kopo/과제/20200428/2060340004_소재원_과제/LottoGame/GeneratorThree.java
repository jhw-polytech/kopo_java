package exam0428.LottoGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorThree extends LottoGenerator {
	
	Random r;
	
	/**
	 * java.util.Random 클래스를 통해서
	 * 중복되지 않은 로또 번호를 추출하는 메소드. (ArrayList 활용)
	 * 1 ~ 45까지 담고 있는 List에서 랜덤하게 인덱스를 줄여나간다.
	 */
	@Override
	public void lottoGenerator() {
		r = new Random();
		List<Integer> lottoList = new ArrayList<>();
		for (int i = 1; i <= 45; i++) {
			lottoList.add(i);
		}
		
		int k = 45;
		while(lottoList.size() > 6) {
			lottoList.remove(r.nextInt(k));
			--k;
		}
		printArrayList("AlgoThree's Number : ", lottoList);
	}

}
