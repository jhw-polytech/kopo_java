package jaeheehomework;

import java.util.Random;
import java.util.Scanner;

public class Figure2 {
	
	Random r;
	Scanner sc;
	
	Figure2(){
		sc = new Scanner(System.in);
		r = new Random();
	}
	
	// 
	public void open() {
		
		while(true) {
			// 도형을 숫자로 받습니다
			System.out.print("도형을 선택하세요(1. 직사각형, 2. 정사각형, 3. 삼각형, 4. 원, 5. stop) => ");
			int cNum = Integer.parseInt(sc.nextLine());
			
			// 5를 입력하면 끝냅니다
			if(cNum == 5) {
				System.out.println("Stop!");
				break;
			
			// 도형을 선택하면 면적을 구하는 area메소드를 시행합니다
			} else if(cNum == 1 || cNum == 2 || cNum == 3 || cNum == 4 ) {
				area(cNum);
			
			// 이외의 것을 입력하면 again을 출력합니다
			} else {
				System.out.println("again!");
			}
		}
		
	}
	
	

	// 랜덤값을 리턴해주는 메소드
	public double rand() {
		
		double rNum = r.nextInt(9) + 2;
		return rNum;
	}
	
	//도형의 형태를 파라미터로 받고, 랜덤값 메소드를 이용해 출력물을 만드는 메소드 
	public void area(int cNum) {
		
		double rNum1;
		double rNum2;
		
		switch(cNum) {
			case 1:
				rNum1 = rand();
				rNum2 = rand();
				System.out.printf("가로 %.2f, 세로 %.2f인 직사각형 면적은 %.2f입니다 \n", rNum1, rNum2, rNum1*rNum2);
				break;
				
			case 2:
				rNum1 = rand();
				System.out.printf("한 변이 %.2f인 정사각형 면적은 %.2f입니다\n", rNum1,  Math.pow(rNum1, 2));
				break;
				
			case 3:
				rNum1 = rand();
				rNum2 = rand();
				System.out.printf("가로 %.2f, 높이 %.2f인 삼각형 면적은 %.2f입니다\n", rNum1, rNum2, rNum1 * rNum2 / 2);
				break;
				
			case 4:
				rNum1 = rand();
				System.out.printf("반지름이 %.2f인 원의 면적은 %.2f입니다\n", rNum1, Math.pow(rNum1, 2) * Math.PI);
				break;
				
			default:
				System.out.println("error2");
		}
		
	}
	
	
}

