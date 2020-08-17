package homework0409;

/*
 * 2060340017 신형재 과제 5번
 * 
 * 사용자로부터 달러를 입력 받고, 고정된 환율을 적용하여 원화 산출
 */

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자를 통해 달러 입력
		System.out.print("달러를 입력하세요 ? ");
		int usd = sc.nextInt();
		final double krwR = 1092.50;

		// 고정된 환율 적용하여 달러 계산
		
		System.out.println("원화 : " + usd*krwR + "원");
	}
}
