package kr.ac.kopo.assignment.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
 * 4번 알고리즘 : ArrayList와 contains 이용
 */

public class LottoAlgo04 {
	
	private ArrayList<Integer> lotteryNums;
	private Random ran;
	
	public LottoAlgo04() {
		lotteryNums = new ArrayList<Integer>();
		ran = new Random();
	}
	
	public void randomLottery() {
		
		while(lotteryNums.size() < 6) {
			int temp = ran.nextInt(45)+1;
						
			if(!lotteryNums.contains(temp)) {
				lotteryNums.add(temp);
			}
		}
	}
	
	public void print() {
		System.out.println(Arrays.toString(lotteryNums.toArray()));
	}
	
	//여긴 모든 결과값이 동일하게 나와서 초기화하는 메소드를 추가했습니다.
		public void clear() {
			lotteryNums.clear();
		}


}
