package jaeheehomework;

import java.util.Random;

public class Rec extends Square {
	
	//필드
	private int var2;
	
	
	//getter
	public int getVar2() {
		return var2;
	}

	
	//생성자. square의 var1의 초기값을 설정함과 동시에 var2도 설정하기 위함
	Rec(){
		super();
		Random r2 = new Random();
		var2 = r2.nextInt(9) + 2;
	}
	
	
	//area오버라이딩. 직사각형 넓이
	public void area() {
		System.out.printf("두 변이 각각 %d와 %d인 직사각형의 넓이는 %d입니다.\n", getVar1(), getVar2(), getVar1()*getVar2());
	}
}
