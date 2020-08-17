package shlee1993.day03.homework;

/*
11. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
ex)	*********	0 9
	-*******	1 7
	--*****		2 5
	---***		3 3
	----*		4 1
*/

//0행부터 시작한다고 할 때, '-'의 개수는 행과 같고,
//'*'의 개수는 9-2*행과 같다.

public class hw11 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++)	//_의 개수 == 행
				System.out.print("_");
			for (int j = 0; j < 9 - 2 * i; j++)	//*의 개수 == 9-2*행
				System.out.print("*");
			System.out.println();
		}
	}

}
