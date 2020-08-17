package kr.co.hana.homework07;

import java.util.Scanner;

public class figure {
	Scanner sc = new Scanner(System.in);

	private String rec = "직사각형";
	private String sqr = "정사각형";
	private String tri = "삼각형";
	private String cir = "원형";

	void open() {
		System.out.printf("도형을 선택하세요. (1.%s  2.%s  3.%s  4.%s) : ", rec, sqr, tri, cir);
		int getFigure = sc.nextInt();
		sc.nextLine();

		calculate(getFigure);
	}

	public void calculate(int getFigure) {
		int i = (int) (Math.random() * 10) + 2;
		int j = (int) (Math.random() * 10) + 2;
		double result;

		if (getFigure == 1) {
			result = i * j;
			System.out.printf("가로 %d, 세로 %d의 %s의 면적은 %d 입니다.", i, j, rec, i * j);
		}
		if (getFigure == 2) {
			result = i * i;
			System.out.printf("가로 %d인 %s의 면은 %d 입니다.", i, sqr, i * i);
		}
		if (getFigure == 3) {
			result = i * i * 0.5;
			System.out.printf("가로 %d, 높이 %d의 %s 면적은 %.2f 입니다.", i, j, tri, i * j * 0.5);
		}
		if (getFigure == 4) {
			result = i * i * 3.14;
			System.out.printf("반지름 %d의 %s의 면적은 %.2f 입니다.", i, cir, i * i * 3.14);
		}
		if (getFigure > 4 || getFigure < 1) {
			System.out.println("보기에 있는 숫자를 입력하세요");
		}
		System.out.println();
		loop();
	}
	
	void loop() {
		System.out.println("계속 진행할까요? (y/n)");
		String ans = sc.nextLine();
		if(ans.equalsIgnoreCase("y")) {
			open(); 
		} else {
			close();
		}
		}
	
	void close() {
		System.out.println("종료");
	}
	
}
