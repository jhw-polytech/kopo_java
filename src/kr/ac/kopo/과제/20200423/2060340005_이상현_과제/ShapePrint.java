package shlee1993.day09.homework;

import java.util.Random;

public abstract class ShapePrint {
	private int width;
	private int height;

	public ShapePrint() {
		Random rand = new Random();

		width = rand.nextInt(8) + 2;
		while (true) {	//같은 숫자가 나오는 걸 방지하기 위한 반복문
			height = rand.nextInt(8) + 2;
			if (width != height)	//다를 경우 while문을 빠져나옴
				break;
		}
	}

	public abstract double area();	//원과 삼각형은 소수점이 필요하기 때문에 double형으로 반환

	public abstract void print();

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
