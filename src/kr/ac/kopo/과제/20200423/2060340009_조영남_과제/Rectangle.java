package kr.ac.yeongnam.day09.homework;

public class Rectangle extends Figure {

	private int width;
	private int height;
	private int area;
		
	/**
	 * 직사각형의 너비를 구하는 메소드(오버라이딩)
	 */	
	public void getArea(){
		this.width = getRandomNum();
		this.height = getRandomNum();
		
		this.area = width * height; 
		
		System.out.println("가로 " + width +", 세로 " + height + "의 직사각형 면적은 " + area +"입니다.");
	}
	
	
}
