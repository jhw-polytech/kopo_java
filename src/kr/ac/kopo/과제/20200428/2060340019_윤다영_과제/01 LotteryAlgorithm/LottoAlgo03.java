package kr.ac.kopo.assignment.day12;
/*
 * 3번 알고리즘  : ArrayList와 이중 for문을 이용
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LottoAlgo03 {
	
	private ArrayList<Integer> lotteryNums;
	private Random ran;
	
	public LottoAlgo03() {
		lotteryNums = new ArrayList<Integer>();
		ran = new Random();
	}
	
	public void randomLottery() {
		
		
		for(int i = 0; i < 6; i++) {
			int temp = ran.nextInt(45) + 1;
			lotteryNums.add(temp);
			for(int j = 0; j < i; j++) {
				if(lotteryNums.get(i) == lotteryNums.get(j)) {
					lotteryNums.remove(i);
					i--;
					break;
				}
			}
		}

	}
	
	public void print() {
		System.out.println(Arrays.toString(lotteryNums.toArray()));
	}
	
	//게임 수가 반복되면 누적이 되길래 초기화하는 메소드를 추가했습니다.
	public void clear() {
		lotteryNums.clear();
	}

	
}
