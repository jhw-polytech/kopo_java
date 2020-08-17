package kr.co.hana.homework01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Scanner
		System.out.println("물건값을 입력하세요 : ");
		int cost = sc.nextInt();
						
		System.out.println("지불한 돈의 액수를 입력하세요 : ");
		int pay = sc.nextInt();
				
		// 거스름돈 계산	
		int changes = pay - cost;
		
		if(changes > 0) {
				
			
			System.out.printf("거스름돈 : %d", changes);
			System.out.printf("1000원 : %d개\n", changes / 1000);
		    System.out.printf("500원 : %d개\n", (changes % 1000) / 500);
		    System.out.printf("100원 : %d개\n", ((changes % 1000) % 500) / 100);
    	    System.out.printf("50원 : %d개\n", (((changes % 1000) % 500) % 100) / 50);
	        System.out.printf("10원 : %d개", ((((changes % 1000) % 500) % 100) % 50) / 10);
		}
		
		else {
			System.out.printf("%d원이 부족합니다.", cost - pay);
		}	
		sc.close();
	}
}
