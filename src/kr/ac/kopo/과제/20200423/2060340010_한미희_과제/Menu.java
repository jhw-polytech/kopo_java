package kr.ac.kopo.day9.assignment;

import java.util.Scanner;

public class Menu {
	//제어 클래스
	
	//사용자로부터 도형을 입력받고 그에 맞는 결과를 출력하는 실행 메소드
	public void execute() {
		Scanner sc = new Scanner(System.in);		
		int type = 1;		//while문을 실행할 수 있도록 조건문을 만족하는 값으로 초기화
		//1, 2, 3, 4 중 하나를 입력받으면 그에 해당하는 도형의 면적 출력
		while((type == 1) | (type == 2) | (type == 3) | (type == 4)) {
			System.out.print("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => ");		
			type = sc.nextInt();
			sc.nextLine();
			print(type);
			System.out.println();	
			System.out.println();
		}
		//1, 2, 3, 4가 아닌 다른 수를 입력하면 반복문을 종료하고 입력 그만받기
		sc.close();
	}
	
	//도형의 종류에 맞게 결과를 출력하는 메소드
	public void print(int type) {	
		//직사각형
		if (type == 1) {
			Rectangle rect = new Rectangle();	//type에 맞는 도형 객체 생성
			rect.calculateArea();			//도형 면적 계산하는 메소드 호출
			System.out.printf("가로 %d, 세로 %d의 직사각형 면적은 %.2f입니다"
					, rect.getWidth(), rect.getHeight(), rect.getArea());
		//정사각형
		}else if (type == 2) {
			Square sq = new Square();
			sq.calculateArea();
			System.out.printf("가로 %d의 정사각형 면적은 %.2f입니다"
					, sq.getWidth(), sq.getArea());			
		//삼각형
		}else if (type == 3) {
			Triangle tri = new Triangle();
			tri.calculateArea();
			System.out.printf("밑변 %d, 높이 %d의 삼각형 면적은 %.2f입니다"
					, tri.getWidth(), tri.getHeight(), tri.getArea());	
		//원
		}else if (type == 4) {
			Circle c = new Circle();
			c.calculateArea();
			System.out.printf("반지름 %d의 원 면적은 %.2f입니다"
					, c.getRadius(), c.getArea());
		}
	}

	
	
	
	
}
