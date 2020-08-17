package Homework_0410;

/* 12) 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
*-------*
**-----**
***---***
****-****
*********
****-****
***---***
**-----**
*-------*
*/
public class Test12 {

	public static void main(String[] args) {

		int n = 1; // 변수 설정

		for (int i = 1; i <= 9; i++) {// i는 행의 값. 총 9행을 출력한다.
			for (int j = 1; j <= 9; j++) { // j는 열의 값. 총 9열을 출력한다.
				if (j >= n + 1 && (j <= 9 - n)) { // 앞의 조건은 앞에 "*"을 출력하기 위함이고 뒤의 조건은 뒤에 "*"을 출력하기 위함이다.
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}
			if (i < 5) { // 대칭을 이루기 위해 조건을 설정한다.
				n++;
			} else {
				n--;
			}
			System.out.println();
		}
	}
}