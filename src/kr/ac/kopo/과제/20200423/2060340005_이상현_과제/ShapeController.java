package shlee1993.day09.homework;

import java.util.Scanner;

public class ShapeController {
	
	public void start() {
		{
			Scanner sc = new Scanner(System.in);
			
			branch: while (true) {
				System.out.println("도형을 선택하세요(1. 직사각형 2. 정사각형 3. 삼각형 4. 원, 종료하시려면 1~4를 제외한 것을 입력하세요)");
				int select = Integer.parseInt(sc.nextLine());

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
					break branch;	//default의 경우 switch문이 아닌, while문을 종료시킴
				}
			}
			
			sc.close();
		}
	}
	
}
