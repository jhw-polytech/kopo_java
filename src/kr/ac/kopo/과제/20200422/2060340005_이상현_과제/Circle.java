package shlee1993.day08.homework;

public class Circle extends Square{	//원과 정사각형의 관계가 적으나 하나의 값만 가져오면 되는 점을 이용하려고 상속받았습니다.
	public void print() {
		System.out.println("PIE가 3.14일 때, 반지름이 " + getWidth() + "인 원의 넓이는 " + getWidth() * getWidth() * 3.14 + "입니다.");
	}

}
