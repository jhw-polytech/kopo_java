package shlee1993.day02.homework;

import java.util.Scanner;

/*
3. 반지름을 입력받고 원의 면적을 출력
ex)원의 면적은 143.1234입니다.
*/

// 문제에 주어진대로 소수점 4자리까지만 구하기 위해 %.4f를 사용한다

public class hw03 {

   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요(양수) : ");
		String radInput = sc.nextLine();
		double rad = Double.parseDouble(radInput);
		
		if (rad > 0) {
			System.out.print("반지름이 " + rad + "인 원의 넓이는 ");
			System.out.printf("%.4f 입니다.", rad * rad * 3.141592); // 소수점 4자리까지만 출력을 위한 %.4f
		}
		else System.out.println("잘못 입력하셨습니다.");	//0이나 음수일 경우
	}
}
