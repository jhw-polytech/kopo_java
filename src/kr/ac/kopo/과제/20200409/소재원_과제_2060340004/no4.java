package exam0409;

import java.util.Scanner;

public class no4 {
	
	/*
	 * 정수를 두 개 입력받아 계산한다.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int anum = sc.nextInt();
		System.out.println("나눌 수를 입력하세요.");
		int bnum = sc.nextInt();
		sc.close();
		
		System.out.printf("몫 : %d\n", anum / bnum);
		System.out.printf("나머지 : %d", anum % bnum);
	}
}
