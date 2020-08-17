package homework0410;

/*
 * 2060340017 신형재 과제 11번
 * 
 * *********
 * -*******
 * --*****
 * ---***
 * ----*
 * 출력하기
 */

public class n11 {
	public static void main(String[] args) {
		//행의 범위 5까지 반복
		for(int i =1; i<=5; i++) {
			// 열의 범위 9까지 반복
			for(int j = 1; j <= 9; j++) {
				//기본 구조는 이전 문제와 동일
				if(j<i) {
			System.out.print("-");
		}else {
			//다만, 매 행의 마지막 부분 공백을 만들어 줘야 하는데
			//행+열의 합이 11 이상인 경우(행의 제일 마지막 열) 공백으로 만들어주는 규칙성 발견
			//해당 규칙성으로 조건문 삽입
			if(i+j>=11) {
				System.out.print("");
			}else{
				System.out.print("*");	
			}
			}
		}System.out.print("\n");
	}
}
}