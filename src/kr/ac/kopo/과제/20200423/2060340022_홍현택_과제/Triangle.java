package kr.co.hana.homework08;

public class Triangle extends Shape{
	
	public Triangle(String figure, int width, int height) {
		super(figure, width, height);
		}
	
	@Override
	public void print() {
		area = (width*height*0.5);
		super.print();
	}
}