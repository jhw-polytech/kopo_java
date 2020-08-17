package test0419;

import java.util.Scanner;

public class Icecream2 {
	
	int    num;
	String name;
	int    price;
	Icecream2[] iceArr;
	
	Scanner sc = new Scanner(System.in);
	Icecream2(){}
	
	Icecream2(String name, int price){
		this.name = name;
		this.price = price;
		
	}
	
	int getNum() {
		
		System.out.print("아이스크림 몇개 구입할래? ");
		num = sc.nextInt();
		sc.nextLine();
		return num;
		
	}
	
	
	String getName() {
		
		name = sc.nextLine();
		return name;
	}
	
	int getPrice() {
		
		
		price = sc.nextInt();
		sc.nextLine();
		return price;
		
		
	}
	
	void icecreamInfo() {
		
		iceArr = new Icecream2[num];
		
		
		for(int i = 0;i<num;i++) {
			
			System.out.println("***" + (i+1) + "번째 아이스크림 구매정보 ***");
			System.out.print("아이스크림명 : ");
			String name = getName();
			System.out.print("아이스크림가격 : ");
			int price = getPrice();
			
			iceArr[i] = new Icecream2(name, price);
		}
		
		print();
		
	}
	
	
	
	void print() {
		
		System.out.println("<총" + num + "개의 아이스크림 구매정보 출력>");
		
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		
		for(int i = 0;i<num;i++) {
			System.out.printf("%d\t%s\t%d\n", (i+1), iceArr[i].name, iceArr[i].price);
			
		}
		
		
	}
	

}
