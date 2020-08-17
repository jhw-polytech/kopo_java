package kr.ac.kopo.day2.assignment;

import java.util.Scanner;

public class Exam04 {
	
	public static void main(String[] args) {
		// 4. 하나의 정수를 입력받고 정수를 나눌 수를 입력 받은 다음 몫과 나머지를 출력
		
		//정수 입력 받기
		System.out.println("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int integer = sc.nextInt();
		sc.nextLine();
		
		//나눌 수 입력 받기
		System.out.println("나눌 수를 입력하세요 : ");
		int dividingNumber = sc.nextInt();
		sc.nextLine();
		
		//몫과 나머지 출력
		System.out.println("몫 : " + (integer/dividingNumber));
		System.out.println("나머지 : " + (integer%dividingNumber));
		
	}

}
