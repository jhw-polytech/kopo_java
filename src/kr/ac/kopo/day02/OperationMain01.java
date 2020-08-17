package kr.ac.kopo.day02;

import java.util.Scanner;

public class OperationMain01 {

	
	public static void main(String[] args) {
		int a = 1, b = -1, c = 0;
	
		
		
//		boolean bool = (++a > 0) && (++ b > 0); 
//		boolean bool = (--a > 0) && (-- b > 0); 
		boolean bool = (--b > 0) && (-- a > 0); 
		
		System.out.printf("a = %d b = %d c = %d", a, b, c, bool);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		boolean result = (num % 2 == 0);
//		boolean result = (num >=0 ) && (num % 2 == 0); ---> if문을 쓰지 않고도 음수를 걸러내는 방법
		
		System.out.println(num + "짝수판단여부 : " + result);
		
		
		
		
	}
}
