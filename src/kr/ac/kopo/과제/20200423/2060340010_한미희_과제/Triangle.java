package kr.ac.kopo.day9.assignment;

public class Triangle extends Figure {

	//멤버변수
	private int width;
	private int height;
	
	
	//getter
	public int getWidth() {
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	
	@Override
	public void calculateArea(){
		width = r.nextInt(9) + 2;
		height = r.nextInt(9) + 2;
		setArea(width * height / 2.0);
	}
	
}
