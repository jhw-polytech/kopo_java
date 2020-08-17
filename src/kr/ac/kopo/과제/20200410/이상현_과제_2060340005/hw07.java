package shlee1993.day03.homework;

/*
7. 구구단을 출력하세요
ex)	*** 2단 ***
	2 * 1 = 2
	...
	9 * 9 = 81
*/

//이중 for문을 이용하여 6번과 같이 해결한다. 6번의 dan자리에 두번째 인덱스를 이용하면 된다.

public class hw07 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("*** %d단 ***\n", i);
			for (int j = 1; j < 10; j++)
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			System.out.println();
		}
	}
}
