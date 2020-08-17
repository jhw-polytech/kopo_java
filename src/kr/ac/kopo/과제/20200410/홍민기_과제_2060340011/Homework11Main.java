package kr.ac.kopo.day03.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 11. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
   *********
   -*******
   --*****
   ---***
   ----*
 * 
 */
public class Homework11Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("줄의 개수를 입력하세요 : ");
		int N = sc.nextInt();

		for(int i=0;i<N;i++) {

			//   *****  +   ****		=       *********
			//   -****  +   ***			=       -*******		
			//   --***  +   **			=       --*****		
			//   ---**  +   *			=       ---***
			//   ----*       			=       ----*       // one drive에서 보면 ' '이 '*'보다 크기가 작아서 모양이 안맞네요ㅜㅜ

			// 두 출력으로 나누어 생각을 합니다.
			// 왼쪽 도형 한줄의 반복이 끝나면 오른쪽 도형의 반복을 넣어주면 됩니다. 
			// 이때 오른쪽 도형의 공백문자는 출력모양의 영향을 주지 않으므로 생략해도 됩니다.
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=N;j>i;j--) { 
				System.out.print("*");
			}
			
			// 왼쪽 도형 한줄 끝
			
			for(int j=N-1;j>i;j--) { // 오른쪽 도형의 별 개수는 왼쪽 도형보다 한개 더 적으므로 j=N-1부터 시작을 합니다. (40번째 줄 j=N과 비교해보세요)
				System.out.print("*");
			}
			
			// 오른쪽 도형 한줄 끝
			
			System.out.println(); // 한줄 끝났으므로 줄바꿈
		}

	}
}
