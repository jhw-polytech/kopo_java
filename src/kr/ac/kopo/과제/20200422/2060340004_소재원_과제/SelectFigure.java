package exam0422;

import java.util.Random;
import java.util.Scanner;

public class SelectFigure {

	final double PI = 3.1415926535;
	Random r = new Random();
	
	
	public SelectFigure() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while ((num < 1) || (num > 5)) {
			System.out.println("면적을 계산할 도형을 선택하세요.");
			System.out.println("1. 정사각형, 2. 정삼각형, 3. 직사각형, 4. 삼각형, 5. 원 => " );
			num = sc.nextInt();
		}
		sc.close();
		randomNum(num);
		
	}

	/**
	 * 선택한 도형 메소드에 맞게 2~10사이의 랜덤한 숫자를 뽑아 보내는 메소드.
	 * @param num
	 */
	public void randomNum(int num) {
		Random r = new Random();
		int r1;
		r1 = r.nextInt(8) + 2;

		
		if ((num == 1) || (num == 2)) {
			calculateArea(num, r1);
			
		} else if (num == 5) {
			calculateArea(r1, PI);
			
		} else {
			int r2 = r.nextInt(8) + 2;
			while(r1 == r2) {
				r2 = r.nextInt(8) + 2;
			}
			calculateArea(num, r1, r2);
		}
	}

	/**
	 * 고른 도형의 번호와 랜덤한 숫자를 받아 정사각형, 정삼각형을 계산하는 메소드
	 * @param num
	 * @param r1
	 */
	public void calculateArea(int num, int r1) {
		if (num == 1) {
			System.out.printf("길이가 %d인 정사각형의 넓이 : %d", r1, r1*r1);

		} else {
			System.out.printf("모든 변의 길이가  %d인 정삼각형의 넓이 : %.4f", r1, (Math.sqrt(3) * Math.pow(r1, 2) / 4.0) );
		}
	}
	/**
	 * 고른 도형의 번호와 랜덤한 숫자 2개를 받아 직사각형과 삼각형을 계산하는 메소드
	 * @param num
	 * @param r1
	 * @param r2
	 */
	public void calculateArea(int num, int r1, int r2) {
		if (num == 3) {
			System.out.printf("가로가 %d, 세로가 %d인 직사각형의 넓이 : %d", r1, r2, r1*r2);
		
		} else {
			System.out.printf("밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f", r1, r2, (r1*r2) / 2.0);
		}
		
	}
	
	/**
	 * 랜덤한 숫자 1개와 상수 PI를 받아 원의 넓이를 계산하는 메소드
	 * @param r1
	 * @param PI
	 */
	public void calculateArea(int r1, double PI) {
		System.out.printf("반지름이 %d인 원의 넓이 : %.4f", r1, PI * Math.pow(r1, 2));
	}
}
