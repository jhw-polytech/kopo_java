package kr.ac.jinwoo.day12.LottoHomework;

import java.util.Arrays;
import java.util.Random;

public class LottoAlgo {

	private static Random r = new Random();
	
	// 1 ~ 45 사이의 난수를 생성하는 메소드
	private static int makeLotNum() {
		
		int num = r.nextInt(45) + 1;	
		return num;
	}

	/*
	 * 시간복잡도는 좋지만 공간복잡도가 안좋다.
	 */
	public static int[] Algo1() {
		
		int[] numArr = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
		
		int[] lotArr = new int[6];
		int num;
		
		for(int i = 0; i < 6; i++) {
			
			while(true) {
				 num = makeLotNum();
				 if(numArr[num-1] != 0) {
					 numArr[num-1] = 0;
					 lotArr[i] = num;
					 break;
				 }
			}
		}
		
		Arrays.sort(lotArr);
		
		return lotArr;
	}

	/*
	 * 시간복잡도는 좋지만 공간복잡도가 안좋다. 이 알고리즘이 제일 빠를 것 같다.
	 */
	public static int[] Algo2() {
		
		int[] numArr = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
		
		int[] lotArr = new int[6];
		int num;
		
		for(int i = 0; i < 6; i++) {
			
			num = makeLotNum();
			
			while(true) {
				
				 if(numArr[num-1] != 0) {
					 numArr[num-1] = 0;
					 lotArr[i] = num;
					 break;
				 }
				 else {
					 if(num == 45)
						 num = 1;
					 else
						 num++;
				 }
			}
		}
		
		Arrays.sort(lotArr);
		
		return lotArr;	
	}
	
	/*
	 * 시간복잡도는 좋지 않지만 메모리를 최대한 절약 
	 */
	public static int[] Algo3() {
		
		int[] lotArr = new int[6];
		
		for(int i = 0; i < 6; i++) {
			
			int lotNum = makeLotNum();
			for(int j = 0; j < i; j++) {	
				while(lotNum == lotArr[j]) {
					lotNum = makeLotNum();
				}
			}
			lotArr[i] = lotNum;
		}
		
		Arrays.sort(lotArr);
		
		return lotArr;
	}

	/*
	 * 시간복잡도는 좋지 않지만 메모리를 최대한 절약 
	 */
	public static int[] Algo4() {
		
		int[] lottoArr = new int[6];
        
        for(int i=0; i < 6; i++) {
            lottoArr[i] = makeLotNum();
            for (int j = 0; j < i; j++) {
                if(lottoArr[i] == lottoArr[j]) {
                    i--;
                    break;
                }
            }
        }
        Arrays.sort(lottoArr);
		
		return lottoArr;
	}
	
	
	
	// 보너스 번호까지 추출
	public static int[] weeklyLotto() {
		
		int[] numArr = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};
		
		int[] lotArr = new int[7];
		int num;
		
		for(int i = 0; i < 6; i++) {
			
			while(true) {
				 num = makeLotNum();
				 if(numArr[num-1] != 0) {
					 numArr[num-1] = 0;
					 lotArr[i] = num;
					 break;
				 }
			}
		}
		
		lotArr[6] = 50;
		Arrays.sort(lotArr);
		
		while(true) {
			 num = makeLotNum();
			 if(numArr[num-1] != 0) {
				 numArr[num-1] = 0;
				 lotArr[6] = num;
				 break;
			 }
		}
		
		return lotArr;
	}
	
	// 등수 확인
	public static int chkPrize(int[] weekLotArr,int[] lotArr) {
		
		int prize = 0;
		int cnt = 0;
		
		for(int i = 0; i < lotArr.length; i++) {
			
			for(int j = 0; j < lotArr.length; j++) {
				if(weekLotArr[i] == lotArr[j]) 
					cnt++;
			}
		}
		
		if(cnt == 6) cnt++;
		
		if(cnt == 5) {
			
			for(int i = 0; i < lotArr.length; i++) {
				
				if(weekLotArr[6] == lotArr[i]) {
					cnt++;
				}
			}
		}
		
		if(cnt == 7) prize = 1;
		else if(cnt == 6) prize = 2;
		else if(cnt == 5) prize = 3;
		else if(cnt == 4) prize = 4;
		else if(cnt == 3) prize = 5;
		
		return prize;
	}
	
}
