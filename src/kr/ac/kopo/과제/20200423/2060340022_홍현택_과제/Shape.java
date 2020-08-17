package kr.co.hana.homework08;

public class Shape {

	String figure;
	int width;
	int height;
	double area;

	public Shape() {
	}
	
	public Shape(String figure, int width, int height) {
		this.figure = figure;
		this.width = width;
		this.height = height;
	}
		

	public void print() {
		System.out.println("가로 :" + width + " 세로 : " + height + "인 " + figure + "의 면적은 " + area);
		Answer ans = new Answer();
		ans.answer();
	}
}
