package kr.ac.kopo.Assignment1;

import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String[] args) {
		Scanner sc=	new Scanner(System.in);
		
		System.out.println("반지름을 입력하시오");
		
		int r = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("원의 면적은 %f입니다.",r*r*3.141592);
	}
}

//반지름 r을 변수로 받아
//printf로 원의 넓이를 구했습니다. 실수이기때문에 %f를 사용했습니다.