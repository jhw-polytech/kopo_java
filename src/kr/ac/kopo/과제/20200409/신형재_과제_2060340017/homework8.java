package homework0409;

/*
 * 2060340017 신형재 과제 8번
 * 
 * 사용자에 의해 물품 가액 및 지불 금액 입력, 거스름돈 자동 산출 및 화폐단위 구분
 */

import java.util.Scanner;

public class homework8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건 값을 입력하세요 : ");
		int price = sc.nextInt();
		System.out.print("지불한 돈의 액수를 입력하세요 : ");
		int pay = sc.nextInt();	
		// 지불한 액수 뒤에 원을 붙이는 방법을 모르겠음
		
		int change = pay-price;
		System.out.print("거스름 돈 : ");
		if(change > 0) {
		System.out.print(change+" 원\n");
		}else {
			System.out.println("잘못된 입력입니다. 더 많은 돈을 지불하세요.");
		}
				
		int 만원 = change/10000;
		int 천원 = change%10000/1000;
		int 오백 = change&10000%1000/500;
		int 백 = change&10000%1000%500/100;
		int 오십 = change&10000%1000%500%100/50;
		int 십 = change&10000%1000%500%100%50/10;
		
		// 2번 과제와 동일하게, 해당 금액이 없는 경우 단위를 삭제하고자 넣었는데, 작동이 잘 안됨, 원인을 모르겠음
		if(만원 != 0) {
			System.out.printf("10,000원 : %d개", 만원);
		}
		if(천원 != 0) {
			System.out.printf("1,000원 : %d개", 천원);
		} 
		if(오백!=0) {
			System.out.printf("500원 : %d개", 오백);
		}
		if(백!=0) {
			System.out.printf("100원 : %d개", 백);
		}
		if(오십!=0) {
			System.out.printf("50원 : %d개", 오십);
		}
		if(십!=0) {
			System.out.printf("10원 : %d개", 십);
		}
	
}
}
