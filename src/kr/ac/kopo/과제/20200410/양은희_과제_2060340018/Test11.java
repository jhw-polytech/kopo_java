package Homework_0410;

/* 11) 다음의 결과를 보이는 코드를 작성하시오. (딴 출력메소드에 하나의 문자만 가능)
*********
-*******
--*****
---***
----*
*/
public class Test11 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // i는 행의 값. 1행~5행 출력
			for (int j = 1; j < 11 - i; j++) { // j는 열의 값. "*"를 9개를 출력하기 위해 조건을 (j<11-i)로 설정
				if (i > j) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}