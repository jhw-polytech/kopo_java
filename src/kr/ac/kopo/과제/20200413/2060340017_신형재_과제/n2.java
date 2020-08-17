package homework0413;

/*
 * 2060340017 신형재 과제 2번
 * 
 *임의의 5개 정수 입력, 홀수일 경우 다시 입력
 *입력된 정수 출력
 *
 */

import java.util.Scanner;

public class n2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int[] numArr = new int[5];
		
		/*
		 * 사용자 입력 반복문
		 * 짝수인 경우 numArr에 입력
		 * 홀수인 경우 해당 반복문에서 재반복(i--)
		 */
		for(int i = 0; i<5; i++) {
			System.out.printf("%d's 정수 : ", i+1);
			num = sc.nextInt();
			if(num%2==0) {
				numArr[i]=num;
			}else {
				i--;
			}
		}
		System.out.println("<5개 정수 출력>");
		for(int j : numArr) {
			System.out.print(j + " ");
		}
		
	}
}
