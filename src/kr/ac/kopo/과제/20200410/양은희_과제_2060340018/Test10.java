package Homework_0410;

/* 10) 다음의 결과를 보이는 코드를 작성하시오. (단, 출력메소드에 하나의 문자만 가능)
*****
-****
--***
---**
----*
---**
--***
-****
*****
*/

public class Test10 {

	public static void main(String[] args) {
		
		// 반절로 나누어 출력한다.
		for (int i = 1; i <= 5; i++) { // i는 행, j는 열을 나타낸다. 1행부터 5행까지 출력
			for (int j = 1; j <= 5; j++) { // j가 가진 열의 값을 행의 값과 비교
				if (j < i) { // i<j일 경우
					System.out.print("-"); // "-"를 출력한다.
				} else { // i>=j일 경우
					System.out.print("*"); // "*"를 출력한다.
				}
			}
			System.out.println();
		}

		for (int i = 6; i <= 9; i++) { // i는 행, j는 열을 나타낸다. 6행부터 9행까지 출력
			for (int j = 1; j <= 5; j++) { // j가 가진 열의 값을 행의 값과 비교
				if (9 - i < j) { // 9-i<j일 경우
					System.out.print("*"); // "*"를 출력한다.
				} else { // 9-i>=j일 경우
					System.out.print("-"); // "-"를 출력한다.
				}
			}
			System.out.println();
		}
	}
}