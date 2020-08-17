package kr.ac.kopo.day09;

public class Circle extends ShapeOrigin {

	// 원주율의 값을 3.14 상수로 고정해 제공
	private final static double PIE = 3.14;

	@Override
	public double getArea(int side, int height) {
		return side * side * PIE;
	}

}
