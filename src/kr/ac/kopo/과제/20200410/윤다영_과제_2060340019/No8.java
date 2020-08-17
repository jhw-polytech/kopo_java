package kr.ac.kopo.assignment.day03;

import java.util.Scanner;

public class No8 {
	/*
	 시작단과 종료단을 입력받아 구구단을 출력하시오
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작단을 입력 : ");
		int start = sc.nextInt();
		sc.nextLine();
		
		System.out.print("종료단을 입력 : ");
		int end = sc.nextInt();
		sc.nextLine();
		
		if(start > end) {
			int temp = 0;
			temp = start;
			start = end;
			end = temp;
		}
		
		for( ; start <= end ; start++) {
			System.out.printf("*** %d단 ***\n", start);
			for(int i = 1 ; i <= 9; i++) {
				int result = start * i;
				System.out.printf("%d * %d = %d\n", start , i, result);
			}
			System.out.println();
			
		}
		
	}

}
