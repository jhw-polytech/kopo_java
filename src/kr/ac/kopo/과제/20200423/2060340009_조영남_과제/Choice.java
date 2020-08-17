package kr.ac.yeongnam.day09.homework;

import java.util.Scanner;

/**
 * 컨트롤 클래스
 * @author socra
 *
 */
public class Choice {
	private Scanner sc;
	private int num;
	
	
	// 생성자를 호출할 때, Scanner 객체 생성
	public Choice() {
		sc = new Scanner(System.in);
	}
	
	/**
	 * 컨트롤 클래스를 실행하는 메소드
	 */
	public void execute() {
		int num = setFigure();
				
		// 객체명을 통일하기 위해, 부모클래스 타입으로 참조변수를 선언함.
		Figure f = null;
		if(num == 1) {
			// 객체의 묵시적 형변환이 일어남. 오버라이딩을 해서 자식클래스의 메소드를 사용하도록 설정함.
			f = new Rectangle();

		} else if(num == 2) {			
			f = new Square();	
			
		} else if(num == 3) {
			f = new Triangle();
			
		} else if(num == 4) {
			f = new Circle();
			
		}
		
		// 각 클래스별로 오버라이딩한 getArea 메소드 호출
		f.getArea();		
	}
	
	/**
	 * 도형을 선택받는 메소드
	 * @return
	 */
	public int setFigure() {
		System.out.print("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4. 원) => ");
		this.num = Integer.parseInt(sc.nextLine());
		
		return num;		
	}

}
