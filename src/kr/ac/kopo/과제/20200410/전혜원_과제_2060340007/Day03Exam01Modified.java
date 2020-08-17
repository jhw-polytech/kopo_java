package kr.ac.kopo.day03.exam;

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


public class Day03Exam01Modified {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 입력: ");
		int num1 = sc.nextInt();

		System.out.println("두 번째 정수 입력: ");
		int num2 = sc.nextInt();

		System.out.println("세 번째 정수 입력: ");
		int num3 = sc.nextInt();
		
		int convert = 0;
		
		//num1과 num2를 비교해 큰 수를 num1으로 이동
		if (num1<num2) {
			convert = num2;
			num2 = num1;
			num1 = convert;
		}
		
		//마찬가지로 num2와 num3를 비교해 큰 수를 앞으로 이동
		if(num2<num3) {
			convert = num3;
			num3 = num2;
			num2 = convert;
		}
		
		//바뀐 num1과 num2를 비교해 큰 수를 앞으로 이동
		if(num1<num2) {
			convert = num2;
			num2=num1;
			num1=convert;
		}
		
		System.out.printf("%d  %d  %d", num1, num2, num3);
		
		sc.close();
		
	}	

}
