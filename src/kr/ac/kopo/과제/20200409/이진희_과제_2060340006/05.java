package day0409;

import java.util.Scanner;

/*
 * 1달러는 현재 1,092.50입니다. 화면에서 달러를 입력받아 원화로 보여주는 프로그램을 작성하세요.
 * 달러를 입력하세요?
 * 원화: 1,092.50
 */

public class task5 {
	
	public static void main(String[] args) {
	
       Scanner sc = new Scanner(System.in);   // scanner클래스는 정수,실수,문자열을 읽어온다.
		
		System.out.print("원·달러 환율을 입력하세요 : ");   
		double rateofExchange = sc.nextDouble();   // 실수이니 double사용 
		
		System.out.print("달러를 입력하세요 : ");
		int dollar = sc.nextInt();          
		
		System.out.print("원화 : "+ (int)(rateofExchange * dollar) +"원"); // double 환율을 int 원화로 변환 

	}

}
	
