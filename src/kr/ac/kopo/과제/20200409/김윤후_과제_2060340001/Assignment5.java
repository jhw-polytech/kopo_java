package kr.ac.kopo.Assignment1;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달러를 입력하세요?");
		int dollor= sc.nextInt();
		sc.nextLine();
		
		System.out.printf("원화 : %.2f",dollor*1092.5);
				
	}
}

//Scanner로 dollor 변수에 달러 값을 입력받음
// printf를 통해 달러값을 원화로 환산함 .2f를 통해 소수점 둘째자리까지 표현