package kr.ac.yeongnam.day09.homework;

import java.util.Random;
import java.util.Scanner;

public class Figure {
	
	private Scanner sc;
	private Random r;
	
	// 생성자를 호출할 때, Scanner 객체와 Random 객체 생성
	Figure(){
		sc = new Scanner(System.in);
		r = new Random();
	}
	
	// 도형의 너비를 구하는 메소드(도형별로 함수명을 통일하기 위해 오버라이딩 함)
	public void getArea() {
		
	};
	
	// 랜덤 정수를 받는 메소드
	public int getRandomNum() {
		int randomNum = r.nextInt(9) + 2;
		
		return randomNum;
	};
	
}
