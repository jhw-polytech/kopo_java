package homework0423;

import java.util.Scanner;

public class Control {
	Scanner sc = new Scanner(System.in);
	int answer;
	
	Rectangle rec = new Rectangle();
	Triangle tri = new Triangle();
	Circle cir = new Circle();
	Square sq = new Square();
	
	public int question() {
	System.out.println("도형을 선택하세요.(1. 직사각형, 2. 정사각형, 3. 삼각형, 4. 원)");
	answer = sc.nextInt();
	sc.nextLine();
	return answer;
	}
	public void print(int answer) {
		if(answer==1) {
		rec.print();
		}else if(answer==2) {
		sq.print();
		}else if(answer==3) {
		tri.print();
		}else if(answer==4) {
		cir.print();
		}
	}
}
