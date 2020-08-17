package kr.ac.yeongnam.day09.homework;

public class Triangle extends Figure {
	private int width;
	private int height;
	private double area;
		
	/**
	 * 삼각형의 너비를 구하는 메소드(오버라이딩)
	 */
	public void getArea(){
		this.width = getRandomNum();
		this.height = getRandomNum();
		
		this.area = width * height * 0.5; 
		
		System.out.println("가로 " + width +", 세로 " + height + "의 삼각형 면적은 " + area +"입니다.");
	}
	
}
