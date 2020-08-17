package exam0424.etc;

import java.util.Scanner;

public class _01SumTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int input = Integer.parseInt(sc.nextLine());
		if (input % 2 == 0) {
			System.out.printf("결과 값 : %d", Odd(input));
		} else {
			System.out.printf("결과 값 : %d", Even(input));
		}
		sc.close();
	}
	
	private static int Even(int input) {
		int sum = 0;
		for (int i = 1; i <= input; i +=2) {
			sum += i;
		}
		return sum;
	}

	private static int Odd(int input) {
		
		int sum = 0;
		for (int i = 2; i <= input; i += 2) {
			sum += i;
		}
		
		return sum;
	}
}
