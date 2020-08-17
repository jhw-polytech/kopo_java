package kr.ac.kopo.day05;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇개 구입할래? : ");
		int num = Integer.parseInt(sc.nextLine());
		//입력받은 ice 만큼 배열로 된 인스턴스객체 생성  
		Day05ExamIcecream[] ice = new Day05ExamIcecream[num];
		
		//아이스크림 정보 입력받음
		for(int i = 0; i < ice.length; i++) {
			//ice[i]에 icecream 인스턴스객체 생성
			ice[i] = new Day05ExamIcecream();
			System.out.println("*** "+ (i+1) + "번째 아이스크림 구매 정보 ***");
			System.out.print("아이스크림명 : ");
			ice[i].name = sc.nextLine();
			System.out.print("아이스크림가격 : ");
			ice[i].price = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println();
		System.out.println("< 총 " + num +"개의 아이스크림 구매 정보 출력>");
		System.out.println("번호\t 아이스크림명 \t 아이스크림가격");
		for(int i = 0; i < num; i++) {
			System.out.printf("%d\t %s\t\t %d\t\n", i+1 , ice[i].name, ice[i].price);
		}
	}

}
