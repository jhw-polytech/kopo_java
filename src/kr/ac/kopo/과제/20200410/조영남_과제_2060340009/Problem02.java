package kr.ac.yeongnam.day03.homework;

import java.util.Scanner;

/*
	2. 4개의 정수를 입력받아 가장 큰수를 구하는 코드를 작성하시오.
		정수는 각각 입력받아도 상관없습니다.
	    정수 4개를 입력하세요 : 89 4 222 6 
		89, 4, 222, 6 중 가장 큰수 : 222	
 */

public class Problem02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 4개를 입력하세요 : ");
		int firstInt = sc.nextInt();
		int secondInt = sc.nextInt();
		
		int maxInt; // 가장 큰 정수를 저장하기 위한 변수
		if(firstInt > secondInt) {
			maxInt = firstInt;			
		} else {
			maxInt = secondInt;
		}
		
		int thirdInt = sc.nextInt();
		if(maxInt < thirdInt) {
			maxInt = thirdInt;
		}
		
		int forthInt = sc.nextInt();
		if(maxInt < forthInt) {
			maxInt = forthInt;
		}
		System.out.printf("%d, %d, %d, %d" + " 중 가장 큰수 : " + maxInt, firstInt, secondInt, thirdInt, forthInt);
	}

}
