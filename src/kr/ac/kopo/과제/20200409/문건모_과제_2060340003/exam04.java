package test0410;

/*
 화면에 하나의 정수를 입력 받고 정수를 나눌 수를 입력 받은 다음
 몫과 나머지를 화면에 출력하시오.
입력된 정수가 음수인 경우 잘못입력했습니다 출력
 */

import java.util.Scanner;

public class exam04 {
	
	public static void main(String[] args) {
		
		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		System.out.println("나눌 정수를 입력하세요");
		int a = sc.nextInt();
		
		int p = r/a;
		int q = r%a;
		
		if(r>=0) {
			System.out.println("몫은" + p + "나머지는" + q + "입니다");
		}else {
			System.out.println("잘못된 수를 입력했습니다");
		}
		
		
	}

}
