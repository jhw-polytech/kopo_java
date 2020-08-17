package kr.ac.kopo.day09;

/*
	도형 클래스들이 상속받을 추상 클래스
*/

public abstract class ShapeOrigin {

	private int side;
	private int height;

	// 생성자
	public ShapeOrigin() { }

	public ShapeOrigin(int side, int height) {
		this.side = side;
		this.height = height;
	}

	
	// random 정수를 전달받아 double 값을 반환하는 메소드
	public abstract double getArea(int side, int height);

	
	// getter
	public int getSide() {
		return side;
	}

	public int getHeight() {
		return height;
	}

	// setter
	public void setSide(int side) {
		this.side = side;
	}

	public void setHeight(int height) {
		this.height = height;
	}


}
