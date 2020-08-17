package Homework_0410;

// 7) 구구단을 출력하세요.

public class Test07 {
	public static void main(String[] args) {

		for (int a = 2; a <= 9; a++) { // 2단부터 9단까지를 출력한다.
			System.out.println("\n*** " + a + "단 ***");

			for (int i = 1; i <= 9; i++) // 곱해주는 수를 1부터 9까지로 설정한다.
				System.out.println(a + " * " + i + " = " + a * i);
		}
	}
}
