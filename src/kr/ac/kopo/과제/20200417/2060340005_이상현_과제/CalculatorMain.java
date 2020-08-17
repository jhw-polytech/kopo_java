package shlee1993.day06.homework;

import java.util.Scanner;

/*
8. 사칙연산을 수행하는 Calculator 클래스 작성
ex)	정수 : 12
	정수 : 5
	12 + 5 = 17
	12 - 5 = 7
	12 * 5 = 60
	12 / 5 = 2.4
	12 소수체크 : false
	5 소수체크 : true
*/

//정수 두개를 입력받고, 인스턴스 객체 cal를 만들어 cal내부에 출력을 해주는 메소드를 생성하도록 제작
//(Calculator내부 메소드의 반환값을 int로 주어 값을 return 하고 main 클래스에서 값을 출력하는 방법도 해봤습니다)

public class CalculatorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 :");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("정수 :");
		int num2 = Integer.parseInt(sc.nextLine());
		sc.close();
		
		Calculator cal = new Calculator();
		cal.a = num1;
		cal.b = num2;

		cal.sum();
		cal.sub();
		cal.mul();
		cal.div();
		
		cal.prime(num1);
		cal.prime(num2);			
	}
	
}
