package jaeheehomework;

public class Tri extends Rec{
	
	//생성자로 초기값 받아옴
	Tri(){
		super();
	}

	//area 오버로딩
	public void area() {
		System.out.printf("밑변과 높이가 각각 %d와 %d인 삼각형의 넓이는 %.2f입니다.\n", 
				          getVar1(), getVar2(), (double) getVar1() * getVar2() / 2);
	}
}
