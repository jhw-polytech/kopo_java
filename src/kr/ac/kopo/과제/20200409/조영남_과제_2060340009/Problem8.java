package kr.ac.yeongnam.day02.homework;

import java.util.Scanner;

/*
8. 9480원어치 물건을 사고 10000원을 지불했을 때의 거스름돈과 
   1000원, 500원, 100원, 50 원, 10원의 개수를 출력하는 프로그램을 작성하시오. 
      이때 물건값과 거스름돈은 키보드로 입력할 수 있어야 한다. 
      액수가 정해져 있는 것은 아님. 모든 경우가 되도록 작성할 것. 
      
      물건값을 입력하세요 : 5480 
      지불한 돈의 액수를 입력하세요 : 10000 
      거스름돈 : 4520원 
      1000원 : 4개  
       500원 : 1개  
       100원 : 0개 
        50원 : 0개 
        10원 : 2개 
      물건값을 입력하세요 : 5480 
      지불한 돈의 액수를 입력하세요 : 5000 
   480원이 부족합니다

 */

public class Problem8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건값을 입력하세요 : ");
		int itemPrice = sc.nextInt();
		sc.nextLine();
		
		while(itemPrice <= 0) { // 물건값이 0보다 작거나 같은 경우, 다시 입력받음
			System.out.println("물건값은 0보다 커야합니다. 다시 작성해주세요.");
			System.out.print("물건값을 입력하세요 : ");
			itemPrice = sc.nextInt();
			sc.nextLine();
		}
				
		System.out.print("지불한 돈의 액수를 입력하세요 : ");
		int payment = sc.nextInt();
		sc.nextLine();
		
		while(payment <= 0) { // 지불 금액이 0보다 작거나 같은 경우, 다시 입력받음
			System.out.println("지불금은 0보다 커야합니다. 다시 작성해주세요.");
			System.out.print("지불한 돈의 액수를 입력하세요 : ");
			payment = sc.nextInt();
			sc.nextLine();
		}
		
		int diff = payment - itemPrice; // 지불 금액 - 물건값

		if(diff < 0) { // 덜 지불한 경우
			System.out.println(-diff + "원이 부족합니다.");
		} else { // 제대로 지불한 경우
			System.out.println("거스름돈 : " + diff + "원");
			int oneThousandWon = diff / 1000;
			int fiveHundredWon = (diff % 1000) / 500;
			int oneHundredWon = (diff % 500) / 100;
			int fiftyWon = (diff % 100) / 50;
			int tenWon = (diff % 50) / 10;
			
			System.out.println("1000원 : " + oneThousandWon + "개");
			System.out.println(" 500원 : " + fiveHundredWon + "개");
			System.out.println(" 100원 : " + oneHundredWon + "개");
			System.out.println("  50원 : " + fiftyWon + "개");
			System.out.println("  10원 : " + tenWon + "개");			
		}		
	}
}
