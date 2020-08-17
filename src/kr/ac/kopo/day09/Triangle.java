package kr.ac.kopo.day09;

public class Triangle extends ShapeOrigin {

	@Override
	public double getArea(int side, int height) {
		return side * height / 2;
	}

}
