package kr.ac.kopo.day03.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 12. 다음의 결과를 보이는 코드를 작성하시오. (단 출력메소드에 하나의 문자만 가능)
   *-------*
   **-----**
   ***---***
   ****-****
   *********
   ****-****
   ***---***
   **-----**
   *-------*
 * 
 */
public class Homework12Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int star=0;

		for(int i=0;i<9;i++) { 
			for(int j=0;j<9;j++) {
				if(j<=star || j>=8-star) {
				System.out.print("*");
				}
				else
				System.out.print("-");

			}
			star += i<4?  +1 : -1;
			System.out.println();
			
		}

	}
}
