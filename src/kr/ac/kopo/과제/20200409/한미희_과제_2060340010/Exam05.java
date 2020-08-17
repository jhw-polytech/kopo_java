package kr.ac.kopo.day2.assignment;

import java.util.Scanner;

public class Exam05 {
	
	public static void main(String[] args) {
		// 5. 달러를 입력받아 원화를 출력
		
		//달러 입력 받기
		System.out.println("달러를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int dollar = sc.nextInt();
		sc.nextLine();
		
		System.out.println("원화 : " + (dollar*1092.50) + "원");
		
	}

}
