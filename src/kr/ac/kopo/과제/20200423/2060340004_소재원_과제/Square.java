package exam0423;

public class Square extends Figure {

	private int side;
	
	Square (int side) {
		this.side = side;
	}
	@Override
	public void printArea() {
		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이 : %d", side, side * side);
	}

}
