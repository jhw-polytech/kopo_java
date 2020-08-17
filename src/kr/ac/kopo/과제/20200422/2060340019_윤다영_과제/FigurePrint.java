package kr.ac.kopo.assignment.day08;

import java.util.Random;
import java.util.Scanner;

public class FigurePrint {
	
		
	public int getFigure() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형, 4.원) => ");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	public void printFigureArea(int num) {
		
		Random ran = new Random();
		int i = ran.nextInt(9) + 2;
		int j = ran.nextInt(9) + 2;
		double area;
		
		switch(num) {		
			case 1 : 
				Rectangle rec = new Rectangle(i,j);
				area = rec.getArea();
				System.out.printf("가로 %d, 세로 %d의 직사각형 면적은 %.1f입니다.\n", i, j, area);				
				break;
			case 2 : 
				Square squ = new Square(i);
				area = squ.getArea();
				System.out.printf("가로 %d의 정사각형 면적은 %.1f입니다.\n", i, area);
				break;
			case 3 : 
				Triangle tri = new Triangle(i, j);
				area = tri.getArea();
				System.out.printf("가로 %d, 높이 %d의 삼각형 면적은 %.1f입니다.\n", i, j, area);
				break;
			case 4 : 
				Circle cir = new Circle(i);
				area = cir.getArea();
				System.out.printf("반지름 %d의 원 면적은 %.1f입니다.\n", i, area);
				break;
			default : System.out.println("Invalid Figure Num");
				break;
		}
		
	}
	
	

}
