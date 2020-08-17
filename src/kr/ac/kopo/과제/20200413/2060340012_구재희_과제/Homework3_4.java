package jaeheehomework;

import java.util.Scanner;

public class Homework3_4 {
/*
 4. 다음의 결과를 보이는 프로그램을 작성하시오.
	
	1 – 100사이의 정수를 입력하시오 : 64
	64의 약수의 개수 : 7개
	< 64의 7개 약수 출력 >
	1 2 4 8 16 32 64
	
	1 – 100사이의 정수를 입력하시오 : 79
	79의 약수의 개수 : 2개
	< 79의 2개 약수 출력 >
	1 79
 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 - 100 사이의 정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		// 약수를 담을 배열 생성. 많아봐야 자기 자신 보다 작게 갖음
		int[] array3 = new int[num];
		
		//나눴을 때, 나머지가 0이면 약수임
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				array3[i-1] = i;
			}
		}
		
		//약수 개수 출력
		int cnt = 0;
		for(int i = 0; i < array3.length; i++) {
			if(array3[i] != 0) {
				cnt++;
			}
		}
		System.out.printf("%d의 약수의 개수 : %d개\n", num, cnt);
		
		
		//약수 출력
		System.out.printf("< %d의 %d개 약수 출력 >\n", num, cnt);
		
		for(int i = 0; i < array3.length; i++) {
			if(array3[i] != 0) {
				System.out.print(array3[i] + " ");
			}
		}
	}
}
