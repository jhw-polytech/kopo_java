package kr.co.hana.homework05;

import java.util.Scanner;

// 계속 오류남. 다시해보기
/*
	현택씨... main() 에 있는 sc.close() 메소드 주석처리해주세요
	그러면 에러 안날껍니다...
	기본입력장치를 종료해서... 클래스에서 입력을 못받는거에요....
*/
public class IceCream {

	String name;
	int price;

	Scanner sc = new Scanner(System.in);

	IceCream[] cntInput(int cnt) {
		IceCream[] iceArr = new IceCream[cnt];
		
		for (int i = 0; i < cnt; i++) {
			iceArr[i] = new IceCream();

			System.out.println("아이스크림 명: ");
			iceArr[i].name = sc.next();

			System.out.println("아이스크림 가격: ");
			iceArr[i].price = sc.nextInt();
			sc.nextLine();
		}
		return iceArr;
	}
	
	void IceCreamOutput(IceCream[] iceArr, int cnt) {
		System.out.printf("<총 %d개의 아이스크림 구매정보 출력>\n", cnt);
		System.out.println("번호	아이스크림명	아이스크림가격");
		
		for (int j = 0; j < cnt; j++) {
			System.out.println((j + 1) + "\t" + iceArr[j].name + "\t\t" + iceArr[j].price);
		}
		sc.close();
	}

}
