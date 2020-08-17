package test0411;

/*
 * 단을 입력받아 구구단을 출력하세요
 * 
 * ***6단***
 * 6*1 = 6
 * 6*2 =12
 * ...
 * 6*9 =54 
 */

import java.util.Scanner;

public class exam06 {
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2-9단을 입력 :");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("***" + num + "단***");
		
		
		for(int i=1 ;i<=9 ;i++ ) {
			
			int result = num * i;
			System.out.printf("%d*%d=%d\n",num , i, result);
		}
	
	}
		
		 
		 
	

}
