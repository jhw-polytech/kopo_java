package kr.ac.kopo.day07.exam;

import java.util.Scanner;

public class IcecreamFailed {

	private static int totalAmount = 0;
	private static int totalPrice = 0;
	public static String[] name= new String[100];
	public static int[] price = new int[100];

	Scanner sc = new Scanner(System.in);

	// 생성자
	public IcecreamFailed() {
		IcecreamFailed.totalAmount++;
	}

	// 아이스크림 구매 여부를 물어보는 메소드
	public void posCounter() {
		int amount = 0;

		while (true) {
			System.out.println("아이스크림 몇개 구입할래?");
			amount = sc.nextInt();
			sc.nextLine();
			inputInfo(amount);
			IcecreamFailed.totalAmount += amount;

			System.out.println("계속구매할래?(Y/N) => ");
			String order = sc.nextLine();

			if (order != "N" && order != "Y") {
				System.out.println("Y와 N만 입력할 수 있습니다.");
			} else if (order == "N") {
				sc.close();
				break;
			}
		}
	}

	// 구매하려는 아이스크림 정보를 받는 메소드
	public void inputInfo(int amount) {
		
		for (int i = 0; i < amount; i++) {
			
			System.out.println((i + 1) + "번");
			
			System.out.println("아이스크림명: ");
			String l = sc.nextLine();
			
			System.out.println("아이스크림 가격: ");
			int k = sc.nextInt();
//			sc.nextLine();
			System.out.println();
			
			
			IcecreamFailed.totalPrice += price[amount + i];
		}
	}

	// static 변수를 반환하는 메소드
	public static void result() {
		System.out.println("판매된 아이스크림 총개수 : " + totalAmount + "개");
		System.out.println("총 판매액 : " + totalPrice);
	}

}
