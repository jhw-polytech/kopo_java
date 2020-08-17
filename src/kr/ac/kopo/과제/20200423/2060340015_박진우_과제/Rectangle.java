package kr.ac.jinwoo.day09.homework;

public class Rectangle extends Polygon {
	
	public Rectangle(){}
	
	public Rectangle(int base, int height) {
		super(base, height);
	}

	@Override
	public double calcArea() {
		return (double)getBase() * getHeight();
	}
}
