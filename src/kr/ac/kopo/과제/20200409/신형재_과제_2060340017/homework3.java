package homework0409;

/*
 * 2060340017 신형재 과제 3번
 * 
 * 반지름 입력 시 원의 넓이를 구하는 문제
 */

import java.util.Scanner;
// 사용자의 입력값을 받기 위해 Scanner import 진행

public class homework3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요 : ");
		int len = sc.nextInt();
		// 사용자를 통해 반지름 값 입력, int 변수 사용
		
		if(len > 0) {
		System.out.println("반지름이 " + len + "인 원의 면적을 구해서 출력하시오");
		
		System.out.println("참고 : 원주율 -3.141529");
		final double PI = 3.141529;
		// 원주율 값은 고정으로 설정, double 변수를 통해 실수 표현 및 final 코드를 통해
		// 이후 변경 불가
		
		System.out.println("결과 출력 : 원의 면적은 " + len*PI + "입니다.");
		}else {
			System.out.println("반지름은 양수로 입력 가능합니다. 다시 입력하세요.");
		}
		// 반지름을 음수로 입력 할 경우 오류 메세지 출력
	}
}
