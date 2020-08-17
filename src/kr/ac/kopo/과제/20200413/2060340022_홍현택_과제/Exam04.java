package kr.co.hana.Homework03;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] nums = new int[30]; // 약수를 저장해줄 array

		System.out.print("1 - 100사이의 정수를 입력하시오 : ");  // num = 입력값, cnt = 배열 위치, nums = 크기가 30인 배열
		int num = sc.nextInt();
		int cnt = 0;

		for (int i = 1; i <= num; i++) {		// 약수를 구한다. 
			if (num % i == 0) {
				nums[cnt] = i;
				cnt++;
			}
		}
		System.out.printf("%d의 약수의 개수 : %d개\n",num, cnt ); 
		
		for(int j = 0; j < cnt; j++) {			// 배열의 크기가 30인 nums에서 약수값을 하나씩 출력
			System.out.printf("%d ", nums[j]);
		}
		sc.close();
		
	}
}
