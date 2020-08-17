package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<5;i++) {   //5번째줄까지 출력
			for(int j=0;j<9;j++) {
				if(  (i<=j)  &&  ( j<-i+9 ) ) {
					System.out.print("*");
				}
				else if (i>j){
					System.out.print("-");
				}
			}
			System.out.print("\n");  
		}
		
	}
}