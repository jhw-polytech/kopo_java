package Homework0423;

import java.util.Scanner;

public class FigureChoice {
	
	Figure f;
	
	public void choice() {
	System.out.println("선택할 도형의 번호를 입력하세요.(1. 직사각형, 2. 정사각형, 3. 삼각형, 4. 원)");
	Scanner sc = new Scanner(System.in);
	int q = sc.nextInt();
	if (q == 1) {
		f = new Rectangle();
	}
	if (q == 2) {
		f = new Square();
	}
	if (q == 3) {
		f = new Triangle();
	}
	if (q == 4) {
		f = new Circle();
	}

	}
}
