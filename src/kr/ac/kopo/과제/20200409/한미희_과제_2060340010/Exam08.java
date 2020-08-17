package kr.ac.kopo.day2.assignment;

import java.util.Scanner;

public class Exam08 {
	
	public static void main(String[] args) {
		/* 8. 물건값과 지불할 돈의 액수를 입력받고, 
		거스름돈과 거스름돈의 1000원, 500원, 100원, 50원, 10원의 개수를 출력 */
		
		//물건값 입력 받기
		System.out.println("물건값을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		sc.nextLine();
		
		
		//지불할 돈의 액수 입력 받기
		System.out.println("지불할 돈의 액수를 입력하세요 : ");
		int money = sc.nextInt();
		sc.nextLine();
		
		//거스름돈 구하기
		int change = money - price;
		
		//거스름돈과 각 지폐 및 동전의 개수 출력
			//거스름돈이 양수라면
		if (change >= 0) {           
			//거스름돈이 양수라면
			System.out.println("거스름돈 : " + change + "원");
			System.out.println("1000원 : " + change/1000 + "개");
			System.out.println("500원 : " + (change%1000)/500 + "개");
			System.out.println("100원 : " + ((change%1000)%500)/100 + "개");
			System.out.println("50원 : " + (((change%1000)%500)%100)/50 + "개");
			System.out.println("10원 : " + ((((change%1000)%500)%100)%50)/10 + "개");
			}
		else {
			//거스름돈이 음수 즉, 물건값에 비해 지불한 돈의 액수가 적어 물건을 사지 못한다면
			System.out.println((-change) + "원이 부족합니다");
		}
		
	}

}
