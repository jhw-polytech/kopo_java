package Homework0423;

import java.util.Random;

public class Rectangle extends Figure {
	private int width;
	private int height;

	public Rectangle() {
		print();
	}

	@Override
	public void print() {
		Random random = new Random();

		width = random.nextInt(9) + 2;
		height = random.nextInt(9) + 2;

		System.out.println("2~10 사이 랜덤으로 선택한 두 수 : " + width + ", " + height);
		System.out.print("가로 : " + width + ", 세로 : " + height + "의 직사각형 면적은 " + width * height + "입니다");
		System.out.println("");
	}

}
