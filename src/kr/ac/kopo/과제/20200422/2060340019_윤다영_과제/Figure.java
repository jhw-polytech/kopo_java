package kr.ac.kopo.assignment.day08;

public class Figure {
	
	//변과 넓이를 가지고 있는 도형
	private int length;
	private double area;
	
	//기본 생성자
	Figure(){
		
	}
	
	//length 받는 생성자
	Figure(int length){
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	
	

}
