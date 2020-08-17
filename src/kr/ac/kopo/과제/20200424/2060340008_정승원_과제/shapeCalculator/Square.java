package kr.ac.kopo.day10.project.shapeCalculator;

public class Square extends Rectangle{
	
	Square() {
		
	}

	Square(int width) {
		super.setWidth(width);
		area = width*super.getWidth();
		super.setArea(area);
		print();
	}
	
	@Override
	public void print() {
		System.out.printf("가로 %d 세로 %d의 정사각형의 면적은 %.0f입니다.\n", super.getWidth(), super.getHeight(), super.getArea());
	}
}
