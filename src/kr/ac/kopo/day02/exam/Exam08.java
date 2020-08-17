package kr.ac.kopo.day02.exam;

import java.util.Scanner;

/*
	8. 9480원어치 물건을 사고 10000원을 지불했을 때의 거스름돈과
	1000원, 500원, 100원, 50원, 10원의 개수를 출력하는 프로그램을 작성하시오.
	이때 물건값과 거스름돈은 키보드로 	입력할 수 있어야 한다.
	액수가 정해져 있는 것은 아님. 모든 경우가 되도록 작성할 것.
	
	
		(ex)
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

public class Exam08 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("얼마 어치의 물건을 구입하셨습니까?");
		int amount = sc.nextInt();
		System.out.println("지불한 돈이 얼마입니까?");
		int pay = sc.nextInt();
		
		
		if (pay<=amount) {
			System.out.println((amount-pay)+"원이 부족합니다.");
		} else if (pay<0 || amount<0) {
			System.out.println("마이너스 금액은 계산할 수 없습니다.");
		}
		
		int rest = pay - amount;
		
		System.out.println("거스름돈: "+rest+"원");
		System.out.println("1000원: "+ (rest/1000) +"개");
		System.out.println("500원: " + (rest%1000/500) + "개");
		System.out.println("100원: " + (rest%1000%500/100) + "개");
		System.out.println("50원: "  + (rest%1000%500%100/50) + "개");
		System.out.println("10원: "  + (rest%1000%500%100%50/10) + "개");
		
		
	}

}
