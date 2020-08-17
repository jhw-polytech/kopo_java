package kr.ac.jinwoo.day09.homework;

public class Circle implements Shape {

	private int r;

	public Circle() {}
	
	public Circle(int r) {
		this.r = r;
	}

	public int getR() { return r; }
	public void setR(int r) { this.r = r; }
	
	@Override
	public double calcArea() {
		return (double)r * r * Math.PI;
	}
}
