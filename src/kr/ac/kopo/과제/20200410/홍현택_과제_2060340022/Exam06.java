package kr.co.hana.homework02;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("2 - 9단을 입력 :");
		int multiple = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", multiple, i, multiple*i);
		}
		
		
		
		sc.close();
	}
}
