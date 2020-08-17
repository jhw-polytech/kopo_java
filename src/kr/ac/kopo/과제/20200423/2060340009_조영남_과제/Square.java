package kr.ac.yeongnam.day09.homework;

/*
	영남씨 Square가 Rectangle 클래스를 상속받지 않는 특별한 이유가 있나요??????
	굳이 필요없을거 같아서요?????
*/

public class Square extends Figure {
	private int width;
	private int area;
		

	/**
	 * 정사각형의 너비를 구하는 메소드(오버라이딩)
	 */
	public void getArea(){
		this.width = getRandomNum();
		
		this.area = width * width; 
		
		System.out.println("가로 " + width + "의 정사각형 면적은 " + area +"입니다.");
	}
	
}
