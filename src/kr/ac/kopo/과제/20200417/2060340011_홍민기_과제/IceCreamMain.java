package kr.ac.kopo.day06.homework;

import java.util.Scanner;

/* 
 * 2060340011 홍민기
 * 
 * 1. 다음의 결과를 보이는 프로그램을 작성하시오.
   아이스크림을 몇개 구입할래? 3 (입력)
 
   *** 1번째 아이스크림 구매정보 ***
   아이스크림명 : 메로나 (입력)
   아이스크림가격 : 1000 (입력)

   *** 2번째 아이스크림 구매정보 ***
   아이스크림명 : 월드콘 (입력)
   아이스크림가격 : 2000 (입력)

   *** 3번째 아이스크림 구매정보 ***
   아이스크림명 : 비비빅 (입력)
   아이스크림가격 : 800 (입력)

   < 총 3개의 아이스크림 구매정보 출력 >
   번호 아이스크림명 아이스크림가격
   1 메로나 1000
   2 월드콘 2000
   3 비비빅 800
 *
 */
public class IceCreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("아이스크림을 몇개 구입할래? : ");
		int cnt = Integer.parseInt(sc.nextLine());
		
		IceCream[] ic = new IceCream[cnt]; // 입력한 cnt 개수만큼 배열 크기 지정
		
		for(int i=0;i<cnt;i++) {
			System.out.println("*** "+(i+1)+"번째 아이스크림 구매정보 ***");
			System.out.print("아이스크림명 : ");
			String name = sc.nextLine();
			System.out.print("아이스크림가격 : ");
			String price = sc.nextLine();
			ic[i]=new IceCream(name,price); // 생성자를 이용하여 name, price를 저장하고 객체 생성

		}
		
		System.out.println("< 총 "+cnt+"개의 아이스크림 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for(int i=0;i<ic.length;i++) {
			System.out.print((i+1)+"\t");
			ic[i].print();
		}
		
	}

}
