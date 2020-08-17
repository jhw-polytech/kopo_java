package exam0428.LottoGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorTwo extends LottoGenerator {
	
	Random r;
	
	/**
	 * java.util.Random 클래스를 통해서
	 * 중복되지 않은 로또 번호를 추출하는 메소드. (ArrayList 사용)
	 * 1 ~ 45까지 담고 있는 리스트에서 .contains()를 활용하여 중복을 확인한다.
	 */
	
	@Override
	public void lottoGenerator() {
		
		r = new Random();
		List<Integer> lottoList = new ArrayList<>();
		
		while(lottoList.size() < 6) {
			int tempNum = r.nextInt(45) + 1;
			if (lottoList.contains(tempNum) == false) {
				lottoList.add(tempNum);
			}
		}
		
		printArrayList("AlgoTwo's Number : ", lottoList);
	}
}
