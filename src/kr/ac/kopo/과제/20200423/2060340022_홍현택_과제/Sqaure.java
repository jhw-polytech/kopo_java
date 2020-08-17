package kr.co.hana.homework08;

public class Sqaure extends Rectangle {

	public Sqaure(String figure, int width, int height) {
		super(figure, width, height);
	}

	@Override
	public void print() {
		area = (width * width);
		System.out.println("가로 :" + width + "인 " + figure + "의 면적은 " + area);
		Answer ans = new Answer();
		ans.answer();
	}
}
