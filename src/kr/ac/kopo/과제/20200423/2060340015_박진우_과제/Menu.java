package kr.ac.jinwoo.day09.homework;

import java.util.Random;
import java.util.Scanner;

/*
 * 이번에는 수업시간에 배운 형변환과 다형성을  적용해보았습니다.
   ==>
   진우씨 잘하고 있습니다~~ ^^
   객체지향스럽게 작성하는 것은 어느순간 짜잔하고 머리속에 들어오게 될거에요~~
   잘하고 계시니 계속 꾸준히 열심히 해주실거죠??? ^^
 */

public class Menu {
	
	static final int RECTANGLE = 1, SQUARE = 2, TRIANGLE = 3, CIRCLE = 4;
	
	private Scanner sc = new Scanner(System.in);
	private int cmd;
	private Random r = new Random();
	
	public Menu() {}; 

	private int selectFigure() {
		System.out.print("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형, 4.원) => ");
		return Integer.parseInt(sc.nextLine());
	}
	
	private int randomChoose() {
		return r.nextInt(9) + 2;
	}
	
	private void calcNprint(int cmd) {
		
		if(cmd == CIRCLE) {
			System.out.println("원 선택");
			System.out.println("Random하게 2 ~ 10 사이의 정수를 추출");
			Circle cir = new Circle(randomChoose());
			System.out.printf("반지름 %d 의 원의 면적은 %.2f 입니다.\n", cir.getR(), cir.calcArea());
		} else {
			
			Polygon poly;
			
			if(cmd == RECTANGLE) {
				System.out.println("직사각형 선택");
				System.out.println("Random하게 2 ~ 10 사이의 정수 2개를 추출");
				poly = new Rectangle(randomChoose(), randomChoose());
				System.out.printf("가로 %d 세로 %d 의 직사각형의 면적은 %.0f 입니다.\n", poly.getBase(), poly.getHeight(), poly.calcArea());
			}
			else if(cmd == SQUARE) {
				System.out.println("정사각형 선택");
				System.out.println("Random하게 2 ~ 10 사이의 정수를 추출");
				int n = randomChoose();
				poly = new Square(n);
				System.out.printf("가로 %d 세로 %d 의 정사각형의 면적은 %.0f 입니다.\n", poly.getBase(), poly.getHeight(), poly.calcArea());
			}
			else if(cmd == TRIANGLE) {
				System.out.println("삼각형 선택");
				System.out.println("Random하게 2 ~ 10 사이의 정수 2개를 추출");
				poly = new Triangle(randomChoose(), randomChoose());
				System.out.printf("밑변 %d 높이 %d 의 삼각형의 면적은 %.0f 입니다.\n", poly.getBase(), poly.getHeight(), poly.calcArea());
			}
		}
		System.out.println();
	}
	
	public void execute() {
		
		while(true) {
			cmd = selectFigure();
			System.out.println();
			calcNprint(cmd);
		}
	}
}
