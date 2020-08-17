package shlee1993.day08.homework;

public class Triangle extends Rectangle{	//넓이를 1/2을 하기위해 상속받았습니다.
	public void print() {	//오버라이딩?이 될 것 같습니다
		System.out.println(
				"높이가 " + getWidth() + ", 밑변이" + getWidth2() + "인 직각삼각형의 넓이는 " + (double)getWidth() * getWidth2() * 1/2 + "입니다.");
	}
}