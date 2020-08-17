package kr.co.hana.homework08;

import java.util.Scanner;

public class Input {
	Scanner sc = new Scanner(System.in);

	
	public void getInput() {
		System.out.printf("도형을 선택하세요. (1.정사각형 2.직사각형 3.삼각형 4.원형) => ");
		int getNum = sc.nextInt();
		sc.nextLine();

		int setNum = (int) (Math.random() * 10) + 2;

		if (getNum == 1) {
			Rectangle rec = new Rectangle("직사각형", setNum, setNum);
			rec.print();
		}
		if (getNum == 2) {
			Sqaure sqr = new Sqaure("정사각형", setNum, setNum);
			sqr.print();
		}
		if (getNum == 3) {
			Triangle tri = new Triangle("삼각형", setNum, setNum);
			tri.print();
		}
		if (getNum == 4) {
			Circle cir = new Circle("원형", setNum, setNum);
			cir.print();
		}
	}

}
