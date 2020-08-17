package kr.ac.kopo.day10.project.shapeCalculator;

public class Triangle extends PlaneShape{
	
	Triangle() {

	}
	
	Triangle(int width, int height) {
		super.setWidth(width);
		super.setHeight(height);
		area = (width*height)/2;
		super.setArea(area);
		print();
	}
	
	@Override
	public void print() {
		System.out.printf("밑변 %d 높이 %d의 삼각형의 면적은 %.0f입니다.\n", super.getWidth(), super.getHeight(), super.getArea());
	}
}
