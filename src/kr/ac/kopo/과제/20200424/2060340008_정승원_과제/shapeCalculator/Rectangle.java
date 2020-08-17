package kr.ac.kopo.day10.project.shapeCalculator;

public class Rectangle extends PlaneShape{
	
	Rectangle(){
		
	}
	
	Rectangle(int width) {
		super.setWidth(width);	
		super.setHeight(width);
	}
	
	Rectangle(int width, int height) {
		super.setWidth(width);
		super.setHeight(height);
		area = width*height;
		super.setArea(area);
		print();
	}
	
	@Override
	public void print() {
    	System.out.printf("가로 %d 세로 %d의 직사각형의 면적은 %.0f입니다.\n", super.getWidth(), super.getHeight(), super.getArea());
	}
	
}
