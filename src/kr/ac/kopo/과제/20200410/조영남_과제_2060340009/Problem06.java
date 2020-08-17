package kr.ac.yeongnam.day03.homework;

import java.util.Scanner;

/* 
6. 단을 입력받아 구구단을 출력하세요      
   2 - 9 단을 입력 : 6 
   
   *** 6단 ***      
   6 * 1 = 6      
   6 * 2 = 12      
   ...      
   6 * 9 = 54   
 */

public class Problem06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("2 - 9 단을 입력 : ");
		int num = sc.nextInt(); // 단의 정보를 입력 받는 변수
		System.out.println("");
		
		System.out.println("*** " + num + "단 ***" );
		for(int cnt = 1; cnt <= 9; cnt++) {
			System.out.printf("%d * %d = %d\n", num, cnt, num*cnt);
		}
	}
}
