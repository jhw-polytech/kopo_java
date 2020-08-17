package kr.ac.jinwoo.day05.homework;

import java.util.Scanner;

public class IcecreamMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("아이스크림을 몇개 구입할래? ");
		
		Icecream[] iceArr = new Icecream[Integer.parseInt(sc.nextLine())];
		System.out.println();
		
		for(int i = 0; i < iceArr.length; i++) {
			
			iceArr[i] = new Icecream();
			
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 ***");
			System.out.printf("아이스크림명 : ");
			iceArr[i].name = sc.nextLine();
			System.out.printf("아이스크림가격 : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine());
			System.out.println();
		}
		sc.close();
		
		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", iceArr.length);
		System.out.println("번호\t 아이스크림명\t 아이스크림가격");
		
		for(int i =0; i < iceArr.length; i++) 
			System.out.println((i+1) + "\t " + iceArr[i].name + "\t\t    " + iceArr[i].price);
	}
}
