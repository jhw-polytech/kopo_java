package test0430;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * set을 이용하여 중복되지 않게 Lotto번호 추출
 * @author user
 *
 */


public class LottoTypeB {
	
	private Random r;
	
	
	public LottoTypeB() {
		r = new Random();
	}
		
	
	public void LottoGetNumberB(int num) {
		
		int cnt = 0;
		while(cnt<num) {
			
			HashSet<Integer>set = new HashSet<>();
			for(int i = 0;i<6;i++) {
				set.add(randomNum());
			}
			
			Iterator<Integer> ite = set.iterator();
			
			while(ite.hasNext()) {
				System.out.print(ite.next() + " ");
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
		
	
		
	

