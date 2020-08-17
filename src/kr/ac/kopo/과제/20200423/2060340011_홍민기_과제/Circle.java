package kr.ac.kopo.day09.homework;

public class Circle extends Shape {
	
	private int radius;

	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
	
		return this.radius*this.radius*Math.PI;
	}
	
	@Override
	public void print() {
		
		System.out.println("원 반지름 "+this.radius+"의 넓이는 "+getArea()+"입니다.");
	}

}
