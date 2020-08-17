package exam0416;

import java.util.Scanner;

public class IceCreamMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이스크림 몇 개 구매할래? ");
		
		int buyCnt = Integer.parseInt(sc.nextLine());
		IceCream[] iceArr = new IceCream[buyCnt];
		
		for (int i = 0; i < iceArr.length; i++) {
			iceArr[i] = new IceCream();
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i + 1);
			System.out.print("아이스크림명 : ");
			iceArr[i].name = sc.nextLine();
			
			System.out.print("아이스크림 가격 : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine());
		}
		sc.close();
		
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", iceArr.length);
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for (int i = 0; i < iceArr.length; i++) {
			System.out.printf("%d\t%s\t\t%d\n", i+1, iceArr[i].name, iceArr[i].price );
		}
	}
}
