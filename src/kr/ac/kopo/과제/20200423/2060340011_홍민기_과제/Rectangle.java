package kr.ac.kopo.day09.homework;

public class Rectangle extends Shape {
	
	private int height;
	private int width;

	public Rectangle() {
		
	}
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	@Override
	public double getArea() {
	
		return this.height * this.width;
	}
	
	@Override
	public void print() {
		
		System.out.println("직사각형 가로 "+this.width+", 세로 "+this.height+"의 넓이는 "+getArea()+"입니다.");
	}

}
