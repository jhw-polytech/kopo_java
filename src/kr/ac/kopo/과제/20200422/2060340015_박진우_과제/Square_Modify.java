package kr.ac.jinwoo.day08.homework;

public class Square extends Rectangle {
	
	public Square() {}
	
	public Square(int base, int height) {
		super(base, height);
	}
	
	public Square(int base) {
		super.setBase(base);
		super.setHeight(base);
	}
}
