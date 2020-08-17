package kr.ac.kopo.day02.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 3. 반지름이 10인 원의 면적을 구해서 출력하시오
 * 참고 : 원주율 – 3.141592
 * 결과출력 : 원의 면적은 143.1234 입니다.
 * 
 */

public class homework3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.141592; // 파이를 상수로 지정
		
		System.out.print("반지름을 입력하세요 : ");
		int r = Integer.parseInt(sc.nextLine());
		
		System.out.println("결과출력 : 원의 면적은 "+ r*r*PI+" 입니다."); // 원의 면적은 반지름 * 반지름 * pi
	}

}
