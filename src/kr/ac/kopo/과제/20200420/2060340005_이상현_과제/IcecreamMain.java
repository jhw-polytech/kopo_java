package shlee1993.day07.homework;

import java.util.Scanner;

public class IcecreamMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IcecreamManagement iceM = new IcecreamManagement();	//아이스크림 관리를 위한 IcecreamManagement객체 생성

		System.out.println("판매 가능한 아이스크림 종류의 개수를 입력하세요");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < num; i++)	//입력받은 숫자만큼 아이스크림 정보 생성
			iceM.setIce();		

		System.out.println("판매 가능한 아이스크림 목록");	
		iceM.getAllInfo();
		
		IcecreamMarket market = new IcecreamMarket(iceM);	//iceM관리 객체의 구성품을 판매하는 마켓 생성
		market.sIce();	//판매시작
		
		sc.close();
	}

}
