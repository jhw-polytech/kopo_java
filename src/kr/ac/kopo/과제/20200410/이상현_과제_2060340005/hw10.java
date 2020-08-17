package shlee1993.day03.homework;

/*
10. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
반복문 5개, 조건문 1개 이용가능
반복문 3개, 조건문 3개
반복문 3개, 조건문 1개
반복문 2개, 조건문 2개
ex)	***** 0
	-**** 1
	--*** 2
	---** 3
	----* 4
	---** 5
	--*** 6
	-**** 7
	***** 8
* 
*/

//내부 for문의 인덱스값을 for문 밖으로 빼내어 생각한다(한 행의 총 문자 5개를 맞추기 위해)
//'_'의 개수는 0행부터 4행까지는 행의 개수와 같고, 5~8행까지는 8-행의 개수와 같고,
//'*'의 개수는 5-'_'의 개수와 같다.

public class hw10 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			if (i < 5) { // 0~4까지 출력
				int j = 0;
				for (; j < i; j++) // i의 개수와 _의 개수가 같으므로
					System.out.print("_");
				for (; j < 5; j++) // 5개중 _를 제외한 것이 *의 개수
					System.out.print("*");
			} else { // 5~8까지 출력
				int j = 0;
				for (; j < 8 - i; j++) // _의 개수가 8-i와 개수가 같으므로
					System.out.print("_");
				for (; j < 5; j++) // 5개중 _를 제외한 것이 *의 개수
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
