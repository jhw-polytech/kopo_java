package kr.ac.yeongnam.day03.homework;

import java.util.Scanner;

/*
	1. 정수 3개를 입력받아 큰수에서 작은수 순으로 출력하는 코드를 작성하시오
		정수 3개를 입력하세요 : 12 6 22
		22 12 6
		또는   
		첫번째 정수 입력 : 12
	    두번째 정수 입력 : 6
	    세번째 정수 입력 : 22
		22 12 6  
 */

public class Problem01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int firstInt = sc.nextInt();
		sc.nextLine(); // 버퍼 버그 방지를 위한 조치
		
		System.out.print("두번재 정수 입력 : ");
		int secondInt = sc.nextInt();
		sc.nextLine(); // 버퍼 버그 방지를 위한 조치
		
		if(firstInt < secondInt) { // 두 번째로 입력받은 정수가 더 크면, 값을 교환합니다.
			int tmp1 = firstInt;
			firstInt = secondInt;
			secondInt = tmp1;						
		}
		
		System.out.print("세번째 정수 입력 : ");
		int thirdInt = sc.nextInt();
		sc.nextLine();
		
		if(secondInt < thirdInt) {
			int tmp2;
			if(firstInt < thirdInt) { // 세 번째로 받은 수가 첫번째보다 크면, 두 수를 바꿉니다.
				tmp2 = firstInt;
				firstInt = thirdInt;
				thirdInt = secondInt;
				secondInt = tmp2;
				
			} else { // 세 번째로 받은 수가 두 번째보다 크면, 두 수를 바꿉니다.
				tmp2 = secondInt;
				secondInt = thirdInt;
				thirdInt = tmp2;				
			}
		}		
		System.out.printf("%d %d %d", firstInt, secondInt, thirdInt);
	}
}
