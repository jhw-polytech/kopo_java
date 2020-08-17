package homework0410;

/*
 * 2060340017 신형재 과제 8번
 * 
 * 입력하는 두 수에 대한 구구단 만들기
 * 이때, 입력하는 두 수의 크기에 상관 없이 출력되어야 함
 * 
 */

import java.util.Scanner;

public class n8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 단을 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("종료 단을 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("\n\n");
		
		// 종료 단으로 입력한 두번째 수가 더 클 경우
		
		if(num1<=num2) {
		int line = 0;
		for(int i = num1; i<=num2; i++) {
			System.out.printf("***%d단***\n", i);
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				line++;
				if(line%9 == 0) {
					System.out.print("\n");
				}
			}
		}
		
		// 시작 단으로 입력한 첫번째 수가 더 클 경우
	}else {
		int line = 0;
		for(int i = num2; i<=num1; i++) {
			System.out.printf("***%d단***\n", i);
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				line++;
				if(line%9 == 0) {
					System.out.print("\n");
	}
	}
		}
	}
	}
}