package kr.ac.jinwoo.day08.homework;

import java.util.Random;
import java.util.Scanner;

public class FigurePlay {
	
	static final int RECTANGLE = 1, SQUARE = 2, TRIANGLE = 3, CIRCLE = 4;
	
	private Scanner sc = new Scanner(System.in);
	private int cmd;
	private Random r = new Random();
	
	public FigurePlay() {}; 

	private int selectFigure() {
		System.out.print("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형, 4.원) => ");
		return Integer.parseInt(sc.nextLine());
	}
	
	private int randomChoose() {
		return r.nextInt(9) + 2;
	}
	
	private void calcNprint(int cmd) {
		
		if(cmd == RECTANGLE) {
			System.out.println("직사각형 선택");
			System.out.println("Random하게 2 ~ 10 사이의 정수 2개를 추출");
			Rectangle rect = new Rectangle(randomChoose(), randomChoose());
			System.out.printf("가로 %d 세로 %d 의 직사각형의 면적은 %.0f 입니다.\n", rect.getBase(), rect.getHeight(), rect.calcArea());
		}
		else if(cmd == SQUARE) {
			System.out.println("정사각형 선택");
			System.out.println("Random하게 2 ~ 10 사이의 정수를 추출");
			int n = randomChoose();
			Square squr = new Square(n, n);
			System.out.printf("가로 %d 세로 %d 의 정사각형의 면적은 %.0f 입니다.\n", squr.getBase(), squr.getHeight(), squr.calcArea());
		}
		else if(cmd == TRIANGLE) {
			System.out.println("삼각형 선택");
			System.out.println("Random하게 2 ~ 10 사이의 정수 2개를 추출");			
			Triangle tri = new Triangle(randomChoose(), randomChoose());
			System.out.printf("밑변 %d 높이 %d 의 삼각형의 면적은 %.0f 입니다.\n", tri.getBase(), tri.getHeight(), tri.calcArea());
		}
		else if(cmd == CIRCLE) {
			System.out.println("원 선택");
			System.out.println("Random하게 2 ~ 10 사이의 정수를 추출");
			Circle cir = new Circle(randomChoose());
			System.out.printf("반지름 %d 의 원의 면적은 %.2f 입니다.\n", cir.getR(), cir.calcArea());
		}
		System.out.println();
	}
	
	public void play() {
		
		while(true) {
			cmd = selectFigure();
			System.out.println();
			calcNprint(cmd);
		}	
	}	
}