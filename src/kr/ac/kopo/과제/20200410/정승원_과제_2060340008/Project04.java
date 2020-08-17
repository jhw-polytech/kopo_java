package kr.ac.kopo.day03.project;

import java.util.Scanner;

/**
 * 
 * @author tess
다음의 결과를 보이는 클래스

1-100 사이의 정수를 입력 :40 
2-10사이의 정수를 입력 :5
< 1 ~ 40사이의 5의 배수를 제외한 정수 출력>
1 2 3 4 6 7 8 9 11...39
<1~40사이의 5의 배수를 제외한 정수 5개씩 출력> 
1 2 3 4 6
7 8 9 11 12
...
 */

public class Project04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1-100 사이의 정수를 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("2-10사이의 정수를 입력 : ");
		int b = sc.nextInt();
		
		System.out.printf("< 1 ~ %d사이의 %d의 배수를 제외한 정수 출력>\n", a, b);
		for (int i = 1; i < a; i++) {
			if ((i%b) != 0) { // 수를 제외한 정수를 출력하는 조건문 
				System.out.printf("%d ", i);
			}
		}
		
		System.out.println();
		System.out.printf("< 1 ~ %d사이의 %d의 배수를 제외한 정수 5개씩 출력>\n", a, b);
		int j = 0; // 5개를 세어줄 변수 설정 
		for (int i = 1; i < a; i++) {
			if ((i%b) != 0) {  // 배수를 제외한 정수가 출력되면, 
				System.out.printf("%d ", i);
				j++; // j를 하나 늘려준다.  
			}
			
			if (j == 5) { // j가 5라면 배수를 제외한 정수가 다섯 번 출력되었다는 의미이다. 
				System.out.println(); // 그래서 다음 개행을 출력 
				j = 0; //j를 초기화해준다. 
			}
			
		}
		
		
	}
}
