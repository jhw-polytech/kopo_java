package kr.ac.kopo.day01;

import java.util.Scanner;

/*
 * Scanner 클래스
 * : 키보드를 통해 정수, 실수, 논리값, 문자열을 입력받는 기능을 제공하는 클래스
 * */

public class ScannerMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수를 입력하세요: ");
//		int num = sc.nextInt();		
//		System.out.println("num= "+num);
		
		
		//(문자열 -> 정수) 순서는 괜찮은데, 반대로 (정수 -> 문자열)은 문자열 입력을 받지 않는다
		System.out.println("문자열을 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("정수를 입력 : ");
		int num = sc.nextInt();
		
		System.out.println("문자열 : " + str + " / 정수 : " + num);
		
		
	}

}
