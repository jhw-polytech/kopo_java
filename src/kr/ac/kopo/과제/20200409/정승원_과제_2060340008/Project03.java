package kr.ac.kopo.day02.project;

import java.util.Scanner;

/**
 * 
 * @author tess
 * 반지름이 10인 원의 면적을 구해서 출력하는 클래스 
 */

public class Project03 {
	
	public static void main(String[] args) {
		
		final double PI = 3.141592; // 상수 
		
		Scanner sc = new Scanner(System.in);
		
		double radius = Double.parseDouble(sc.nextLine()); // double 타입으로 받는다. 
		
		System.out.printf("원의 면적은 %.4f 입니다.",(PI*radius*radius));
		
		
	}

}
