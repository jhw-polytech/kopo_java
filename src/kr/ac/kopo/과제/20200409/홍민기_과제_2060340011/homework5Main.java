package kr.ac.kopo.day02.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 5. 1달러는 현재 1,092.50원 입니다. 화면에서 달러를 입력 받아 원화로 보여주는 프로그램을 작성하세요
 * 달러를 입력하세요 : 10
 * 원화 : 10925.00원
 * 
 */

public class homework5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원·달러 환율을 입력하세요 : ");
		double exchangeRate = sc.nextDouble();
		
		System.out.print("달러를 입력하세요 : ");
		int dollar = sc.nextInt();
		
		System.out.print("원화 : "+ Math.floor(exchangeRate * dollar*100)/100 +"원");

	}

}
