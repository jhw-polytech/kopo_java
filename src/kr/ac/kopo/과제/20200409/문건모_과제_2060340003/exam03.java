package test0410;

/*
 반지름이 r인 원의 면적을 구해서 출력하시오.
 단, r이 음수인 경우 "잘못된 값을 입력했습니다"
 참고 : 원주율 -3.14592
 결과출력 : 원의 면적은 143.1234 입니다.
 */

import java.util.Scanner;

public class exam03 {
	
	public static void main(String[] args) {
		
		System.out.println("반지름 r 값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.nextLine();
		
		double PI = 3.141592;
		double area = r*r*PI;
		
		if(r >= 0) {
			System.out.println("원의 면적은" + area + "입니다");
		}else {
			System.out.println("잘못된 값을 입력했습니다");
		}
		
	}

}
