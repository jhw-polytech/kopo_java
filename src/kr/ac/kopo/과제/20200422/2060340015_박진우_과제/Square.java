package kr.ac.jinwoo.day08.homework;

public class Square extends Polygon {
	
	public Square() {}
	
	public Square(int base, int height) {
		super(base, height);
	}

	@Override
	public double calcArea() {
		return (double)getBase() * getHeight();
	}

}
