package kr.ac.jinwoo.day03.homework;

import java.util.Scanner;

/*
 * 시작단과 종료단을 입력받아 구구단을 출력하는 코드를 작성하시오.
 * (시작단과 종료단을 반대로 입력해도 같은 결과가 나올 것)
 * 
 */

public class Exam08 {

	public static void main(String[] args) {
		int startNum, endNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("시작단을 입력 : ");
		startNum = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("종료단을 입력 : ");
		endNum = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		int temp;
		if(startNum > endNum) {
			temp = startNum;
			startNum = endNum;
			endNum = temp;
		}
		
		for(int i = startNum; i <= endNum; i++) {
			System.out.printf("*** %d단 ***\n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			
			System.out.println();
		}
	}
}
