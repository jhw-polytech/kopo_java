package kr.ac.kopo.day08;

import java.util.Random;
import java.util.Scanner;

/*
 * 두 수를 추출해 도형의 넓이를 구하는 클래스
*/

public class ShapesFactory {

	Scanner sc = new Scanner(System.in);
	private final double PIE = 3.14;
	private int num1;
	private int num2;
	Random random = new Random();
	
	
	// 도형의 넓이를 알려주는 메소드
	public void speaker() {
		num1 = random.nextInt(9)+1;
		num2 = random.nextInt(9)+1;

		System.out.println("숫자가 정해졌습니다. ==>"+num1+", "+num2);
		System.out.println("만들고 싶은 도형의 번호를 말해보세요!");
		System.out.println("1) 정사각형  2) 직사각형  3) 삼각형  4) 원");
		int choice = sc.nextInt();
		sc.nextLine();
		
		
		switch(choice) {
		case 1:
			System.out.println("이번 정사각형의 넓이는 "+square(num1)+"입니다~");
			break;
		case 2:
			if(num1==num2) {
				System.out.println("행운의 정사각형이 당첨되었습니다!! 정사각형도 직사각형의 일종이랍니다*^^*");
			}
			System.out.println("이번 직사각형의 넓이는 "+rectangle(num1, num2)+"입니다~");
			break;
		case 3:
			System.out.println("이번 삼각형의 넓이는 "+triangle(num1, num2)+"입니다~");
			break;
		case 4:
			System.out.println("이번 원의 넓이는 "+round(num1)+"입니다~");
			break;
		}		
		
		sc.close();
	}

	
	
	// 각 도형의 넓이를 반환하는 메소드
	public int square(int num1) {
		return num1 * num1;
	}

	public int rectangle(int num1, int num2) {
		return num1 * num2;
	}

	public double triangle(int num1, int num2) {
		return num1 * num2 / 2;
	}

	public double round(int num1) {
		return num1 * num2 * PIE;
	}

}
