package homework0422;

/*
 * 2060340017 신형재 과제 1번
 * 너무 단순하게 생각하고 짠 코드라고 생각합니다.
 * 반복되는 부분을 어떻게 최소화할지 생각해보겠습니다.
 */

import java.util.Random;
import java.util.Scanner;
public class n {
	//변수 정의
	int length;
	int height;
	int diameter;
	double pi = 3.14159;
	int n = 0; // 사용자 선택지 변수
	
	Random r = new Random();
	Scanner sc= new Scanner(System.in);
	
	// 사용자를 통해 도형 선택
	int selectN() {
		System.out.println("도형을 선택하세요.(1. 직사각형, 2. 정사각형, 3. 삼각형, 4. 원)");
		int n = sc.nextInt();
		return n;
	}
	// 2~10 사이의 임의의 숫자 추출
	void chooseNum() {
		length = r.nextInt(8)+2;
		height = r.nextInt(8)+2;
		diameter = r.nextInt(8)+2;
	}
	// 결과 출력
	void insertNum(int n) {
		if(n==1) {
			System.out.println("직사각형을 선택하셨군요!! 가로 : " + length + ", 세로 : " + height + "인 직사각형의 넓이는 : " + length*height);
		}else if(n==2) {
			System.out.println("정사각형을 선택하셨군요!! 한 변의 길이가 : " + length + "인 정사각형의 넓이는 : " + length*length);
		}else if(n==3) {
			System.out.println("삼각형을 선택하셨군요!! 밑변 : " + length + ", 높이 : " + height + "인 삼각형의 넓이는 : " + (double)length*height/2);
		}else if(n==4){
			System.out.println("원을 선택하셨군요!! 반지름 : " + diameter + "을 가진 원의 넓이는 : " + diameter*pi);
		}else {
			System.out.println("1번~4번에 해당하는 도형을 입력하세요.");
			execute();
		}
	}
	
	void execute() {
		n=selectN();
		chooseNum();
		insertNum(n);
	}
}
