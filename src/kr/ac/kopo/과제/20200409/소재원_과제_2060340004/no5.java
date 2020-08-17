package exam0409;

import java.util.Scanner;

public class no5 {
	
	/*
	 * 단순히 달러를 입력받아서 1092.50을 곱해주면 된다.
	 * 소수점 둘째자리까지 끊는다.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("달러를 입력하면 원화로 환산됩니다.");
		int dollar = sc.nextInt();
		sc.close();
		
		System.out.printf("원화 : %.2f원", dollar * 1092.50);
	}
}
