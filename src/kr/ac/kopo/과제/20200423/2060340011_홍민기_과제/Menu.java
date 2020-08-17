package kr.ac.kopo.day09.homework;

import java.util.Random;
import java.util.Scanner;

public class Menu {

	private Scanner sc;
	private Random ran;
	private Shape sh;

	public Menu() {
		sc = new Scanner(System.in);
	}

	public void execute() {
		while(true) {
			System.out.print("도형을 선택하세요(1. 직사각형  2. 정사각형  3. 삼각형  4. 원  5. 종료) => ");
			int type = sc.nextInt();
			sc.nextLine();

			ran = new Random();

			int width = ran.nextInt(9)+2;
			int height = ran.nextInt(9)+2;

			sh = null;
			if(type == 1) {
				sh = new Rectangle(height, width);
			}
			else if(type == 2) {
				sh = new Square(width);
			}
			else if(type == 3) {
				sh = new Triangle(height, height);
			}
			else if(type == 4) {
				sh = new Circle(width);
			}
			else if(type == 5) {
				System.out.println("종료합니다.");
				break;
			}

			sh.print();
		}
	}
}
