package kr.ac.kopo.day9.assignment;

public class Square extends Rectangle {

	@Override
	public void calculateArea() {
		setWidth(r.nextInt(9)+2);
		setArea(getWidth() * getWidth());
	}
	
}
