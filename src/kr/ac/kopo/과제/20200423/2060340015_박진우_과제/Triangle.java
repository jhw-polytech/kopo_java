package kr.ac.jinwoo.day09.homework;

public class Triangle extends Polygon {

	public Triangle() {}

	public Triangle(int base, int height) {
		super(base, height);
	}

	@Override
	public double calcArea() {
		return (double)(getBase() * getHeight())/2;
	}
}
