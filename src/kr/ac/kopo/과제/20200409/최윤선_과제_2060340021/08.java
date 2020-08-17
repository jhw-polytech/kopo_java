package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
				Scanner sc = new Scanner(System.in);
		System.out.println("물건값을 입력하세요 : ");
		int cost = sc.nextInt();
		sc.nextLine();
		
		System.out.println("지불한돈을 입력하세요 : ");
		int pay = sc.nextInt();
		sc.nextLine();
		
		int after;
		
		if(cost>pay) {
			System.out.println( cost-pay+"원이 부족합니다.");
		}
		else {
			after = pay-cost ;
			System.out.println("거스름돈 : "+after+"원");
			System.out.println("1000원 : "+ (after/1000)+ "개"); //1000원 개수 구하기
			after = after%1000; //위에서 구한 갯수만큼 빼기
			System.out.println("500원 : "+ (after/500)+ "개");
			after = after%500;
			System.out.println("100원 : "+ (after/100)+ "개"); //100원 개수 구하기
			after = after%100; //위에서 구한 갯수만큼 빼기
			System.out.println("50원 : "+ (after/50)+ "개");
			after = after%50;
			System.out.println("10원 : "+ (after/10)+ "개");
		}
		
		
	}
}