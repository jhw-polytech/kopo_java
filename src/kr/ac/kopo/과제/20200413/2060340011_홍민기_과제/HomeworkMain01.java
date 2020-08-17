package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 1. 10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오.
 * 1's num : 12
 * 2's num : 5
 * 3's num : 8
 * 4's num : 30
 * 5's num : 22
 * 6's num : 87
 * 7's num : 9
 * 8's num : 4
 * 9's num : 15
 * 10's num : 22
 *
 * < 짝수 >
 * 12 8 30 22 4 22
 * 짝수의 총합 : XXX
 *
 * < 홀수 >
 * 5 87 9 15
 * 홀수의 총합 : XXX
 * 
 */

public class HomeworkMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		int oddSum = 0;
		int evenSum = 0;

		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1 + "'s num : ");
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) {
				evenSum+=arr[i]; // 짝수 일 때, 짝수합에 저장
			}
			else {
				oddSum+=arr[i]; // 홀수 일 때, 홀수합에 저장
			}
		}

		System.out.println("< 짝수 >");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("짝수의 총합 : "+evenSum);
		
		System.out.println("< 홀수 >");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("홀수의 총합 : "+oddSum);
	}

}
