package shlee1993.day09.homework;

public class Circle extends ShapePrint {
	private int width;	//멤버변수를 생성하지 않고 바로 get으로 가져와 메소드에 대입할 수도 있지만, 메소드 내부가 길어져 사용했습니다.

	public Circle() {
		this.width = getWidth();	
	}

	@Override
	public double area() {
		return width * width * 3.14;
	}

	@Override
	public void print() {
		System.out.println("반지름이 " + width + "인 원의 넓이는 " + area() + "입니다.");
	}

}
