package kr.ac.kopo.assignment.day04;

import java.util.Scanner;

public class No02 {
	/*
	 5개의 짝수를 입력받아 출력하는 코드를 작성
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
				
		for(int i = 0; i < 5; i++) {
			System.out.print(i+1 + "'s 정수 : ");
			num[i] = sc.nextInt();
			
			// 반복문을 통해서 입력받은 정수가 짝수가 맞는지 확인, 아니면 재입력
			while(num[i]%2 != 0) {
				System.out.print(i+1 + "'s 정수 : ");
				num[i] = sc.nextInt();
			}						
			
		}
		
		
		System.out.println("< 5개의 정수 출력 >");
		for(int a : num) {
			System.out.print(a + " ");
		}		
		
	}
	

}
