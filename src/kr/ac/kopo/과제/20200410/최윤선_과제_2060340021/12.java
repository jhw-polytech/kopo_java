package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<4;i++) {   //4번째줄까지 출력
			for(int j=0;j<9;j++) {
				if(  (i<=j-1)  &&  ( j<-i+8 ) ) {
					System.out.print("-");
				}
				else{
					System.out.print("*");
				}
			}
			System.out.print("\n");  
		}
		for (int i=0;i<5;i++) {
			for(int j=0;j<9;j++) {
					if( (j<-i+5) ) { 
						System.out.print("*");
					}
					else if(j<i+4) {
						System.out.print("-");
					}
					else {
						System.out.print("*");
					}
			}
			System.out.print("\n");
		}
		
	}
}