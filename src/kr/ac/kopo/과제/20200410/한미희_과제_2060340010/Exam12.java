package kr.ac.kopo.day3.assignment;

public class Exam12 {

	public static void main(String[] args) {
		
		//출력할 행(i) 개수 : 9줄
		for(int i = 1; i <=9; i++) {
			
			//5번째 행까지 출력할 방법
			if(i<=5) {
				//출력할 열(j) 개수 : 9개
				for(int j = 1; j <= 9; j++) {
					
					//열의 자리가 행의 자리 이하이거나 (9-행의 자리(i))보다 크다면, "*" 출력
					if((j<=i) | (j>(9-i))) {
						System.out.print("*");
					//열의 자리가 행의 자리보다 크고 (9-행의 자리(i))보다는 작거나 같다면, "-" 출력	
					}else {
						System.out.print("-");
					}
					
				}
				System.out.print('\n');
			
			//6번째 행부터 출력할 방법
			}else {
				for(int j = 1; j <= 9; j++) {
					
					
					/*6행부터 다음 행으로 이동할 때 처음"*"이 연속되어서 나타나는 열의 끝 자리가 4에서 1씩 줄어들며,
					 					   다음 "*"이 연속되어서 나타나는 열의 시작 자리가 6에서 1씩 뒤로 밀려난다.
					  이에 따라 행의 자리와 열의 자리의 규칙성을 찾는다.
					*/
					//열의 자리가 (10-행의 자리(i))이하이거나 행의 자리 이상이면, "*" 출력
					if((j<=(-i+10))|(j>=i)) {
						System.out.print("*");
					//열의 자리가 (10-행의 자리(i))보다 크고 행의 자리보다 작다면, "-" 출력
					}else {
						System.out.print("-");
					}
					
				}
				System.out.print('\n');
			}
		}
		
		
	}
}
