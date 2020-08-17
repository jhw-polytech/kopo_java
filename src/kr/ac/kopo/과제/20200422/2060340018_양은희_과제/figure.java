package Homework0422;

import java.util.Random;
import java.util.Scanner;

public class figure {	// 넓이를 구할 도형을 선택하는 클래스

	public void question() {
		System.out.println("선택할 도형의 번호를 입력하세요.(1. 직사각형, 2. 정사각형, 3. 삼각형, 4. 원)");
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		if (q == 1) {
			rectangle();
		}
		if (q == 2) {
			square();
		}
		if (q == 3) {
			triangle();
		}
		if (q == 4) {
			circle();
		}
	}

	public void rectangle() {	// 직사각형
		Random random = new Random();

		int n1 = random.nextInt(9) + 2;
		int n2 = random.nextInt(9) + 2;
		System.out.println("2~10 사이 랜덤으로 선택한 두 수 : " + n1 + ", " + n2);
		System.out.print("가로 : " + n1 + ", 세로 : " + n2 + "의 직사각형 면적은 " + n1 * n2 + "입니다");
	}

	public void square() {	// 정사각형
		Random random = new Random();

		int n1 = random.nextInt(9) + 2;
		System.out.println("2~10 사이 랜덤으로 선택한 수 : " + n1);
		System.out.print("가로 : " + n1 + "의 정사각형 면적은 " + n1 * n1 + "입니다");
	}

	public void triangle() {	// 삼각형
		Random random = new Random();

		int n1 = random.nextInt(9) + 2;
		int n2 = random.nextInt(9) + 2;
		System.out.println("2~10 사이 랜덤으로 선택한 두 수 : " + n1 + ", " + n2);
		System.out.print("밑변 : " + n1 + ", 높이 : " + n2 + "의 삼각형 면적은 " + n1 * n2 / 2 + "입니다");
	}

	public void circle() {	// 원
		Random random = new Random();
		final double PI = 3.1415;
		int n1 = random.nextInt(9) + 2;
		System.out.println("2~10 사이 랜덤으로 선택한 두 수 : " + n1);
		System.out.print("반지름 : " + n1 + "의 원의 면적은 " + PI * n1 * n1 + "입니다");
	}
}
