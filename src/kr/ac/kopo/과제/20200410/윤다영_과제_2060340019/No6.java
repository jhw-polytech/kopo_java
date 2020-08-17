package kr.ac.kopo.assignment.day03;

import java.util.Scanner;

public class No6 {
	/*
	 단을 입력받아 구구단을 출력하세요
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2 ~ 9 단을 입력 : ");
		int a = sc.nextInt();
		sc.hasNextLine();
		
		System.out.println("*** " + a + "단 ***");
		for(int i = 1 ; i <= 9 ; i++) {
			int j = a * i;
			System.out.printf("%d * %d = %d\n", a, i, j);
		}
	}

}
