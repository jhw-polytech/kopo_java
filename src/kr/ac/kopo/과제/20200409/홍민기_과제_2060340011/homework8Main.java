package kr.ac.kopo.day02.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 8. 9480원어치 물건을 사고 10000원을 지불했을 때의 거스름돈과 1000원, 500원, 100원, 50원, 
 * 10원의 개수를 출력하는 프로그램을 작성하시오. 이때 물건값과 거스름돈은 키보드로
 * 입력할 수 있어야 한다. 액수가 정해져 있는 것은 아님. 모든 경우가 되도록 작성할 것.
 * 물건값을 입력하세요 : 5480
 * 지불한 돈의 액수를 입력하세요 : 10000
 * 거스름돈 : 4520원
 * 1000원 : 4개
 * 500원 : 1개
 * 100원 : 0개
 * 50원 : 0개
 * 10원 : 2개
 * 물건값을 입력하세요 : 5480
 * 지불한 돈의 액수를 입력하세요 : 5000
 * 480원이 부족합니다
 * 
 */
public class homework8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건값을 입력하세요 : ");
		
		int item = sc.nextInt();
		
		System.out.print("지불한 돈의 액수를 입력하세요 : ");
		
		int pay = sc.nextInt();
		
	    while(item>pay) { // 물건값보다 지불금액이 같거나 높을때 까지 반복
	    	System.out.print(item-pay + "원이 부족합니다. 다시 입력하세요 : ");
	    	pay = sc.nextInt();
	    }
		
	    int remain = pay - item; // 거스름돈
	    
	    System.out.println("거스름 돈 : "+remain+"원");
	    System.out.println("1000원 : "+ remain/1000 +"개");
	    remain%=1000; // 1000원 단위를 제외한 나머지 잔돈
	    
	    System.out.println("500원 : "+ remain/500 +"개");
	    remain%=500; // 500원 단위를 제외한 나머지 잔돈
	    
	    System.out.println("100원 : "+ remain/100 +"개");
	    remain%=100; // 100원 단위를 제외한 나머지 잔돈
	    
	    System.out.println("50원 : "+ remain/50 +"개");
	    remain%=50; // 50원 단위를 제외한 나머지 잔돈
	    
	    System.out.println("10원 : "+ remain/10 +"개");
	}

}
