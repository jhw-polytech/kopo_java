package kr.ac.kopo.day09;

import java.util.Random;
import java.util.Scanner;

/*
 * 도형의 넓이를 구하는 기능 클래스
*/

public class ShapeFactory {

	private Random r;
	private Scanner sc;
	private ShapeOrigin shape;
	private double area;
	private String shapeName;

	public ShapeFactory() {
		sc = new Scanner(System.in);
		r = new Random();
	}

	// 각 도형 객체를 받아와 넓이를 구해주는 메소드
	public void execution() {

		System.out.println("어떤 도형을 고르시겠습니까?");
		System.out.println("===> 1)정사각형 2)직사각형 3)삼각형 4)원");
		int choice = sc.nextInt();
		sc.nextLine();

		// 선택지에 따라
		switch (choice) {
		case 1:
			shape = new Square();
			shapeName = "정사각형";
			break;
		case 2:
			shape = new Rectangle();
			shapeName = "직사각형";
			break;
		case 3:
			shape = new Triangle();
			shapeName = "삼각형";
			break;
		case 4:
			shape = new Circle();
			shapeName = "원";
			break;
		}
		
		area = shape.getArea(r.nextInt(9)+1, r.nextInt(9)+1);

		System.out.println(shapeName + "을 고르셨습니다.");
		System.out.println(shapeName + "의 넓이는: " + area);

	}

}
