package exam0428.LottoGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorFour extends LottoGenerator {

	Random r;
	
	/**
	 * java.util.Random 클래스를 통해서 
	 * 중복되지 않은 로또 번호를 추출하는 메소드 (ArrayList 사용)
	 * 임의의 숫자에 임의의 숫자를 계속 더해나가며 로또 번호를 생성한다.
	 */

	@Override
	public void lottoGenerator() {
		r = new Random();
		List<Integer> lottoList = new ArrayList<>();
		int lottoNum = 0;
		while(lottoList.size() < 6) {
			int firstNum = r.nextInt(45) + 1;
			lottoNum += firstNum;
			
			if (lottoNum > 45) {
				lottoNum = lottoNum - 45;
			}
			
			if(lottoList.contains(lottoNum) == false) {
				lottoList.add(lottoNum);
			}
		}
		
		printArrayList("AlgoFour's Number : ", lottoList);		
	}
}
