package kr.ac.jinwoo.day08.homework;

abstract class Polygon implements Figure {

	private int base;
	private int height;
	
	public Polygon() {
		super();
	}

	public Polygon(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public abstract double calcArea();
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}
