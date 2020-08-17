package kr.ac.kopo.day09;

public class Rectangle extends ShapeOrigin {

	@Override
	public double getArea(int side, int height) {

		if (side == height) {
			System.out.print("** 행운의 정사각형 당첨! **");
		}

		return side * height;
	}

}
