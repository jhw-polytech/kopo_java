package kr.ac.kopo.day02.project;

import java.util.Scanner;

/**
 * 
 * @author tess
 * 1달러는 현재 1,092.50원 일때, 
 * 화면에서 달러를 입력 받아 원화로 보여주는 클래스 
 */
public class Project05 {

	public static void main(String[] args) {
		
		final double DOLLAR = 1092.50; // 상수 
		Scanner sc = new Scanner(System.in);
		System.out.print("달러를 입력하세요. ");
		
		double won = Double.parseDouble(sc.nextLine()); 
		
		// 계산과 동시에 출력한다. 
		System.out.printf("원화 : %.2f원 ", won * DOLLAR);
		
		
	}
}
