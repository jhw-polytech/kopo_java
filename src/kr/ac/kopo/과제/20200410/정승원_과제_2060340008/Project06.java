package kr.ac.kopo.day03.project;

import java.util.Scanner;

/**
 * 
 * @author tess
단을 입력받아 구구단을 출력하는 클래 

2 - 9 단을 입력 : 6
*** 6단 *** 6*1=6 6 * 2 = 12 ...
6 * 9 = 54
 */

public class Project06 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("2 - 9 단을 입력 : ");
		
		int a = sc.nextInt();
		
		System.out.printf("*** %d단 ***\n", a); // 앞으로 출력할 구구단을 명시 
		for (int i = 1; i < 10; i++) { // 반복문을 돌면서 구구단을 출력해준다. 
			System.out.printf("%d * %d = %d\n", a, i, (a*i));
		}
		
	}
	
}
