package exam0410;

import java.util.Scanner;

public class no01 {

	/*
	 * 짧게 해보고 싶었는데 마땅히 생각이 나질 않네요.
	 * 배열이 아니라 뭔가 접근이 어려운 거 같고..
	 * java에서는 파이썬처럼 .strip()같은 기능은 없는지 궁금합니다.
	 * 
	 * 제 코드는 단순히 가장 큰 값인 경우를 3가지로 분류하고,
	 * 세부적으로 조건문을 중첩해서 차례로 출력하게 했습니다.
	 */

	 /*
	 	문자열인 경우는 trim() 이라는 메소드가 있기는 합니다.
		변수를 이용하면 조건을 좀 줄일 수 있을 거 같네요... ^^
		수업시간에 다시 말할게용
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 각각 띄어서 입력하세요.");
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		sc.close();
		
		if ((first <= second) && (second <= third)) {
			
			System.out.print(third);
			if (second - first > 0) {
				System.out.print(" "+ second);
				System.out.print(" "+ first);
			} else {
				System.out.print(" "+ first);
				System.out.print(" "+ second);
			}
			
		} else if ((first <= second) && (third <= second)) {
			
			System.out.print(second);
			if (third - first > 0) {
				System.out.print(" "+ third);
				System.out.print(" "+ first);
			} else {
				System.out.print(" "+ first);
				System.out.print(" "+ third);
			}
			
		} else { 
			System.out.print(first);
			if (third - second > 0) {
				System.out.print(" "+ third);
				System.out.print(" "+ second);
			} else {
				System.out.print(" "+ second);
				System.out.print(" "+ third);
			}
		}
	
	}
}
