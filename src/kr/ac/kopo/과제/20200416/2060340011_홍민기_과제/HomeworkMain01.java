package kr.ac.kopo.day05.homework;

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
 /*
	민기씨 과제 잘하셨어요.. 
	Icecream클래스에서 번호가 필요할지에 대해서는 생각을 해봅시다~~
	번호를 넣은 것이 잘못된 것이 아니라 실제 아이스크림에서 번호와 연관된 추상화를 생각해보자구요
 */
public class HomeworkMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("아이스크림을 몇개 구입할래? : ");
		int cnt = Integer.parseInt(sc.nextLine());
		
		IceCream[] ic = new IceCream[cnt]; // 입력한 cnt 개수만큼 배열 크기 지정
		// = kr.ac.kopo.day05.homework.IceCream[] ic = new kr.ac.kopo.day05.homework.IceCream[cnt];
		
		for(int i=0;i<cnt;i++) {
			ic[i]=new IceCream(); // 각 배열마다 icecream객체 인스턴스화
			
			System.out.println("*** "+(i+1)+"번째 아이스크림 구매정보 ***");
			ic[i].num = i+1;
			System.out.print("아이스크림명 : ");
			ic[i].name=sc.nextLine();
			System.out.print("아이스크림가격 : ");
			ic[i].price=sc.nextLine();
			System.out.println();
		}
		
		System.out.println("< 총 "+cnt+"개의 아이스크림 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		for(int i=0;i<cnt;i++) {
			System.out.println(ic[i].num+"\t"+ic[i].name+"\t\t"+ic[i].price);
		}
	}

}
