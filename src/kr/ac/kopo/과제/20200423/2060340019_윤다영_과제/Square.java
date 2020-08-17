package kr.ac.kopo.assignment.day09;

public class Square extends Rectangle {
	
//	교수님!! Square 클래스가 Rectangle 클래스의 자식 클래스인데, Rectangle에게는 가로(length) 세로(length2)가 있지만, Square에게는 가로(length) 하나만 필요합니다!
//	이 경우 상식적으로는 정사각형이 직사각형이라는 포함관계가 성립하는데, 클래스의 측면에서 보면 오히려 square가 rectangle의 부모라고 보여서, 객체 설계가 잘못된 건지 궁금합니다.
//	rectangle이 아닌 shape를 부모클래스로 두는게 더 맞는걸까.. 많이 고민하다가 rectangle로 결정했습니다!ㅜ 어렵네요..
/*
	Rectangle클래스는 상속받는 방법이 맞습니다.
	그래야 Rectangle은 Shape를 상속받고 Square는 Rectangle을 상속받으니 Shape의 멤버변수, 메소드 및 Rectangle의 멤버변수, 메소드를 다 사용할 수 있게 됩니다
*/

	public Square() {
		
	}
	
//	length를 하나만 받는 생성자를 만들기 위해, 사실 rectangle 클래스에는 필요없는 Rectangle(int length) 생성자를 만들게 되었습니다.
//	혹시 부모 클래스의 부모 클래스를 받는 방법은 없는건가요??
/*
	 super(length, length); 를 호출하면 될거 같은데요. 굳이 생성자를 더 만드실필요 없어요~~~
*/
	public Square(int length) {
		super(length);		
	}
	
	@Override
	public void calculateArea() {
		setArea((double)super.getLength() * super.getLength());
	}
	
	@Override
	public void printArea() {
		System.out.printf("가로 %d의 정사각형 면적은 %.1f입니다.\n", super.getLength(), super.getArea());
		
	}
}
