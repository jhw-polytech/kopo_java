package kr.ac.kopo.day12.homework.lotto4;

import java.util.ArrayList;
import java.util.List;

public class PickLottoNum4 {

	
	// < 알고리즘 4 >
	public List pickLottoNum4() {
		
		List<Integer> lottoNum = new ArrayList();
		
		for(int i = 0; i < 6; i++) {
			int tempNum = (int)(Math.random()*44+1);
			if(lottoNum.contains(tempNum)) { // ArrayList의 contains() 메소드 활용 
				i--;
			} else
				lottoNum.add(tempNum);
		}
		return lottoNum;
		
	}
	
	
}
