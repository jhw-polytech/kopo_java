package shlee1993.day09.homework;

public class Rectangle extends ShapePrint {
	private int width;	//멤버변수를 생성하지 않고 바로 get으로 가져와 메소드에 대입할 수도 있지만, 메소드 내부가 길어져 사용했습니다.
	private int height;

	public Rectangle() {
		this.width = getWidth();
		this.height = getHeight();
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public void print() {
		System.out.println("길이가 " + width + ", " + height + "인 직사각형의 넓이는 " + (int) area() + "입니다.");
	}

}
