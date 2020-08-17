package shlee1993.day07.homework;

import java.util.Scanner;

public class IcecreamMarket {
	Scanner sc = new Scanner(System.in);
	private static int sellNum = 0;	//판매 아이스크림 수
	private static int customerNum = 0;	//소비자 수
	private static int total = 0;	//판매액
	IcecreamManagement m;	//판매할 아이스크림 관리 객체를 저장할 공간

	IcecreamMarket() {
	}

	IcecreamMarket(IcecreamManagement m) {	//지금은 매니지먼트 객체가 하나지만 여러개라면 골라서 가져올 수 있음
		System.out.println("판매를 시작합니다.");
		this.m = m;
	}

	public void sIce() {
		customerNum++;
		int iceNum = getInt("아이스크림 몇개 살래?");
		System.out.println("시리얼 넘버를 입력하세요 : ");
		m.getAllInfo();	//아이스크림 판매를 위해 소비자에게 정보 전달

		for (int i = 0; i < iceNum; i++) {
			int num = getInt(i + 1 + "번째 아이스크림 시리얼 번호 입력 : ");
			for (int j = 1; j < m.serialNum; j++) {
				if (num == m.iceArr[j].getSerial()) {	//시리얼번호로 판매 아이스크림을 찾음
					sellNum++;
					total += m.iceArr[j].getPrice();
				}
			}
		}

		String choose = getStr("더 살래? y/n 입력");
		if (choose.charAt(0) == 'y')
			sIce();
		else if (choose.charAt(0) == 'n')
			closeStore();
		else {
			System.out.println("y/n 값이 아니므로 자동 종료");
			closeStore();
		}
	}

	public void closeStore() {
		System.out.println("판매 아이스크림 수 : " + sellNum);
		System.out.println("소비자 수 : " + customerNum);
		System.out.println("판매액 : " + total);
	}

	public int getInt(String msg) {
		System.out.println(msg);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	public String getStr(String msg) {
		System.out.println(msg);
		String str = sc.nextLine();
		return str;
	}
}