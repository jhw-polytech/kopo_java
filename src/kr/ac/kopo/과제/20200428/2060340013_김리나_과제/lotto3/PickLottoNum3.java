package kr.ac.kopo.day12.homework.lotto3;

import java.util.ArrayList;
import java.util.List;

public class PickLottoNum3 {

	
	// < 알고리즘 3 >
	public List pickLottoNum3() {
		
		List<Integer> lottoNumOption = new ArrayList(); // 뽑고 남은 로또 숫자 후보들의 리스트 
		List<Integer> lottoNum = new ArrayList(); // 뽑은 숫자 리스트 
		
		for(int i = 1; i <= 45; i++) {
			lottoNumOption.add(i); // 로또 숫자 후보로 1부터 45까지 저장 
		}
		
		for(int i = 0; i < 6; i++) {
			int listIdx = (int)(Math.random()*(lottoNumOption.size()-1)); // ArrayList의 size는 계속 변하니 그것에 맞춰 인덱스를 뽑아내도록 한다. 
			lottoNum.add(lottoNumOption.remove(listIdx)); // 남아있는 로또번호 옵션에서 랜덤하게 뽑은 인덱스에 있는 수를 제거하며 리턴받아 새 리스트에 저장한다. 
		}
		
		return lottoNum;
		
	}
}
