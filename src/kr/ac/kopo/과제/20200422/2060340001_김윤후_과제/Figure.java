package Assignment07;

import java.util.Random;
import java.util.Scanner;

public class Figure {

	Scanner sc;
	Random r=new Random();
	
	Figure(){
		sc = new Scanner(System.in);
		
	}
	int getInt(String msg) {
		System.out.print(msg);
		int num= sc.nextInt();
		sc.nextLine();
		
		return num;
	}
	
	void StartFigure() {
		
		int cnt= getInt("도형을 선택하시오 (1.직사각형, 2.정사각형,"
				+ " 3.삼각형, 4.원)");
		
		if(cnt==1) {
			rectangle();
		}
		else if(cnt==2) {
			square();
		}
		else if(cnt==3) {
			triangle();
		}
		else if(cnt==4) {
			circle();
		}
	}
	
	int rectangle() {
		int num1=r.nextInt(9)+1;
		int num2=r.nextInt(9)+1;
		int Rectangle=num1*num2;
		
		System.out.println("가로 "+ num1 +", 세로 "+num2+" 직사각형의 면적은 "+Rectangle+"입니다.");

		return Rectangle;
	}
	int square() {
		int num1=r.nextInt(9)+1;
		int square=num1*num1;
		
		System.out.println("가로 "+ num1 +" 정사각형의 면적은 "+square+"입니다.");
		return square;
	}
	
	double triangle() {
		int num1=r.nextInt(9)+1;
		int num2=r.nextInt(9)+1;
		double triangle=(double)(num1*num2)/2;
		
		System.out.println("가로 "+ num1 +", 높이 "+num2+" 삼각형의 면적은 "+triangle+"입니다.");
		return triangle;
	}
	
	double circle() {
		int num1=r.nextInt(9)+1;
		double pi=3.14;
		double circle=(double)(num1*num1)*pi;
		
		System.out.println("반지름이 "+ num1 + "인 원의 넓은 "+circle+"입니다.");
		return circle;
	}
}
