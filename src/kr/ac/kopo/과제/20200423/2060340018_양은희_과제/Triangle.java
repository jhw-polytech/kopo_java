package Homework0423;

import java.util.Random;

public class Triangle extends Figure {
	private int width;
	private int height;

	public Triangle() {
		print();
	}

	@Override
	public void print() {
		Random random = new Random();

		width = random.nextInt(9) + 2;
		height = random.nextInt(9) + 2;
		System.out.println("2~10 사이 랜덤으로 선택한 두 수 : " + width + ", " + height);
		System.out.print("밑변 : " + width + ", 높이 : " + height + "의 삼각형 면적은 " + width * height / 2 + "입니다");
	}

}
