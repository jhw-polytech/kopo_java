package kr.ac.yeongnam.day03.homework;

/*
 	11. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능) 
 
    *********     
    -*******     
    --*****     
    ---***     
    ----* 
 
 */
public class Problem11 {

	public static void main(String[] args) {

		for(int i = 1; i <= 5; i++) { // 1행부터 5행까지 반복
			for(int j = 1; j <= 10-i; j++) { // 열의 개수를 1씩 줄여나가는 반복문	
				if(i > j) { // 행의 인덱스가 열의 인덱스보다 크면 '-' 출력
					System.out.print("-");
				} else { // 행의 인덱스가 열의 인덱스보다 작으면 '*' 출력					
					System.out.print("*");
				}				
			}
			System.out.println("");
		}				
	}
}
