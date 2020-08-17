package exam0423;

public class Triangle extends Figure{

	private int width;
	private int height;
	
	Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void printArea() {
		System.out.printf("가로가 %d, 높이가 %d인 삼각형의 넓이 : %.2f", width, height, width * height / 2.0);
	}

}
