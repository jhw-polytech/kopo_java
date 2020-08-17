package test0410;

/*
 1달러는 현재 1092.50원 입니다. 화면에서 달러를 입력 받아 
 원화로 보여주는 프로그램을 작성하세요.
 달러를 입력하세요 ? 10
 원화 : 10925.00원
 */

import java.util.Scanner;

public class exam05 {

	public static void main(String[] args) {
		
		System.out.println("달러를 입력하세요");
		Scanner sc = new Scanner(System.in);
		double dollar = sc.nextDouble();
		sc.nextLine();
		
		double 원화 = 1092.50*dollar;
		System.out.print(dollar +"달러는 원화로" + 원화 + "원입니다");
		
	}
	
}
