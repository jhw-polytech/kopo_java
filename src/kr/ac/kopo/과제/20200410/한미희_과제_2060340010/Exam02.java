package kr.ac.kopo.day3.assignment;

import java.util.Scanner;

public class Exam02 {
	
	public static void main(String[] args) {
	//4개의 정수를 입력받아 가장 큰 수 구하기
		
		//정수 4개 입력받기
		System.out.println("정수 4개를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		int number4 = sc.nextInt();
		
		
		//정수 2개씩 짝을 지어 크기 비교한 다음 각 그룹에서 큰 수를 담을 변수 선언
		int large1;
		int large2;
		
		
		//정수 2개씩 크기 비교하여 각각 큰 수를 위에서 선언한 변수에 대입
		if(number1 > number2) {
			large1 = number1;
		}else {
			large1 = number2;
		}
		
		if(number3 > number4) {
			large2 = number3;
		}else {
			large2 = number4;
		}
		
		
		//최종적으로 가장 큰 수 출력하기
		if (large1>large2) {
			System.out.printf("%d, %d, %d, %d 중 가장 큰수 :%d", number1, number2, number3, number4, large1);
		}else {
			System.out.printf("%d, %d, %d, %d 중 가장 큰수 :%d", number1, number2, number3, number4, large2);
		}
	
		
	}
}
