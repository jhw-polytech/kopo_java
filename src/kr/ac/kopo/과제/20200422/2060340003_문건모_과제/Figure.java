package test0422;

import java.util.Scanner;
import java.util.Random;

public class Figure {
	
	
	private int figurenum;
	private int side_01;
	private int side_02;
	private double area;
	private static double Pi = 3.14;
	
	
	
	Figure(){
		
	}
	
	Figure(int figurenum, int side_01, int side_02, double area){
		this.figurenum = figurenum;
		this.side_01 = side_01;
		this.side_02 = side_02;
		this.area = area;
	}
	
	/**
	 * 랜덤하게 정수를 받아오는 메소드입니다
	 * @return 2 ~ 10 사이의 정수
	 */
	public int getNum() {
		Random r = new Random();
		int side = r.nextInt(9) + 2;
		return side;
	}
	
	
	/**
	 * 직사각형의 면적을 구하는 메소드입니다
	 */
	public void rectangle() {
		
		side_01 = getNum();
		side_02 = getNum();
		area = side_01*side_02;
		System.out.println("가로 " + side_01 + ", 세로 " + side_02 + "의 직사각형 면적은 " + area + " 입니다");
		
	}
	
	/**
	 * 정사각형의 면적을 구하는 메소드입니다
	 */
	public void square() {
		side_01 = getNum();
		area = side_01*side_01;
		System.out.println("한변의 길이가 " + side_01 + "인 정사각형의 면적은 " + area + " 입니다");
	}
	
	/**
	 * 삼각형의 면적을 구하는 메소드입니다
	 */
	public void triangle() {
		side_01 = getNum();
		side_02 = getNum();
		area = ((double)side_01*side_02)/2;
		System.out.println("한변의 길이가 " + side_01 + ", 높이가 " + side_02 + "인 삼각형의 면적은 " + area + " 입니다" );
		
	}
	
	/**
	 * 원의 면적을 구하는 메소드입니다
	 */
	public void circle() {
		side_01 = getNum();
		area = side_01*side_01*Pi;
	    System.out.println("반지름의 길이가 " + side_01 + "인 원의 면적은 " + area + " 입니다");
	}
	
	/**
	 * 도형 선택시 결과값을 출력해주는 메소드입니다
	 */
	public void printInfo() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형 , 4.원)");
		
		figurenum = sc.nextInt();
		sc.nextLine();
		
		switch(figurenum) {
		 
		case 1 :
			rectangle();
			break;
		case 2 :
			square();
			break;
		case 3 :
			triangle();
			break;
		case 4 :
			circle();
		    break;
		}
		
	}

}
