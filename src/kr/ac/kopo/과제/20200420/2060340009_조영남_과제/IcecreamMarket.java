package kr.ac.yeongnam.day07.homework;

import java.util.Scanner;

public class IcecreamMarket {
	
	private Icecream[] iceArr;
	private Scanner sc;
	
	// 객체의 연산 결과를 누적하기 위해 static 변수 선언
	static int customer;
	static int iceTotalCnt;
	static int iceTotalSum;
	
	/**
	 * 구입 개수를 입력받는 메소드
	 * @return
	 */
	public int getCount() {
		
		sc = new Scanner(System.in);
		System.out.print("아이스크림을 몇개 구입하시겠습니까? : ");
		
		int count = sc.nextInt();
		sc.nextLine();		
		
		return count;
	}
	
	/**
	 * 가격을 입력받는 메소드
	 * @return
	 */
	public int getPrice() {
		
		sc = new Scanner(System.in);
		System.out.print("아이스크림 가격 : ");
		
		int price = sc.nextInt();
		sc.nextLine();		

		return price;
	}
	
	/**
	 * 아이스크림명을 입력받는 메소드
	 * @return
	 */
	public String getName() {
		
		sc = new Scanner(System.in);
		System.out.print("아이스크림명 : ");
		
		String name = sc.nextLine();
		
		return name;
	}
		
	/**
	 * 구매 진행 메소드
	 */
	public void buy() {	
		
		String yesNo = "Y";
		
		while(yesNo.equals("Y") || yesNo.equals("y")) { // Y 또는 y를 입력하면, 반복한다.
			
			IcecreamMarket.customer++;
			int count = getCount();
			IcecreamMarket.iceTotalCnt += count;
			iceArr = new Icecream[count];
			
			for(int i = 0; i < iceArr.length; i++) {
				System.out.println("*** " + (i+1) + "번째 아이스크림 구매 정보 ***");
				String name = getName();
				int price = getPrice();
				IcecreamMarket.iceTotalSum += price;
				
				iceArr[i] = new Icecream(name, price);
			}			
			
			sc = new Scanner(System.in);
			System.out.println();
			System.out.print("계속 구매하시겠습니까?(Y/N) : ");
			yesNo = sc.nextLine();			
		}
		
		System.out.println();
		printTotal();
	}
	
	/**
	 * 전체 구매 내역을 보기위한 메소드
	 */
	public void printTotal() {
		System.out.println("총 " + IcecreamMarket.customer + "명의 고객이 아이스크림을 구매했습니다.");
		System.out.println("판매된 아이스크림 총 개수 : " + IcecreamMarket.iceTotalCnt);
		System.out.println("총 판매액 : " + IcecreamMarket.iceTotalSum);
	}
	
	/*
	public void print() {
		 System.out.println("< 총 " + iceArr.length + "개의 아이스크림 구매정보 출력 >");
		  
		 System.out.println("번호\t아이스크림명\t가격");
		 for(int i = 0; i < iceArr.length; i++) { 
			 System.out.printf("%3d\t%-10s\t%5d\n", i, iceArr[i].name, iceArr[i].price); 
				 
		 }
		 
	}	
	*/

}
