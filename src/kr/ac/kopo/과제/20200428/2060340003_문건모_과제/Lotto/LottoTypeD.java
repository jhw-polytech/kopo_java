package test0430;

import java.util.Random;

/**
 * TypeA와는 다르게 나머지가 0 - 5까지를 각각 가지는 숫자를 추출하여 중복방지
 * @author user
 *
 */

public class LottoTypeD {
	
	private Random r;
	
	public LottoTypeD() {
		r = new Random();
	}
	
	public void LottoGetNumberD(int num) {
		
		int cnt = 0;
		int[] lottoArr = new int[6];
		while(cnt<num) {
			
			for(int i = 0;i<lottoArr.length;i++) {
				
				lottoArr[i] = r.nextInt(45) + 1;
				if(lottoArr[i] % 6 != i) {
					i--;
				}
				
			}
			
			for(int lot : lottoArr) {
				System.out.print(lot + " ");
			}
			
			System.out.println();
			cnt++;
		}
	}
}
