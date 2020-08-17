package kr.co.hana.homework08;

public class Rectangle extends Shape {

	public Rectangle(String figure, int width, int height) {
		super(figure, width, height);
	}

	@Override
	public void print() {
		area = (width * height);
		super.print();
	}

}
