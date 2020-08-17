package kr.ac.kopo.day09.homework;

public abstract class Shape {
	
	private double area;
	
	public abstract double getArea();
	public void setArea(double area) {
		this.area = area;
	}
	public abstract void print();

}
