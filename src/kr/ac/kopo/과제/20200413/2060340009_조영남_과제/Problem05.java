package kr.ac.yeongnam.day04.homework;

/*
 	5. 2 ~ 100사이의 소수를 출력하는 코드를 작성 
 	
 	< 2 ~ 100사이의 소수 출력 > 
 	2  3  5  7  11 13  17 … 97 
 */

public class Problem05 {

	public static void main(String[] args) {

		/*
			제가 설명한 알고리즘에서는 이미 27 ~ 32줄까지의 코드가 포함되어 있어서 굳이 작성하지 않아도 결과가 나오게 됩니다
			다시한번 고민해보자구요. 
			과제하느라 고생하셨습니다

			==> 네 교수님, 반복문을 돌면서 0이 아닌 수는 '소수'라는 개념을 활용해서 다시 수정해봤습니다.
			==> 피드백 주셔서 감사합니다^^
		*/

		// 2~100 사이의 정수를 배열에 담는다.
		int[] intArr = new int[99];
		for(int i = 0; i < 99; i++) {
			intArr[i] = i+2;
		}
		
		// 배열을 돌면서 소수인지 판별한다.
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i] != 0) { // 소수라면,
				for(int j = i+1; j < intArr.length; j++) {
					if(intArr[j] % intArr[i] == 0) { // 소수의 배수를 모두 0으로 초기화 한다.
						intArr[j] = 0;
					}
				}
			}
		}

		System.out.println("< 2 ~ 100 사이의 소수 출력 >");
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i] != 0) { // 배열 안의 값이 0이 아닌 경우에만 출력
				System.out.print(intArr[i] + " ");
			}
		}

		/*
		// 배열을 돌면서 소수인지 판별한다.
		for(int num : intArr) {	

			int count = 0;
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					count++;
				}				
			}	
			
			if(count == 2) { // 소수일 때, 그 소수의 배수들은 모두 0으로 초기화			
				int times = 2;
				while(num * times <= 100) {
					intArr[num * times -2] = 0;
					times++;
				}
				
			} else { // 소수가 아닐 때, 해당 수는 0으로 초기화
				if(num >= 2) {
					intArr[num-2] = 0;					
				}			
			}
		}
				
		System.out.println("< 2 ~ 100 사이의 소수 출력 >");
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i] != 0) { // 배열 안의 값이 0이 아닌 경우에만 출력
				System.out.print(intArr[i] + " ");
			}
		}
		*/
	}
}
