package kr.ac.yeongnam.day04.homework;

import java.util.Scanner;

/*
 	4. 다음의 결과를 보이는 프로그램을 작성하시오.   
 	int[] nums = new int[30]; 
 	1 – 100사이의 정수를 입력하시오 : 64 
 	64의 약수의 개수 : 7개 
 	< 64의 7개 약수 출력 > 
 	1 2 4 8 16 32 64 
 	
 	1 – 100사이의 정수를 입력하시오 : 79 
 	79의 약수의 개수 : 2개 
 	< 79의 2개 약수 출력 > 
 	1 79
 */

public class Problem04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int[] nums = new int[30];
		System.out.print("1 - 100 사이의 정수를 입력하시오 : ");		
		int intNum = sc.nextInt();		
		
		int count = 0;		
		for(int i = 1; i <= intNum; i++) { // intNum의 약수를 구하고, nums 배열에 할당
			if(intNum % i == 0) {
				nums[count] = i;
				count++;
			}
		}
		
		System.out.println(intNum + "의 약수의 개수 : " + count + "개");
		
		// 배열의 길이는 반드시 선언되어야 깊은 복사가 가능하다.
		int[] factorArr = new int[count]; // 약수의 개수 만큼 배열을 생성한다.
		System.arraycopy(nums, 0, factorArr, 0, count); // 깊은 복사 API
		
		System.out.println("< " + intNum + "의 " + count + "개 약수 출력 >");
		for(int num : factorArr) {
			System.out.print(num + " ");
		}		
	}
}
