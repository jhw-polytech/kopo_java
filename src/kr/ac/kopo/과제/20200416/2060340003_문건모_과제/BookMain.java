package test0416;

/*
 다음의 결과를 보이는 프로그램을 작성하시오.
 
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
 */

 /*
	건모씨 과제 잘하셨어요..
	근데 아이스크림인데 왜 Book으로 만들었어요??? 궁금해요~~
 */


import java.util.Scanner;

public class BookMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("아이스크림을 몇개 구입할래?  : ");
		int cnt = sc.nextInt();
		sc.nextLine();
		
		
		Book[] bkArr = new Book[cnt]; //입력되는 수만큼 bkArr의 length를 설정
		
		for(int i = 0;i<cnt;i++) {
			
			Book bk = new Book(); // bk 초기화 
			System.out.println("***" + (i+1) + "번째 아이스크림 구매정보***");
			System.out.print("아이스크림 명 :");
			bk.name = sc.next();
			
			System.out.print("아이스크림 가격 :");
			bk.price = sc.nextInt();
			
			bkArr[i] = bk; //bkArr에 bk 할당
			
		}
			 
		System.out.println("총" + cnt + "개의 아이스크림 구매 정보 출력");
		System.out.println("번호 아이스크림명 아이스크림가격");
		
		for(int i = 0;i<cnt;i++) {
			
			System.out.println((i+1)+ "   " + bkArr[i].name +"   " + bkArr[i].price); //bkArr에 있는 각각의 이름과 가격을 불러옴
		}
		
		
	}
	
}

			
			
			
		
		
		
		
