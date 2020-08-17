package kr.ac.kopo.assignment.day03;

import java.util.Scanner;

public class No3 {
	/*
	 정수를 입력받아 1에서부터 입력받은 정수 사이의 숫자를 출력하는 코드를 작성
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 100 사이의 정수를 입력 : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("< 1 ~ %d 정수 출력 >\n", a);
		for(int temp = 1; temp <= a; temp++) {
			System.out.print(temp+" ");
		}
		
		
		
	}

}
