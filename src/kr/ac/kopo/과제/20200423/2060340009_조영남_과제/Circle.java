package kr.ac.yeongnam.day09.homework;

public class Circle extends Figure {
	private int radius;
	private final double PI = 3.141592;
	private double area;
		
	/**
	 * 원의 너비를 구하는 메소드(오버라이딩)
	 */
	public void getArea(){
		this.radius = getRandomNum();
		
		this.area = PI * radius * radius; 
		
		System.out.println("반지름 " + radius + "의 원 면적은 " + area + "입니다.");
	}
	
}
