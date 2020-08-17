package kr.ac.kopo.day8.assignment;

import java.util.Random;
import java.util.Scanner;

public class Area {

	private String[] str = {"직사각형", "정사각형", "삼각형", "원", "종료"};
	Scanner sc;			
	Random r;
	
	//기본 생성자
	public Area() {
		sc = new Scanner(System.in);
		r = new Random();
	}
	
	//직사각형 넓이 계산 메소드
	public int rectangleArea(int a, int b) {
		return a * b;
	}
	
	//정사각형 넓이 계산 메소드
	public int squareArea(int a) {
		return a * a;
	}
	
	//삼각형 넓이 계산 메소드
	public double triangleArea(int a, int h) {
		return a*h/2.0;
	}
	
	//원 넓이 계산 메소드
	public double circleArea(int radius) {
		return 3.14* radius * radius;
	}
	
	//원하는 도형 번호 입력받아 도형 이름으로 반환하는 메소드
	public String figureChoice() {
		System.out.println("도형을 선택하세요 (1.직사각형, 2.정사각형, 3.삼각형, 4.원, 5.종료) => ");
		int num = sc.nextInt();
		sc.nextLine();
		return str[num-1];
	}
	
	//2 ~ 10사이의 정수 추출 메소드
	public int randomNumber() {
		return r.nextInt(9)+2;
	}
	
	//결과 출력 메소드
	public void calculator() {
		String figure = "";				//도형 이름
		while(figure != "종료") {			//종료가 나올 때까지 반복해서 실행한다.
			figure = figureChoice();	//원하는 도형 입력받아 도형 이름 반환
			int a = randomNumber();		//공통으로 사용될 첫번째 난수 생성
			//도형의 종류에 따른 결과값 출력
			if (figure == "직사각형") {
				int b = randomNumber();	//경우에 따라, 두번째 난수 생성
				System.out.println("가로 " + a + ", 세로 " + b 
						+ "의 직사각형 면적은 " + rectangleArea(a, b) + "입니다");
			}else if (figure == "정사각형") {
				System.out.println("가로 " + a 
						+ "의 정사각형 면적은 " + squareArea(a) +"입니다");
			}else if (figure == "삼각형") {
				int h = randomNumber();
				System.out.printf("밑변  %d, 높이 %d의 삼각형 면적은 %.2f입니다\n", 
						a, h, triangleArea(a, h));
			}else if (figure == "원"){
				System.out.printf("반지름 %d의 원 면적은 %.2f입니다\n", 
						a, circleArea(a)); 
			}
		}
	}
	
	
	
	
}
