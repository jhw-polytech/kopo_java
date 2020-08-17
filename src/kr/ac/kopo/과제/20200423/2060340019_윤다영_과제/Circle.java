package kr.ac.kopo.assignment.day09;

public class Circle extends Shape {
	
	private double PI = 3.14;
	
	public Circle() {
		
	}
	
	public Circle(int length) {
		super(length);
	}

	@Override
	public void calculateArea() {
		setArea(getLength() * getLength() * PI);
	}
	
	@Override
	public void printArea() {
		System.out.printf("반지름 %d의 원의 면적은 %.1f입니다.\n", super.getLength(), super.getArea());
		
	}

}
