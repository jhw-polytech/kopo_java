package test0410;

/*
 * 9480원어치 물건을 사고 10000원을 지불했을 때의 거스름돈과  1000원 500원 100원 50원 10원
 * 개수를 출력하는 프로그램을 작성하시오. 이때 물건값과 거스름돈은 키보드로 입력할 수 있어야 한다.
 * 액수가 정해져 있는 것은 아님. 모든 경우가 되도록 작성할 것.
 * 물건값을 입력하세요 : 5480
 * 지불한 돈의 액수를 입력하세요 : 10000
 * 거스름돈 4520원
 * 1000원 : 4개
 * 500원 : 1개
 * 100원 : 0개
 * 50원 : 0개
 * 10원 : 2개
 *
 * 물건값을 입력하세요 : 5480
 * 지불한 돈의 액수를 입력하세요 : 5000
 * 480원이 부족합니다.
 */

import java.util.Scanner;

public class exam08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("물건값을 입력하세요");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.println("지불할 돈의 액수를 입력하세요");
		int payment = sc.nextInt();
		sc.nextLine();
		
		int change = payment - price;
		int a = change/1000;
		int b = (change-1000*a)/100;
		int c = (change-1000*a-100*b)/10;
		
		if(price>payment) {
			
			int shortage = price - payment;
			System.out.println(shortage + "원이 부족합니다");
	
		}else if(b<5 && c<5) {
			
			System.out.println("거스름돈은" + change + "입니다");
			System.out.println("1000원" + a + "\n100원" + b + "\n10원" + c);
		}else if(b>=5 && c<5) {
			
			int b1 = b-5;
			System.out.println("거스름돈은" + change + "입니다");
			System.out.println("1000원" + a + "\n500원 1" + "\n100원" + b1 + "\n10원" + c);
		}else if(b<5 && c>=5) {
			
			int c1 = c-5;
			System.out.println("거스름돈은" + change + "입니다");
			System.out.println("1000원" + a + "\n100원" + b + "\n50원 1" + "\n10원" + c1);
		}else {
			
			int b1 = b-5; int c1= c-5;
			System.out.println("거스름돈은" + change + "입니다");
			System.out.println("1000원" + a + "\n500원 1" + "\n100원" + b1 + "\n50원 1" + "\n10원" + c1);
		}
		
	}

}
