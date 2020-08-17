package Homework_0409;

import java.util.Scanner;

// 3)반지름이 10인 원의 면적을 구해서 출력하시오.

public class Test3 {

	public static void main(String[] args) {
		
		final double PI = 3.141592; // PI는 상수로 처리하여 수정이 불가능하도록 한다.
		int r = 10; // 반지름의 크기는 10
		
		System.out.println("원의 면적은 "+PI*r*r+" 입니다."); // 원의 면적은 PI*반지름^2
	}

}
