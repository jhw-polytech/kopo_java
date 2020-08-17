package kr.ac.kopo.day03.exam;

import java.util.Scanner;

/*
6. 단을 입력받아 구구단을 출력하세요
	2 - 9 단을 입력 : 6
	
	*** 6단 ***
	6 * 1 = 6
	6 * 2 = 12
	...
	6 * 9 = 54
*/

public class Day03Exam06 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 구구단의 단을 숫자로 입력하세요.");
		int inputNum = sc.nextInt();		
		
		System.out.println("*** "+inputNum+"단 ***");
		
		
		for(int i=1 ; i<=9 ; i++) {
			
			System.out.println(inputNum + " * "+ i + " = "+inputNum*i);
			
		}
		
	}

}
