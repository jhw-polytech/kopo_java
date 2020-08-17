package kr.co.hana.homework05;

import java.util.Scanner;

public class IceCreamMain {
	public static void main(String[] args) {

		IceCream ice = new IceCream();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이스크림을 몇개 구입할래? ");
		int cnt = sc.nextInt();
		sc.close();
		
		IceCream[] iceArr = new IceCream[cnt];
		iceArr = ice.cntInput(cnt);
		
		ice.IceCreamOutput(iceArr, cnt);

	}
}

