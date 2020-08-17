package test0430;

import java.util.Random;

/**
 * for 문을 이용하여 중복되지 않게 Lotto번호 추출
 * @author user
 *
 */

public class LottoTypeA {
	
	private Random r;
			
	public LottoTypeA() {
		r = new Random();
	}
	
	public void LottoGetNumberA(int num) {
		
		int cnt = 0;
		int start = 0;
		int loc = 1;
		int[] lottoArr = new int[6];
		while(cnt<num) {
			
			for(int i = 0;i<lottoArr.length;i++) {
				
				start = r.nextInt(45) + 1;
				if(start <=40 && i == 0) {
					lottoArr[i] = start; 
				}
				 
				lottoArr[i] = r.nextInt(45) + 1;
				
				for(int j = 0;j<i;j++) {
					if(lottoArr[i] == lottoArr[j]) {
						i--;
					}
				}
				
			}
			for(int lotto : lottoArr) {
				System.out.print(lotto + " ");
				
			}
			
			cnt++;
			System.out.println();
		}
		
		
	}
}

				
		
