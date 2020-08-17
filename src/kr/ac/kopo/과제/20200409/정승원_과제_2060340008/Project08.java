package kr.ac.kopo.day02.project;

import java.util.Scanner;

/**
 * 
 * @author tess
 *
9480원어치 물건을 사고 10000원을 지불했을 때의 거스름돈과 1000원, 500원, 100원, 50원, 10원의 개수를 출력하는 클래스 
 */
public class Project08 {
	
	public static void main(String[] args) {
		int[] changeArray = {1000, 500, 100, 50, 10}; // 정해진 거스름돈 단위를 배열로 저장해준다. 
		
		Scanner sc = new Scanner(System.in); // 입력을 받는다. 
		
		// 입력을 받을때 정수형으로 받는다. 
		System.out.print("물건값을 입력하세요 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		System.out.print("지불한 돈의 액수를 입력하세요 : ");
		int money = Integer.parseInt(sc.nextLine());
		
		int change = money - price; // 거스름돈 계산 
		
		if (change < 0) { // 지불할 금액이 부족한 경우 
			System.out.printf("%d원이 부족합니다.", -change);
		} else if (change == 0) { // 거스름돈이 없는 경우 
			System.out.println("거스름돈이 없습니다.");
		} else { // 거스름돈이 있는 경우 
			System.out.printf("거스름돈 : %d원\n", change);

//			방법1
			for (int coin : changeArray) { // 거스름돈 단위를 순회한다. 
				int cNumber = change / coin; // 몫이 개수 
				change %= coin; // 나머지가 더 거슬러 줘야하는 돈 
				System.out.printf("%d원 : %d개\n", coin, cNumber); // 요구사항에 맞춰 출력 
			}
			
// 			방법2
//			int idx = 0;
//			while (change >= 10) {
//				int currentChange = changeArray[idx++];
//				int cNumber = change / currentChange;
//				change %= currentChange;
//				System.out.printf("%d원 : %d개\n", currentChange, cNumber);
//			}
			
		}
		
		
	}

}
