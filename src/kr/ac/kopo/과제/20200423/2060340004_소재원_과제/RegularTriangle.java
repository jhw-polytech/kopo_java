package exam0423;

public class RegularTriangle extends Figure {

	private int side;
	
	RegularTriangle(int side) {
		this.side = side;
	}
	@Override
	public void printArea() {
		System.out.printf("한 변의 길이가 %d인 정삼각형의 넓이 : %.2f", side, ((Math.sqrt(3) * Math.pow(side, 2)) / 4.0));
	}

}
