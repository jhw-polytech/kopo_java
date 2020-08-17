package kr.ac.kopo.day10.project.shapeCalculator;

abstract class Shape {
	
	double area;
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	abstract public void print();
}
