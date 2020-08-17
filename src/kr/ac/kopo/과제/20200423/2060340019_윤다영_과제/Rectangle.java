package kr.ac.kopo.assignment.day09;

public class Rectangle extends Shape {
	
	private int length2; //세로 길이
	
	public Rectangle() {
		
	}
	
	public Rectangle(int length) {
		super(length);
	}
	
	//가로, 세로 길이 초기화하는 생성자
	public Rectangle(int length, int length2) {
		super(length);
		this.length2 = length2;
	}
	
	//넓이 area 계산하는 메소드
	@Override
	public void calculateArea() {
		
		setArea((double)super.getLength() * this.length2);		
	}
	
	//넓이 area를 프린트하는 메소드
	@Override
	public void printArea() {
		System.out.printf("가로 %d, 세로 %d의 직사각형 면적은 %.1f입니다.\n", super.getLength(), this.length2, super.getArea());
		
	}
	
//	교수님! print 메소드는 따로 Print클래스를 만드는 것이 맞는건지 궁금합니다! 개인적으로 print가 도형 클래스의 속성과는 맞지 않는다고 생각해서 헷갈리네요ㅜ
/*
	=> 답변
	면적을 출력하는 메소드이므로 Print클래스보다는 Figure쪽에 있는게 더 좋을 수 있죠.
	그리고 Figure에서 출력하는 기능을 통일하고 싶다면 나중에 interface를 이용해서 상속받도록 구성할 수 있습니다
*/
	
	
	
	

}
