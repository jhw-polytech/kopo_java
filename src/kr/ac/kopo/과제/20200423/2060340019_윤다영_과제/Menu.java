package kr.ac.kopo.assignment.day09;

import java.util.Random;
import java.util.Scanner;

public class Menu {
	
	private Random ran; 
	private Scanner sc;
	
	public Menu() {
		ran = new Random();
		sc = new Scanner(System.in);
	}
	
	public void execute() {
		
		System.out.print("도형을 선택하세요(1.직사각형  2.정사각형  3.삼각형  4.원) => ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int i = ran.nextInt(9)+2;
		int j = ran.nextInt(9)+2;
		
		Shape shape = null;

		switch(num) {
		case 1 : 
			shape = new Rectangle(i, j);					
			break;
		case 2 :
			shape = new Square(i);
			break;
		case 3 :
			shape = new Triangle(i, j);			
			break;
		case 4 : 
			shape = new Circle(i);
			break;
		}
		
		shape.calculateArea();
		shape.printArea();
		
	}
	

}
