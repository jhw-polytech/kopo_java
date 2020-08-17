package kr.ac.kopo.day10.project.shapeCalculator;

public class Circle extends Shape{
	int radius;
	final static double PI = Math.PI; // 상수
	 
	public Circle() {
		
	}
	
	Circle(int radius) {
		setRadius(radius);
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
		area = Math.pow(radius, 2) * PI;
		setArea(area);
		print();
	}
	
	@Override
	public void print() {
		System.out.printf("반지름 %d의 원의 면적은 %.2f입니다.\n", radius, super.getArea());
	}
}
