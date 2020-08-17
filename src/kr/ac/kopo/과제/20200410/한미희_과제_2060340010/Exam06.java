package kr.ac.kopo.day3.assignment;

import java.util.Scanner;

public class Exam06 {
	
	public static void main(String[] args) {
	//단을 입력받아 구구단 출력하기
		
		//단 입력받기
		System.out.println("2 - 9 단을 입력 :");
		Scanner sc = new Scanner(System.in);
		int timesTable = sc.nextInt();
		
		
		//입력받은 단에 맞는 구구단 출력
		System.out.printf("*** %d단 ***", timesTable);
		System.out.print('\n');
		for (int i =1; i<=9; i++) {
			System.out.printf("%d * %d = %d", timesTable, i, timesTable*i);
			System.out.print('\n');
		}
		
		
	}
}
