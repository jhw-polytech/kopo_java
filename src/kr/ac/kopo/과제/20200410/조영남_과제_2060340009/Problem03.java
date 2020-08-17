package kr.ac.yeongnam.day03.homework;

import java.util.Scanner;
/*
	3. 정수를 입력받아 1에서부터 입력받은 정수사이의 숫자를 출력하는 코드를 작성
	   1 - 100사이의 정수를 입력 : 60
	   
	   < 1 ~ 60 정수 출력 >    
	   1  2  3   .... 60  
 */

public class Problem03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1-100 사이의 정수를 입력 : ");
		
		int lastInt = sc.nextInt(); // 출력의 범위를 저장하기 위한 변수
		sc.nextLine();
		
		System.out.printf("\n<1 ~ %d 정수 출력>\n", lastInt);
		for(int cnt = 1; cnt <= lastInt; cnt++) { // 출력의 범위 만큼 반복문 실행
			System.out.print(cnt + " ");			
		}		
	}
}
