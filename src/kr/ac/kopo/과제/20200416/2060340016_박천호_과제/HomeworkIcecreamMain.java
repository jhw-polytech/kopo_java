package kr.co.ch.day05.homework;

import java.util.Scanner;

// 실행클래스
public class HomeworkIcecreamMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림을 몇개 구입 할래?");
		int EA = sc.nextInt();
		sc.nextLine();
		
		HomeworkIcecream[] str = new HomeworkIcecream[EA]; //str배열을 만들기 입력받은 EA개 크기로
		
		for(int i = 0; i < EA; i++) {
			
			str[i] = new HomeworkIcecream();  //HomeworkIcecream 클래스 불러옴
			
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매 정보 ***");
			
			System.out.print("아이스크림 명 : "); 
			
			str[i].productName = sc.nextLine(); //아이스크림명 저장
			
			System.out.print("아이스크림 가격 : ");
			
			str[i].productPrice = sc.nextLine(); //아이스크림 가격 저장
			
		}
		
		System.out.println("< 총 " + EA + "개의 아이스크림 구매정보 출력 >");
		System.out.println("번호\t 아이스크림명\t 아이스크림가격\t");
		for(int i = 0; i < str.length; i++) {
			System.out.printf("%2d\t %5s\t\t %7s\t\n", (i+1), str[i].productName, str[i].productPrice);
		//%d 정수 %s 문자열 %c 문자 %f 실수	
		// 정렬리 생각보다 쉽지 않네요...!
		/*
			=> 답변
			   잘하고 있어요... format문자는 수업시간에 한번 다시 설명해볼게요 
			   그리고 클래스명은 Homework이라는 명을 붙여도 되지만 그냥 Icecream이라고 이름을 붙이는 것이 더 좋을거 같아요
			   과제 잘하고 있습니다. 계속 잘해주세요!!! ^^
		*/
		}
		
	}

}
