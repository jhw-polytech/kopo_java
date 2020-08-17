package test0411;

/*
 * 시작단과 종료단을 입력받아 구구단을 출력하시오.
 * 시작단을 입력 : 5
 * 종료단을 입력 : 8
 * 
 * ***5단***
 * 5*1=5
 * ...
 * 8*9 =72
 */

import java.util.Scanner;

public class exam08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작단을 입력 :");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("종료단을 입력 :");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		for(int i = num1;i<=num2 ;i++ ) {
			
			System.out.println("***"+ i +"단***");
			
			for(int j=1 ;j<=9 ;j++ ) {
				
				System.out.printf("%d*%d=%d\n", i, j, i*j);
				
			}
			
		}
		
		
	}

}
