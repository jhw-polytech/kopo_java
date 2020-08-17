package homework0417;

/*
 * 2060340017 신형재 과제 8번
 * 전체적으로 다른 학생들에 비해 메인 클래스가 너무 길다는걸 확인했습니다.
 * 주말 간 타 학생들 코드 확인해서 효율성을 높여 보도록 하겠습니다.
 */

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator ccl = new Calculator();
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 1을 입력하세요. ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("정수 2를 입력하세요. ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("%d + %d = %d\n", num1, num2, ccl.add(num1, num2));
		System.out.printf("%d - %d = %d\n", num1, num2, ccl.sub(num1, num2));
		System.out.printf("%d * %d = %d\n", num1, num2, ccl.mul(num1, num2));
		System.out.printf("%d / %d = %d\n\n", num1, num2, ccl.div(num1, num2));
		
		System.out.printf("%d 소수 체크 : %b\n", num1, ccl.check(num1));
		System.out.printf("%d 소수 체크 : %b", num2, ccl.check(num2));
	}

}
