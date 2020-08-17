package kr.ac.kopo.assignment.day05;

import java.util.Scanner;

public class IceCreamMain {
	/*
	NO.1 
	 아이스크림 수량과 구매 정보를 입력받아, 
	 총 n개 아이스크림의 구매 정보를 출력하는 프로그램을 작성하시오
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이스크림을 몇 개 구입할래? ");
		int num = sc.nextInt();
		sc.nextLine();
		
		/*
			다영씨 과제 잘하셨어요~~
			근데 아이스크림객체 배열 이름이 왜 str이에요??? 궁금하네요~~ ^^
		*/
		IceCream[] str = new IceCream[num];	
	
		
		for(int i = 0; i < str.length; i++) {
			str[i] = new IceCream();
			
			System.out.printf("*** %d번째 아이스크림 구매 정보 ***\n", i+1);
			
			System.out.print("아이스크림명 : ");			
			str[i].name = sc.nextLine();
			
			System.out.print("아이스크림가격 : ");
			str[i].price = sc.nextLine();			
		}
		
		System.out.printf("< 총 %d개의 아이스크림 구매 정보 출력 >\n", num);
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for(int i = 0; i < num; i++) {
			System.out.printf("%d\t%s\t\t%7s\n", i+1, str[i].name, str[i].price); //가운데 정렬을 위해 %7s
		}
		
		
		
	

	}
	
	

}
