package exam0417;

import java.util.Scanner;

public class IceCreamMain {
	
	public static void main(String[] args) {

		IceCream icy = new IceCream();
		System.out.println("아이스크림 몇 개 구매할래 ? ");
		Scanner sc = new Scanner(System.in);
		int buyCnt = Integer.parseInt(sc.nextLine());
		icy.buyIceCream(buyCnt);
		sc.close();
	}
}
