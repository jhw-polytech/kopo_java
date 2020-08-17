package kr.ac.kopo.assignment.day09;

public class Triangle extends Shape {
	
	private int height;
	
	public Triangle() {
		
	}
	
	//밑변, 높이 초기화하는 생성자
	public Triangle(int length, int height) {
		super(length);
		this.height = height;
	}
	
	//넓이 area 구하는 메소드
	@Override
	public void calculateArea() {
		setArea(super.getLength() * this.height * 0.5);
	}
	
	@Override
	public void printArea() {
		System.out.printf("밑변 %d, 높이 %d의 삼각형 면적은 %.1f입니다.\n", super.getLength(), this.height, super.getArea());
		
	}

}
