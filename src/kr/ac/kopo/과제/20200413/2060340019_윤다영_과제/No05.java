package kr.ac.kopo.assignment.day04;

public class No05 {
	/*
	 2 ~ 100 사이의 소수를 출력하는 코드를 작성
	 < 2 ~ 100 사이의 소수 출력 >
	 2 3 5 7 ........ 97
	 */
	
	
	public static void main(String[] args) {
		
		int[] decimal = new int[99];
				
		// 2 ~ 100까지의 숫자 배열에 저장
		decimal[0] = 2;
		for(int i = 1; i < 99; i++) {
			decimal[i] = decimal[i-1] + 1;
		}
		
		
		//소수 구하기
		System.out.println("< 2 ~ 100 사이의 소수 출력 >");
		for(int i = 0; i < 99; i++) {
			/*
			 교수님! 아래의  j 반복문에서 처음에는 
			 for(int j = 1; j < 99 ; j ++)로, 
			 j 값 초기화를 i+1이 아닌, 1로 하니까 결과 값이 안나오는데 그 이유를 모르겠습니다ㅜ
			 비효율적인 측면은 동의하지만, 5 % 3을 할 경우 3으로 0이 아니니까 
			 decimal[j] = 0;이 돌아가지 않는다고 생각했는데, 돌아가는 이유가 궁금합니다!
			 */
			 /*
			 	1번지에 3이 들어있고, 2번지는 4에서 0으로 바뀌었어요.. 그러면서 조건을 어긋나게 만들었을 겁니다
				 그리고 0 % 5는 괜찮아요... 5 % 0이 문제인거죠....
			 */
			for(int j = i + 1; j < 99; j++) {
				if(decimal[i] != 0 && (decimal[j] % decimal[i]) == 0) {
			
					decimal[j] = 0;					
				}
			}
			
			if(decimal[i] != 0) {
				System.out.print(decimal[i] + " ");
			}
		}
		
		
		
	}

}
