package kr.ac.kopo.assignment.day09;

public abstract class Shape {
	
	private int length;
	private double area;
	
	//기본생성자
	public Shape() {
		
	}
	
	//length 초기화하는 생성자
	public Shape(int length) {
		this.length = length;
	}
	
	
	
	//넓이 area 구하는 추상 메소드
	public abstract void calculateArea();
	
	//결과값 print 하는 추상 메소드
	public abstract void printArea();
	
	
	
	//area setter
	public void setArea(double area) {
		this.area =  area;
	}
	
	//length getter
	public int getLength() {
		return length;
	}
	
	//area getter
	public double getArea() {
		return area;
	}
	
	
	
	
	
	

}
