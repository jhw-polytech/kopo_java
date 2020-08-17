package kr.ac.kopo.Assignment1;

import java.util.Scanner;

public class Assignment8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물건값을 입력하시오");
		int Item = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("지불한 돈의 액수를 입력하시오");
		int Money = sc.nextInt();
		sc.nextLine();
		
		if(Money > Item) {
			System.out.printf("1000원 : %d\n",((Money-Item)/1000));
			System.out.printf("500원   : %d\n",(((Money-Item)%1000)/500));
			System.out.printf("100원   : %d\n",((((Money-Item)%1000)%500)/100));
			System.out.printf("50원     : %d\n",(((((Money-Item)%1000)%500)%100)/50));
			System.out.printf("10원     : %d\n",((((((Money-Item)%1000)%500)%100)%50)/10));
			
		}
		else 
			System.out.printf("%d원 부족합니다",Math.abs(Item-Money));
		
	}
}

// if문을 통해 가격이 지불한 돈보다 가격이 더 크면 차이의 절대값을 반환하게함
// 지불한 돈이 더 많으면 거스름돈을 계산하기위해 각 단위의 나머지값을 활용함