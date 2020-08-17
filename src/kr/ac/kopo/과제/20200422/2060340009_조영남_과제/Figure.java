package kr.ac.yeongnam.day08.homework;

import java.util.Random;

/**
 * 도형의 면적을 구하는 Util 클래스(공통 부분이 적은 것 같아 상속 개념을 사용하지 않았습니다.)
 * @author socra
 *
 */
public class Figure {
		
	/**
	 * 랜덤한 정수 하나를 반환하는 static 메소드
	 * @return
	 */
	public static int randomNum() {
		Random r = new Random();
		int randomNum = r.nextInt(9) + 2;
		
		return randomNum;
	}

	/**
	 * 직사각형 면적을 구하는 static 메소드
	 */
	public static void rectangleCal() {
		System.out.println("  Random 하게 2 ~ 10 사이의 정수 2개를 추출");
		int width = randomNum();
		int height = randomNum();
		int result = width * height;
		
		System.out.println("  가로 " + width + ", 세로 " + height + "의 직사각형 면적은 " + result + "입니다.");
	}
	
	/**
	 * 정사각형 면적을 구하는 static 메소드
	 */
	public static void squareCal() {
		System.out.println("  Random 하게 2 ~ 10 사이의 정수 1개를 추출");
		int randomNum = randomNum();
		int result = randomNum * randomNum;
		
		System.out.println("  가로 " + randomNum + "의 정사각형 면적은 " + result + "입니다.");
	}
	
	/**
	 * 삼각형 면적을 구하는 static 메소드
	 */
	public static void triangleCal() {
		System.out.println("  Random 하게 2 ~ 10 사이의 정수 2개를 추출");
		int width = randomNum();
		int height = randomNum();
		double result = width * height * 0.5;

		System.out.println("  가로 " + width + ", 세로 " + height + "의 삼각형 면적은 " + result + "입니다.");
	}
	
	/**
	 * 원의 면적을 구하는 static 메소드
	 */
	public static void circleCal() {
		System.out.println("  Random 하게 2 ~ 10 사이의 정수 1개를 추출");
		int randomNum = randomNum();
		final double PI = 3.141592;
		double result = PI * randomNum * randomNum;
		
		System.out.println("  가로 " + randomNum + "의 원 면적은 " + result + "입니다.");		
	}
	
}
