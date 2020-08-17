package kr.co.hana.homework02;

import java.util.Scanner;

public class Exam03 {
	
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("1-100사이의 정수를 입력 :" );
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
					
			System.out.printf("%d ", i);
		}
		sc.close();

	}
}
