package jaeheehomework;

import java.util.Scanner;

public class Homework3_2 {
/*
 2. 5개의 짝수를 입력받아 출력하는 코드를 작성
	1's 정수 : 12
	2's 정수 : 5
	2's 정수 : 20
	3's 정수 : 10
	4's 정수 : 26
	5's 정수 : 5
	5's 정수 : 11
	5's 정수 : 4

	< 5개의 정수 출력 >
	12 20 10 26 4
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//짝수만 넣을 배열 생성
		int[] even = new int[5];
		
		//짝수인지 아닌지를 판별할 boolean 변수를 생성
		boolean bool = false;
		
		//짝수를 5개 채울때까지 계속 돌림	
		// bool 값이 true이면(짝수 값이 나오면) +1을, 그렇지 않으면 +0을 해서 계속 돌게함
		for (int i = 0; i < 5; i += (bool == true) ? 1 : 0) {

			System.out.printf("%d's 정수 : ", i+1);
			int num = sc.nextInt();

			// 짝수이면 배열에 추가하고, bool을 true로 바꿔줌
			if (num % 2 == 0) {
				even[i] = num;
				bool = true;
			} else {
				bool = false; // 홀수이면 bool을 false로 둬서 i를 증가시키지 않음
			}
		}
		
		System.out.println("\n< 5개의 짝수 출력 >");
		
		for(int i = 0; i < 5; i++) {
			System.out.print(even[i] + " ");
		}
	}
}
