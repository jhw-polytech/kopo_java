package Homework_0410;

// 9) 구구단을 한라인에 3단씩 출력하는 코드를 작성하세요. 이 때 9단은 나오면 안됩니다.
//	반복문은 최대 3개만 사용합니다.

/* 이 문제를 어떻게 풀어야 할 지 고민하다 가로로 3줄씩 출력하는 방법을 택하였습니다.
 * 8단이 나오면 8단만 따로 출력하도록 하였습니다.
 * 어떻게 하면 더 효율적으로 풀 수 있는지 공부하겠습니다.
*/
public class Test09 {
	public static void main(String[] args) {

		int a = 2; // 구구단 변수 설정
		int i = 1;

		// 가로로 3줄씩 출력
		for (a = 2; a < 8; a += 3) {
			for (i = 1; i <= 9; i++) {
				System.out.print(a + " * " + i + " = " + a * i + "\t");
				System.out.print(a + 1 + " * " + i + " = " + (a + 1) * i + "\t");
				System.out.println(a + 2 + " * " + i + " = " + (a + 2) * i + "\t");

				if (i == 9) {
					System.out.println();
				}
			}
		}
		if (a == 8) { // 만약 8단이 나올 경우 그냥 출력
			for (i = 1; i <= 9; i++)
				System.out.println(a + " * " + i + " = " + a * i + "\t");
		}
	}
}