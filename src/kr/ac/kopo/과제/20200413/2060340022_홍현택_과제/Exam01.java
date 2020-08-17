package kr.co.hana.Homework03;

import java.util.Scanner;
import java.util.ArrayList;

/* 
 case1 : 10개 입력 -> 10개를 for문과 if문을 사용해서 짝수/홀수로 분리 -> 해결
 case2 : 1개 입력할 때마다 짝수/홀수 판단해 짝수 array, 홀수 array에 넣어줄수는 없을까? -> 실패, 너무 오래 걸려서 일단 패스 	
 - 입력값 = 1, 2, 4, 3, 11, 12, 20, 21, 23, 30
 - 홀수 array = [1] [1,3] [1, 3, 11] [1, 3, 11, 21] [1, 3, 11, 21, 23] <-최종 홀수 array
 - 짝수 array = [2] [2,4] [2, 4, 12] [2, 4, 12, 20] [2, 4, 12, 20, 30] <-최종 짝수 array
 ==> arraylist를 사용하면 동적 크기조정이 가능하다고 함. 다시 구현
 */

public class Exam01 {
	public static void main(String[] args) {

		// <-- case 1 -->
		
		Scanner sc = new Scanner(System.in);

		int[] intNum = new int[10];

		// 10개의 입력값을 입력
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "'s num : ");
			intNum[i] = sc.nextInt();
		}

		// 홀수/짝수의 총합을 계산하기 위한 변수 선언
		int evenSum = 0;
		int oddSum = 0;

		// 짝수
		System.out.printf("\n< 짝수 >\n");
		for (int j = 0; j < intNum.length; j++) {

			if (intNum[j] % 2 == 0 && intNum[j] > 0) { // 짝수인 경우
				System.out.printf("%d  ", intNum[j]);
				evenSum += intNum[j];
			}
		}
		System.out.printf("\n짝수의 총합 : %d\n", evenSum);

		// 홀수
		System.out.printf("\n< 홀수 >\n");
		for (int k = 0; k < intNum.length; k++) {

			if (intNum[k] % 2 == 1 && intNum[k] > 0) {
				System.out.printf("%d  ", intNum[k]);
				oddSum += intNum[k];
			}
		}
		System.out.printf("\n홀수의 총합 : %d", oddSum);
		sc.close();
		
		/*
		// <-- case 2 -->
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();

		// 10개의 입력값을 입력
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "'s num : ");
			int num = sc.nextInt();

			if (num % 2 == 0) {
				even.add(num);
			} else {
				odd.add(num);
			}
		}
		
		int evenSum = 0;  //짝수와 홀수의 합을 구하기 위해 초기화
		int oddSum =0;
		
		// 짝수
		System.out.println("< 짝수 >");
		for (int j = 0; j < even.size(); j++) {
			int even2 = even.get(j);
			evenSum += even2;
			
			System.out.printf("%d  ", even2);
		}
		System.out.printf("\n짝수의 총합 : %d\n\n", evenSum);
		
		// 홀수
		System.out.println("< 홀수 >");
		for (int j = 0; j < odd.size(); j++) {
			int odd2 = odd.get(j);
			oddSum += odd2;
			
			System.out.printf("%d  ", odd2);
		}
		System.out.printf("\n홀수의 총합 : %d", oddSum);
		
		*/
	}
}
