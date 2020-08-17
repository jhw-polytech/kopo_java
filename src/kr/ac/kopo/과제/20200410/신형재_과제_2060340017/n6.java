package homework0410;

/*
 * 2060340017 신형재 과제 6번
 * 
 * 사용자 입력을 받은 수에 대한 구구단 출력하기
 * 
 */

import java.util.Scanner;

public class n6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2-9단을 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.printf("***%d단***\n", num1);
		
		// for 문을 통해 1~9까지의 수와 사용자가 입력한 수를 곱하여 구구단 출력
		
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num1, i, num1*i);
		}
		
	}

}