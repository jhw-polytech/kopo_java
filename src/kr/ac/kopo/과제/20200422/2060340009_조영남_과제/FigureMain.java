package kr.ac.yeongnam.day08.homework;

import java.util.Scanner;

public class FigureMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3. 삼각형, 4. 원) => ");
		int num = Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1:
			Figure.rectangleCal();
			break;
		case 2:
			Figure.squareCal();
			break;
		case 3:
			Figure.triangleCal();
			break;
		case 4:
			Figure.circleCal();
			break;
		}
		
		sc.close();
	}

}
