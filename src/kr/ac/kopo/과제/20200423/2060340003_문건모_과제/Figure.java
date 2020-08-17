package test0423;

import java.util.Scanner;

public class Figure {
	
	double area; //처음 설계에선 private라 했지만 상속된 클래스에서 받기 위해 default로 변경했습니다
	/*
		상속된 클래스에서 변수를 사용하기 위해서는 default 보다는 protected가 더 좋습니다
		서로 다른 패키지에 있어도 접근을 할 수 있도록이요....
	*/
	
	
	public double areaMethod() {
		return area;
	}
	
	public void  figureInfo() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요(1.직사각형, 2.정사각형, 3.삼각형 , 4.원)");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num){
		
		case 1 :
			Rectangle rec = new Rectangle();
			area = rec.areaMethod();
			int width = rec.width;
			int height = rec.height;
			System.out.println("가로의 길이가 " + width + " 세로의 길이가 " + height + "인 직사각형의 넓이는 " + area + "입니다");
			
			break;
		case 2 :
			Square sq = new Square();
			area = sq.areaMethod();
			int widthsq = sq.width;
			System.out.println("한변의 길이가" + widthsq + "인 정사각형의 넓이는" + area + "입니다");
			
			break;
		case 3 :
			Triangle tri = new Triangle();
			area = tri.areaMethod();
			int widthtri = tri.width;
			int heighttri = tri.height;
			System.out.println("밑변의 길이가 " + widthtri + " 높이가 " + heighttri + "인 삼각형의 넓이는 " + area + "입니다");
			
			break;
		case 4 :
			Circle cir = new Circle();
			area = cir.areaMethod();
			int radius = cir.radius;
			System.out.println("반지름의 길이가" + radius + "인 원의 면적은 " + area + "입니다");
			
			break;
			
			
		}
		
		
		
	}
	
	

	

}
