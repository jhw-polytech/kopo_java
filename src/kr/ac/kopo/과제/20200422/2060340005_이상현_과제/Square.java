package shlee1993.day08.homework;

import java.util.Random;

public class Square {
	Random rand = new Random();
	private int width;

	public Square() {
		super();
		this.width = rand.nextInt(8) + 2;
	}

	public void print() {
		System.out.println("길이가 " + width + "인 정사각형의 넓이는 " + width * width + "입니다.");
	}

	public int getWidth() {	//직사각형, 원에서도 사용하기 위해
		return width;
	}

}
