package jaeheehomework;

import java.util.Random;

public class Square {
	
	//필드
	private int var1;

	
	//생성자
	Square(){
		Random r = new Random();
		var1 = r.nextInt(9) + 2; 
	}
	
	
	//getter
	public int getVar1() {
		return var1;
	}
	
	
	//정사각형 면적
	public void area() {
		System.out.printf("한 변이 %d인 정사각형의 넓이는 %d입니다.\n", var1, var1*var1);
	}

}
