package kr.ac.kopo.assignment.day12;
import java.util.Arrays;
/*
 * 2번 알고리즘 : HashSet 이용
 */
import java.util.HashSet;
import java.util.Random;

public class LottoAlgo02 {
	
	private HashSet<Integer> lotteryNums;
	private Random ran;
	
	public LottoAlgo02() {
		lotteryNums = new HashSet<Integer>();
		ran = new Random();
	}
	
	//set은 중복된 값을 제거해서 저장하기 때문에 크기가 6이될때까지 추가한다
	public void randomLottery() {
		

		while(lotteryNums.size() < 6) {
			int temp = ran.nextInt(45)+1;
			lotteryNums.add(temp);

		}

	}
	
	public void print() {
		System.out.println(Arrays.toString(lotteryNums.toArray()));
	}
	
	public void clear() {
		lotteryNums.clear();
	}

}
