package Homework0423;

import java.util.Random;

public class Circle extends Figure {
	private int r;

	public Circle() {
		print();
	}

	@Override
	public void print() {
		Random random = new Random();
		final double PI = 3.1415;
		r = random.nextInt(9) + 2;
		System.out.println("2~10 사이 랜덤으로 선택한 수 : " + r);
		System.out.print("반지름 : " + r + "의 원의 면적은 " + PI * r * r + "입니다");
	}

}
