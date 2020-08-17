package kr.ac.kopo.day09.homework;

public class Triangle extends Shape {
	
	private int height;
	private int width;

	public Triangle() {
		
	}
	
	public Triangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double getArea() {
	
		return this.height * this.width * 0.5;
	}
	
	@Override
	public void print() {
		
		System.out.println("삼각형 밑변 "+this.width+", 높이 "+this.height+"의 넓이는 "+getArea()+"입니다.");
	}

}
