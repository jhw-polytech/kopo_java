package jaeheehomework;

import java.util.Scanner;

public class PrintArea {

	public void printArea() {

		Scanner sc = new Scanner(System.in);

		end:while (true) {
			System.out.print("1(정사각형), 2(직사각형), 3(삼각형), 4(원), 5(stop) => ");
			int num = Integer.parseInt(sc.nextLine());
			
			switch (num) {

				case 1:
					Square square = new Square();
					square.area();
					break;
				case 2:
					Rec rec = new Rec();
					rec.area();
					break;
				case 3:
					Tri tri = new Tri();
					tri.area();
					break;
				case 4:
					Cir cir = new Cir();
					cir.area();
					break;
				case 5:
					System.out.println("STOP!");
					break end;
				default:
					System.out.println("AGAIN!");
					break;
			}
		}
		
	}
}
