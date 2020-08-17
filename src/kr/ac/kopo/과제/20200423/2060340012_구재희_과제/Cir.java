package jaeheehomework;

public class Cir extends Square{
	
	//생성자. 부모클래스 var1으로 초기값을 설정? 
	Cir(){
		super();
	}
	
	//area 오버라이딩. 같은 메소드를 쓰되, 결과물이 다르도록 함
	public void area() {
		System.out.printf("반지름이 %d인 원의 넓이는 %.2f입니다.\n", getVar1(), Math.PI*getVar1()*getVar1());
	}

}
