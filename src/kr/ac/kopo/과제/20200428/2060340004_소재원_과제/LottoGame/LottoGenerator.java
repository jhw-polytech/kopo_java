package exam0428.LottoGame;

import java.util.List;

public class LottoGenerator implements LottoInterface {
	
	public void printArrayList(String msg, List<Integer> lottoList) {
		
		System.out.print(msg + "[");
		for (int i = 0; i < lottoList.size(); i++) {
			System.out.printf("%d",lottoList.get(i));
			if (i != 5) { 
					System.out.print(", ");
			}	
		}
		System.out.println("]");
		
	}

	@Override
	public void lottoGenerator() {
	}
	
}
