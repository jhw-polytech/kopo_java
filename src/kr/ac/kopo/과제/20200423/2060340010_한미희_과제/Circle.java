package kr.ac.kopo.day9.assignment;

public class Circle extends Figure {
	
	//멤버변수
	private int radius;
	
	//getter 
	public int getRadius() {
		return radius;
	}
	
	@Override
	public void calculateArea() {
		radius = r.nextInt(9) + 2;
		setArea(3.14 * radius * radius);
	}
	
}
