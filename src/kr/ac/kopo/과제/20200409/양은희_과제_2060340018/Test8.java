package Homework_0409;

import java.util.Scanner;

/* 8)9480원어치 물건을 사고 10000원을 지불했을 때의 거스름돈과
1000원, 500원, 100원, 50원, 10원의 개수를 출력하는 프로그램을 작성하시오.
이 때 물건값과 거스름돈은 키보드로 입력할 수 있어야 한다. 액수가 정해져 있는 것은 아님.
모든 경우가 되도록 작성할 것.
*/

public class Test8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값을 입력하세요 : ");
		int product = sc.nextInt();												// 물건값을 입력받는다.
		
		System.out.print("지불한 돈의 액수를 입력하세요 : ");								// 지불한 돈의 액수를 입력받는다.
		int money = sc.nextInt();
		
		if(product>money) {														// 만약 물건값이 지불한 돈의 액수보다 높을 경우
			System.out.println(product-money + "원이 부족합니다.");					// 얼마가 부족한지 알려준다.
		} else {																// 그렇지 않은 경우 정상적인 계산 결과가 출력된다.
			System.out.println("거스름돈 : "+ (money-product) + "원");
			System.out.println("1000원 : "+ (money-product)/1000 + "개");
			System.out.println(" 500원 : " + (money-product)%1000/500 + "개");
			System.out.println(" 100원 : " + (money-product)%500/100 + "개");
			System.out.println("  50원 : "  + (money-product)%50/50 + "개");
			System.out.println("  10원 : "  + (money-product)%50/10 + "개");
		}

	}

}
