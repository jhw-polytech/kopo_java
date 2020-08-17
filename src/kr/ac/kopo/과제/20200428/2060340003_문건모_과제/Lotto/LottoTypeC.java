package test0430;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ArrayList를 이용하여 중복되지 않게 Lotto번호 추출
 * @author user
 *
 */

public class LottoTypeC {
	
	private Random r;
	
	public LottoTypeC() {
		r = new Random();
	}
	
	public void LottoGetNumberC(int num) {
		
		int cnt = 0;
		while(cnt<num) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<6;i++) {
			
			list.add(randomNum());
			for(int j = 0;j<i;j++) {
				if(list.get(i) == list.get(j)) {
					i--;
				}
			}
			
		}
			
		for(int lot : list) {
			System.out.print(lot + " ");
		}
		System.out.println();
		cnt++;	
		
		}
	}
	
	public int randomNum() {
		int num = r.nextInt(45) + 1;
		return num;
		
	}
	
	
}
			
		
