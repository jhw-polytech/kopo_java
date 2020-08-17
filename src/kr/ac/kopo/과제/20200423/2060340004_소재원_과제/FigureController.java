package exam0423;

import java.util.Random;
import java.util.Scanner;

public class FigureController {

	Random r;
	Scanner sc;
	Figure f;
	private int selectNum;
	private int r1;
	private int r2;
	
	
	public void execute() {
		
		System.out.println("도형을 선택하세요.");
		System.out.println("1. 직사각형, 2. 정사각형, 3. 삼각형, 4. 정삼각형, 5. 원");
		sc = new Scanner(System.in);
		
		selectNum = Integer.parseInt(sc.nextLine());
		sc.close();
		
		r1 = randomNum();
		r2 = randomNum();
		while(r1 == r2) {
			r2 = randomNum();
		}
		
		switch(selectNum) {
		case 1 : f = new Rectangle(r1, r2);
				 break;
		case 2 : f = new Square(r1);
				 break;
		case 3 : f = new Triangle(r1, r2);
				 break;
		case 4 : f = new RegularTriangle(r1);
			     break;
		case 5 : f = new Circle(r1);
		}
		f.printArea();
	}
	
	public int randomNum() {
		r = new Random();
		int randomNum = r.nextInt(8) + 2;
		return randomNum;
	}

}
