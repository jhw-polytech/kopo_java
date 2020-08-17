package kr.ac.kopo.day03.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 2. 4개의 정수를 입력받아 가장 큰수를 구하는 코드를 작성하시오.
 * 정수는 각각 입력받아도 상관없습니다.
 * 정수 4개를 입력하세요 : 89 4 222 6
 * 89, 4, 222, 6 중 가장 큰수 : 222
 * 
 */
public class Homework2Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 4개를 입력하세요 : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		// 비교를 하는 경우의 수는 4개중에 2개를 뽑으므로 4C2 = 6가지 경우를 생각하면 된다.
		
		System.out.print(num1+", "+num2+", "+num3+", "+num4+" 중 가장 큰 수 : ");
		
		if(num1<=num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		if(num1<=num3) {
			int tmp = num1;
			num1 = num3;
			num3 = tmp;
		}
		if(num1<=num4) {
			int tmp = num1;
			num1 = num4;
			num4 = tmp;
		}
		if(num2<=num3) {
			int tmp = num2;
			num2 = num3;
			num3 = tmp;
		}
		if(num2<=num4) {
			int tmp = num2;
			num2 = num4;
			num4 = tmp;
		}
		if(num3<=num4) {
			int tmp = num3;
			num3 = num4;
			num4 = tmp;
		}
		// for문 돌려서 max찾을걸 그랬나봐요...
		
		System.out.println(num1);
	}
}
