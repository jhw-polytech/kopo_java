package shlee1993.day08.homework;

import java.util.Scanner;

public class PrintMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("기능을 선택하세요 1. 넓이 출력 ");	//나중에 다른 기능이 있을 때를 생각하여 만들어 뒀습니다.
		int select = Integer.parseInt(sc.nextLine());
		
		switch (select) {
		case 1:
			FigureAreaPrint.area();
			break;
		default:
			System.out.println("종료됩니다.");
			break;
		}
		
		sc.close();
	}
	
}