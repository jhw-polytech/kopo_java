package kr.ac.kopo.assignment.first;

import java.util.Scanner;

public class No3 {
	/*
	 반지름이 10인 원의 면적을 구해서 출력하시오(반지름은 입력받기!)
	 참고 : 원주율 -3.141592
	 */
	public static void main(String[] args) {
		
		
		
		System.out.print("원의 반지름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		sc.nextLine();
		
		double PI = 3.141592;
		
		double area = PI * radius * radius;
		
		//소숫점 4자리까지 표현
		System.out.printf("결과 출력 : 원의 면적은 %.4f 입니다", area);
		
		
		
		
	}
	
}
