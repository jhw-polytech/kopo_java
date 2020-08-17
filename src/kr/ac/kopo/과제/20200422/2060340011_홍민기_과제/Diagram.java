package kr.ac.kopo.day08.homework;

import java.util.Random;
import java.util.Scanner;

// 오늘 배웠던 static, getter setter ,상속, 접근제한자 같은 다양한 방법을 사용해보고 싶었지만 아이디어가 떠오르지 않아 기능 클래스로 만들었습니다...

public class Diagram {

	void Calculator() {
		String[] strArr = {"직사각형", "정사각형", "삼각형", "원"};
		while(true) {
			System.out.print("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3.삼각형, 4.원) => ");
			Scanner sc = new Scanner(System.in);
			Random ran = new Random();
			
			
			int choice = sc.nextInt();
			int num1 = ran.nextInt(9)+2;
			int num2 = ran.nextInt(9)+2;
			
			if(choice ==1) {
				System.out.println("가로 "+num1+", 세로 "+num2+"의 "+strArr[choice-1]+" 면적은 "+getArea(num1,num2)+"입니다.");
				
			}
			else if(choice ==2) {
				System.out.println("가로 "+num1+"의 "+strArr[choice-1]+" 면적은 "+getArea(num1)+"입니다.");
				
			}
			else if(choice ==3) {
				System.out.println("밑변 "+num1+", 높이 "+num2+"의 "+strArr[choice-1]+" 면적은 "+getArea((double)num1,num2)+"입니다.");
			}
			else if(choice ==4) {
				System.out.println("반지름 "+num1+"의 "+strArr[choice-1]+" 면적은 "+getArea((double)num1)+"입니다.");
			}
			else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
	int getArea(int width) {
		return width * width;
	}
	
	int getArea(int width, int height) {
		return width * height;
	}
	
	double getArea(double width, int height) {
		return width * height /2;
	}
	double getArea(double width) {
		
		return width * width * Math.PI;
	}

}
