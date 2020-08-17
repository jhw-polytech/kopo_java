package kr.ac.kopo.day03.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 10. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
 * 반복문 5개, 조건문 1개 이용가능
 * 반복문 3개, 조건문 3개
 * 반복문 3개, 조건문 1개
 * 반복문 2개, 조건문 2개
   *****
   -****
   --***
   ---**
   ----*
   ---**
   --***
   -****
   *****
 * 
 */
public class Homework10Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄의 개수를 입력하세요(홀수) : "); // 문제와 같게 하려면 9를 입력하세요...
		
		int N = sc.nextInt();

		for(int i=0;i<N;i++) { // 찍어야 하는 별의 줄 수는 9줄 
			if(i<=N/2) { // 9/2 = 4, i는 0부터 4까지 총 5번을 시행하기 위한 조건문
				
				//   *****
				//   -****
				//   --***
				//   ---**
				//   ----* 이걸 찍기위한 조건문 입니다.
				
				for(int j=0;j<i;j++) { // 공백은 점차 늘어나는 형태
					System.out.print(" ");
				}
				for(int j=N/2;j>=i;j--) { // 별은 점점 줄어드므로 처음에 5번 찍는것을 i를 증가시켜 줄입니다.
					System.out.print("*");
				}
				System.out.println(); // 한줄 찍으면 줄바꿈
			}
			else { // i는 5부터 8까지 총 4번을 시행하기 위한 나머지 조건
				
				//   ---**
				//   --***
				//   -****
				//   ***** 이걸 찍기위한 나머지 조건 입니다.
				
				for(int j=i+1;j<N;j++) { // 위와는 반대로 공백이 줄어듦, i를 증가시켜 공백의 개수를 줄입니다.
					System.out.print(" ");
				}
				for(int j=N/2;j<=i;j++) { // 위와는 반대로 별이 늘어납니다.
					System.out.print("*");
				}
				System.out.println(); // 한줄 찍으면 줄바꿈
			}
		}

	}
}
