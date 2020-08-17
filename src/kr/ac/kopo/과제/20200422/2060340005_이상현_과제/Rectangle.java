package shlee1993.day08.homework;

import java.util.Random;

public class Rectangle extends Square {
	Random rand = new Random();
	private int width2;

	public Rectangle() {	//두개의 변의 길이가 같다면 다시 숫자를 받아옴
		super();
		while (true) {
			this.width2 = rand.nextInt(8) + 2;
			if (getWidth() != width2)	//다를 경우 while문을 빠져나옴
				break;
		}
	}

	public void print() {	//오버라이딩?이 될 것 같습니다
		System.out.println(
				"길이가 " + getWidth() + ", " + width2 + "인 직사각형의 넓이는 " + getWidth() * width2 + "입니다.");
	}

	public int getWidth2() {	//직각삼각형에서도 사용하기 위해,
		//배열로 한번에 받아도 되지만 자식 클래스가 부모의 부모 클래스의 메소드를 불러오는 것을 연습하기 위해  get을 따로 만들었습니다.
		return width2;
	}
}
