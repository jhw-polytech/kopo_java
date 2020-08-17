package kr.ac.yeongnam.day02.homework;

import java.util.Scanner;

/* 
3. 반지름이 10인 원의 면적을 구해서 출력하시오.
      참고 : 원주율 – 3.141592
      결과출력 : 원의 면적은 143.1234 입니다.
            
         ※수업 중에 반지름의 길이도 입력받게 하라고 하셔서 반영했습니다.        
 */

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름의 길이를 입력하세요: ");
		double radius = sc.nextDouble(); // 반지름의 길이를 입력받는 변수
		sc.nextLine(); // 버퍼 버그 방지를 위한 코드
		
		final double PI = 3.141592; // 원주율은 고정된 값이기 때문에, final 선언
		double areaCircle = PI * radius * radius; // 원의 면적 구하기
		
		System.out.println("원의 면적은 " + areaCircle + " 입니다.");
	}
}
