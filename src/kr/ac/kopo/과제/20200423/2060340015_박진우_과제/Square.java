package kr.ac.jinwoo.day09.homework;

/*
 * 수업시간에 말씀해주신대로 Square Class는 Rectangle Class를 상속받았습니다.
 */

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
