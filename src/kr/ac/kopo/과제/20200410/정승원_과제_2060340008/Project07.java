package kr.ac.kopo.day03.project;

import java.util.Scanner;

/**
 * 
 * @author tess
구구단을 출력하는 클래스 
 */

public class Project07 {

	public static void main(String[] args) {
	
		for (int j = 2; j < 10; j++) {
	
			System.out.printf("*** %d단 ***\n", j); // 앞으로 출력할 구구단을 명시 
			for (int i = 1; i < 10; i++) { // 반복문을 돌면서 구구단을 출력해준다. 
				System.out.printf("%d * %d = %d\n", j, i, (j*i));
			}
			System.out.println();
		}
		
	}
}
