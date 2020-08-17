package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int move=0;
		int hour=0;
		
		while(true) {
			if (move<50) {
				move += 4;
				hour++;
				System.out.printf("[%2d시간후] 총 높이 : %dM\n",hour,move);
			}
			else{
				if(move>=100) break;
				move+=3;
				hour++;
				System.out.printf("[%2d시간후] 총 높이 : %dM\n",hour,move);
				
			}
		}
		
	}
}