package kr.co.hana.homework08;

public class Circle extends Shape {

	public Circle(String figure, int width, int height) {
		super(figure, width, height);
	}

	@Override
	public void print() {
		area = (width * width * 3.141592);
		System.out.println("반지름 :" + width + "인 " + figure + "의 면적은 " + area);
		Answer ans = new Answer();
		ans.answer();
	}
}
