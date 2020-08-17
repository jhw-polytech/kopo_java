package kr.ac.kopo.day07.exam;

import java.util.Scanner;


/*
	(질문)
	일단 가이드라인대로 클래스를 Icecream / Main / Market 로 나누어 만들었지만,
	사실 Icecream 클래스가 어떤 역할을 하는지 잘 이해하지 못했습니다.
	(제가 작성한 Market 코드와 연결되어 있지 않습니다.)
	가능하시다면 이 부분 설명 부탁드려도 될까요..?

	Icecream클래스는 실제 판매되는 아이스크림의 정보를 기억하기 위한 클래스로 설계되어있어요
	IcecreamMarket은 손님에게 Icecream 객체를 판매를 하는 클래스이구요...
	그래서 IcecreamMarket에 있는 order() 메소드에서

	public void order(int amount) {

		for(int i=0; i<amount; i++) {			
			System.out.println("아이스크림 이름: ");
			String name = sc.nextLine();
			
			System.out.println("아이스크림 가격: ");
			int price = sc.nextInt();
			sc.nextLine();
			
			// 주문내용 장부에 입력
			//entryIntoBooks(name, price);
			Icecream ice = new Icecream(name, price);
			entryIntoBooks(ice);

			이렇게 만드는 것이 더 좋을거 같습니다~~~
		}
	}
*/

public class IcecreamMarket {

	private static int customerSum = 0;
	private static int priceSum = 0;
	private static int amountSum = 0;

	String[] names = new String[100];

	Scanner sc = new Scanner(System.in);
	

	
	// 영업활동 메소드
	public void open() {
		
		loop: // 더 이상 구매고객이 없을 시 영업종료를 위한 루프명
		while(true) {
			//손님 입장
			IcecreamMarket.customerSum++;

			System.out.println("아이스크림 몇개 구매할래?");
			int amount = sc.nextInt();
			sc.nextLine();
			
			// 주문 메소드 실행
			order(amount);
						
			// 추가손님 받기			
			while(true) {
				System.out.println("더 구매할래? (Y/N) => ");
				String answer = sc.nextLine();
				
				if(answer.equals("N") || answer.equals("n")) {
					break loop;
				} else if (answer.charAt(0) != 'Y' && answer.charAt(0) != 'y') {
					System.out.println("N 또는 Y 로만 대답할 수 있습니다.");
				} else {
					break;
				}
			}
			
		}
		
		
	}
	
	
	// 주문받는 메소드
	public void order(int amount) {

		for(int i=0; i<amount; i++) {			
			System.out.println("아이스크림 이름: ");
			String name = sc.nextLine();
			
			System.out.println("아이스크림 가격: ");
			int price = sc.nextInt();
			sc.nextLine();
			
			// 주문내용 장부에 입력
			entryIntoBooks(name, price);
		}
	}

	
	// 장부입력 메소드
	public void entryIntoBooks(String name, int price) {
		names[IcecreamMarket.amountSum] = name;
		IcecreamMarket.priceSum += price;
		IcecreamMarket.amountSum++;
	}
	

	// 영업마감 메소드
	public void close() {

		System.out.println("영업이 종료되었습니다.");
		System.out.printf("총 %d 명의 고객이 아이스크림을 구매했습니다.\n", IcecreamMarket.customerSum);
		System.out.printf("판매된 아이스크림 총 개수 : %d\n", IcecreamMarket.amountSum);
		System.out.printf("총 판매액: %d", IcecreamMarket.priceSum);

	}

}
