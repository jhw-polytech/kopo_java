package kr.ac.kopo.assignment.day03;

import java.util.Scanner;

public class No2 {
	/*
	 4개의 정수를 입력받아 가장 큰수를 구하는 코드를 작성하시오
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 4개를 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.nextLine();
		
		//임시 변수
		int max = 0;
		
		if(a >= b && c >= d) {
			if(a >= c) max = a;
			else max = c;
		}
		else if(a < b && c >= d) {
			if(b >= c) max = b;
			else max = c;
		}
		else if(a >= b && c < d) {
			if(a >= d) max = a;
			else max = d;
		}
		else if(a < b && c < d) {
			if(b >= d) max = b;
			else max = d;
		}
		
		System.out.printf("%d, %d, %d, %d 중 가장 큰 수 : %d", a, b, c, d, max);
		
		
		
		
		
		

		
	}

}
