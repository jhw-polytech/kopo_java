package shlee1993.day03.homework;

/*
12. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
ex)	*-------*	0
	**-----**	1
	***---***	2
	****-****	3
	*********	4
	****-****	5
	***---***	6
	**-----**	7
	*-------* 	8
 */

//10번 문제처럼 내부 for문의 인덱스값을 for문 밖으로 빼내어 생각한다(한 행의 총 문자 9개를 맞추기 위해)
//밑의 세부 주석처럼 행과 문자의 개수의 관계를 파악하여 작성

public class hw12 {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			if (i < 5) {	//0~4행
				int j = 0;
				for (; j < i + 1; j++)	//앞 *의 개수 == 행+1
					System.out.print("*");
				for (; j < 8 - i; j++)	//'앞 *의 개수' + '_의 개수' == 8-행
					System.out.print("_");
				for (; j < 9; j++)	//다 합치면 9개(나머지 공간 채움)
					System.out.print("*");
			} else {	//5~8행
				int j = 0;
				for (; j < 9 - i; j++)	//앞의 *의 개수 == 9-행
					System.out.print("*");
				for (; j < i; j++)	//'앞 *의 개수' + '_의 개수' == 행
					System.out.print("_");
				for (; j < 9; j++)	//다 합치면 9개(나머지 공간 채움)
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
