package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt=0;
		for (int dan=2 ; dan <=9 ; dan=dan+3) {
			for (int i=1 ; i<10 ; i++) {
				System.out.printf("%d * %d = %2d   " ,dan   , i , dan *i);
				System.out.printf("%d * %d = %2d   " ,dan+1, i ,(dan+1) *i);	
				
				if(dan+2 != 10) {
					System.out.printf("%d * %d = %2d   " ,dan+2, i ,(dan+2) *i);
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
	}
}