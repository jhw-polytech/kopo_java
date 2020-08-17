package kr.ac.kopo.day12.homework.lotto;

public class PickLottoNum {

	// < 알고리즘 1 > 
	public int[] pickLottoNum() {
		
		int[] lottoNum = new int[6];
		
		lottoNum[0] = (int)(Math.random()*44+1); // 첫번째 로또번호는 중복될일이 없으므로 먼저 할당해준다. 
		
		for(int i = 1; i < 6; i++) {
			int tempNum = (int)(Math.random()*44+1); // 하나를 우선 뽑고 
			for(int j = 0; j < i; j++) {
				if(tempNum == lottoNum[j]) { // 0번지부터 i-1번지까지 배열을 돌며 중복일시 증감해주지 않고 반복문을 빠져나가 다시 수행하게 한다. 
					i--;
					break;
				}
				lottoNum[i] = tempNum;
			}
		}
		return lottoNum;
	}
	
	
}
