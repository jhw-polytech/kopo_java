package kr.ac.kopo.day9.assignment;

public class Rectangle extends Figure {

	//멤버변수
	private int width;
	private int height;
	
	
	//getter
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	
	//setter
	public void setWidth(int width) {
		this.width = width;
	}
	
//	public void setHeight(int height) {
//		this.height = height;
//	}
//	설계 당시 상속관계에 있는 Square클래스를 위해 두 멤버변수에 대해 setter를 구상했는데,
//	정사각형의 면적을 구하기 위해선 한변의 길이만 설정하면 되므로 주석처리하였습니다.
	
	
	@Override
	public void calculateArea(){
		width = r.nextInt(9) + 2;
		height = r.nextInt(9) + 2;
		setArea(width * height);
	}
}
