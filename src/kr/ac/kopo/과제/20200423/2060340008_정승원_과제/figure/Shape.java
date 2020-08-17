package kr.ac.kopo.day09.figure;

/**
 * 
 * @author seung
 * 가장 최상위인 추상 클래스
 */

abstract class Shape {
	
	// area
	public double area;
	
	// abstract를 붙여서 추상메소드로 선언한다.
	abstract void getArea();
}
