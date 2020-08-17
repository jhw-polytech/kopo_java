package exam0423;

public class Circle extends Figure{
	
	final double PI = 3.1415926535; 
	private int radius;
	
	Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void printArea() {
		System.out.printf("한 변의 길이가 %d인 원의 넓이 : %.2f", radius, Math.pow(radius, 2) * PI);
	}

}
