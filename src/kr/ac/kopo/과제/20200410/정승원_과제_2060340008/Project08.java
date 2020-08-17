package kr.ac.kopo.day03.project;

import java.util.Scanner;

/**
 * 
 * @author tess
시작단과 종료단을 입력받아 구구단을 출력하시오. 

시작단을 입력 : 5
종료단을 입력 : 8

 */
public class Project08 {

	public static void main(String[] args) {
		
		int start = 100000;
		int end = -1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작단을 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("종료단을 입력 : ");
		int b = sc.nextInt();
		
		// 시작단과 종료단을 조건으로 식별하여 저장해준다.
		if (a>b) {
			start = b;
			end = a;
		} else {
			start = a;
			end = b;
		}
		
		for (int j = start; j <= end; j++) {
	
			System.out.printf("*** %d단 ***\n", j); // 앞으로 출력할 구구단을 명시 
			for (int i = 1; i < 10; i++) { // 반복문을 돌면서 구구단을 출력해준다. 
				System.out.printf("%d * %d = %d\n", j, i, (j*i));
			}
			System.out.println();
		}
		
	}
}
