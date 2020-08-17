package kr.ac.kopo.day12.homework.lotto2;

import java.util.HashSet;
import java.util.Set;

public class PickLottoNum2 {

	
	// < 알고리즘 2 >
	public Object[] pickLottoNum2() {
		
		Set<Integer> lottoNum = new HashSet<>(); // 중복을 허용 안하는 Set Collection 활용 
		
		for(int i = 0; i < 6; i++) {
			int tempNum = (int)(Math.random()*44+1);
			if(!lottoNum.add(tempNum)) { // 중복이어서 add가 제대로 수행되지 않아 false를 반환했다면 증감하지 않는다. 
				i--;
			} else
				lottoNum.add(tempNum);
		}
		
		return lottoNum.toArray(); // Object[] 형으로 변환 
		/*
		 * To. 교수님, 
		 * 혹시 Object[] 형을 int[] 형으로 바로 바꿀 수 있는 방법은 없을까요? 
		 * Object를 int로 바꾸는건 가능하지만 그러면 또 하나하나 스캔하며 바꿔줘야해서... 혹시 다른 더 효율적인 방법이 있는지 여쭤보고싶습니다. 
		 */
		 /*
		 	Object[]도 하나의 참조변수자나요. 그 자체를 int[]로 바꿀수 있지만 Object[] 참조변수가 가리키고 있는 Object를 실제가리키고 있는 값들은 형환되지 않으므로 각각 형변환 해주셔야 합닌다
		 */
		
	}
}
