package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 4. 다음의 결과를 보이는 프로그램을 작성하시오.
 * int[] nums = new int[30];
 * 1 – 100사이의 정수를 입력하시오 : 64
 * 64의 약수의 개수 : 7개
 * < 64의 7개 약수 출력 >
 * 1 2 4 8 16 32 64
 * 1 – 100사이의 정수를 입력하시오 : 79
 * 79의 약수의 개수 : 2개
 * < 79의 2개 약수 출력 >
 * 1 79
 * 
 */

public class HomeworkMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[30];
		
		System.out.print("1 - 100사이의 정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		int j=0; // 약수의 개수를 나타내는 index 
		for(int i=1;i<=num;i++) { // 1부터 num까지 약수를 검사하기 위한 반복문
			if(num%i==0) { // num을 i가 나누면 약수
				nums[j]=i; // 배열에 약수를 저장하고
				j++; // 인덱스를 늘려 그 다음 배열에 약수를 저장 이 때, j는 약수의 개수와 동일
			}
		}
		System.out.println(num+"의 약수의 개수 : "+j+"개");
		System.out.println("< "+num+"의 "+j+"개 약수 출력 >");
		for(int i=0;i<j;i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
