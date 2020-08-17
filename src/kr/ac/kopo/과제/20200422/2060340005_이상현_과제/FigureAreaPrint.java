package shlee1993.day08.homework;

import java.util.Scanner;

//2~10까지 랜덤 변수를 받고 넓이 구하기
//변수 1개짜리 클래스(super) -> 원(sub), 정사각형(sub)
//변수 2개짜리 클래스(super) -> 직사각형(sub), 삼각형(sub)으로 상속을 하는 것도 좋을 것 같습니다

public class FigureAreaPrint {
	public static void area() {
		Scanner sc2 = new Scanner(System.in);
		
		branch: while (true) {	//branch : 초반 제어문 배울 때 배웠던게 생각나서 사용해봤습니다.
			System.out.println("도형을 선택하세요(1. 직사각형 2. 정사각형 3. 직각삼각형 4. 원, 종료하시려면 1~4를 제외한 것을 입력하세요)");
			int select = Integer.parseInt(sc2.nextLine());

			switch (select) {
			case 1:
				Rectangle reck = new Rectangle();
				reck.print();
				break;
			case 2:
				Square sq = new Square();
				sq.print();
				break;
			case 3:
				Triangle tri = new Triangle();
				tri.print();
				break;
			case 4:
				Circle c = new Circle();
				c.print();
				break;
			default:
				System.out.println("종료됩니다.");
				break branch;
			}
		}
		
		sc2.close();
	}
}
