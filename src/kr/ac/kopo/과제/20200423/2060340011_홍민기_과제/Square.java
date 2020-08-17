package kr.ac.kopo.day09.homework;

public class Square extends Rectangle {
	
	private int width;

	public Square() {
		
	}
	
	public Square(int width) {
		super(width,width);
		this.width = width;
	}
	
	@Override
	public void print() {
		
		System.out.println("정사각형 한변 "+this.width+"의 넓이는 "+getArea()+"입니다.");
	}

}
