package kr.ac.kopo.day02.exam;

import java.util.Scanner;

/*
	3. 반지름이 10인 원의 면적을 구해서 출력하시오
	참고 : 원주율 – 3.141592
	결과출력 : 원의 면적은 143.1234 입니다.
*/

public class Exam03 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final double PI = 3.141592;
		
		//키보드로 반지름값 입력받기
		System.out.println("반지름을 입력해주세요(소수점 가능): ");
		double r = sc.nextDouble();
		sc.nextLine();
		
		
		//음수인 경우 걸러내기
		if(r<=0) {
			System.out.println("양수만 입력 가능합니다.");
		} else {
			System.out.printf("원의 넓이는 %.4f 입니다.", r*r*PI);
		}
		
	}

}
