package kr.ac.yeongnam.day06.homework;

import java.util.Scanner;

public class IcecreamMarket {
	
	Icecream[] iceArr;
	Scanner sc;
	public int getCount() {
		
		sc = new Scanner(System.in);
		System.out.print("아이스크림을 몇개 구입하시겠습니까? : ");
		
		int count = sc.nextInt();
		sc.nextLine();		
		
		return count;
	}
	
	public int getPrice() {
		
		sc = new Scanner(System.in);
		System.out.print("아이스크림 가격 : ");
		
		int price = sc.nextInt();
		sc.nextLine();		

		return price;
	}
	
	public String getName() {
		
		sc = new Scanner(System.in);
		System.out.print("아이스크림명 : ");
		
		String name = sc.nextLine();
		
		return name;
	}
		
	
	public void buy() {
		
		int count = getCount();
		iceArr = new Icecream[count];
		
		for(int i = 0; i < iceArr.length; i++) {
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매 정보 ***");
			String name = getName();
			int price = getPrice();
			
			iceArr[i] = new Icecream(name, price);
		}	
		
	}
	
	public void print() {
		 System.out.println("< 총 " + iceArr.length + "개의 아이스크림 구매정보 출력 >");
		  
		 System.out.println("번호\t아이스크림명\t가격");
		 for(int i = 0; i < iceArr.length; i++) { 
			 System.out.printf("%3d\t%-10s\t%5d\n", i, iceArr[i].name, iceArr[i].price); 
				 
		 }
		 
	}	

}
