package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=2;i<=9;i++) {
			System.out.printf("**** %d 단 ****\n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf(" %d * %d = %d\n", i,j,j*i);
			}
			System.out.printf("\n");
		}
		
	}
}