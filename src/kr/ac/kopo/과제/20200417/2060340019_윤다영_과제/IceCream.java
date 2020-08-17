package kr.ac.kopo.assignment.day06;

import java.util.Scanner;

public class IceCream {
	
	
	String name;
	int price;
	Scanner sc = new Scanner(System.in);
	
	//아이스크림 속성 입력 받는 메소드
	IceCream[] iceCreamInput(int i) {
		
		IceCream[] iceArr = new IceCream[i];
		
		for(int a = 0; a < i; a++) {
			iceArr[a] = new IceCream();
			
			System.out.printf("*** %d번째 아이스크림 구매 정보 ***\n", a+1);
			
			System.out.print("아이스크림명 : ");			
			iceArr[a].name = sc.nextLine();
			
			System.out.print("아이스크림가격 : ");
			iceArr[a].price = sc.nextInt();
			sc.nextLine();					
		}
		return iceArr;
	}
	
	
	//아이스크림 출력 메소드
	void iceCreamOutput(int num, IceCream[] iceArr) {
		System.out.printf("< 총 %d개의 아이스크림 구매 정보 출력 >\n", num);
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for(int i = 0; i < num; i++) {
			System.out.printf("%d\t%s\t\t%7d\n", i+1, iceArr[i].name, iceArr[i].price); //가운데 정렬을 위해 %7s
		}
	}
	

}
