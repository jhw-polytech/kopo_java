package jaeheehomework;

import java.util.Scanner;

public class IcecreamMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇개 구입할래? ");
		int num = Integer.parseInt(sc.nextLine());
		
		Icecream ice = new Icecream();
		ice.info(num);
		
	}
}
