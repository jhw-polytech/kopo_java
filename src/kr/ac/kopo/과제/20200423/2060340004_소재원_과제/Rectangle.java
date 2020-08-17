package exam0423;

public class Rectangle extends Figure {

	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void printArea() {
		System.out.printf("가로가 %d, 높이가 %d인 직사각형의 넓이 : %d", width, height, width * height);
	}

}
