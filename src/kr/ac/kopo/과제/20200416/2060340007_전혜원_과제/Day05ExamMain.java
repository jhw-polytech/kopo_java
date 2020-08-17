package kr.ac.kopo.day05;

import java.util.Scanner;

/*
 
 1. 다음의 결과를 보이는 프로그램을 작성하시오. 
 
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
	번호   아이스크림명   아이스크림가격
	1   	메로나 		 1000
	2   	월드콘 		 2000
	3   	비비빅   	  800 

*/

public class Day05ExamMain {	
	
	
	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
		
		//구입할 아이스크림의 갯수를 입력받음
		System.out.println("아이스크림을 몇개 구입할래? ");
		int amount = sc.nextInt();
		sc.nextLine();
		
		//각 객체의 주소값을 저장할 배열 생성
		Day05ExamIcecream arr[] = new Day05ExamIcecream[amount];
		
		//아이스크림 타입의 인스턴스 생성하여 배열에 저장(amount개)
		for(int i=0; i<amount; i++) {			
			arr[i] = new Day05ExamIcecream();
		}
		
		
		//배열에 차례대로 아이스크림 구매정보 입력받아 저장
		for(int i=0; i<amount; i++) {
			
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i+1);
			System.out.print("아이스크림명: ");
			arr[i].name = sc.nextLine();
			System.out.print("아이스크림가격: ");
			arr[i].price = sc.nextInt();
			sc.nextLine();
			
		}
		
		
		System.out.println("< 총 3개의 아이스크림 구매정보 출력 >");
		System.out.println("번호   아이스크림명   아이스크림가격");
		
		//아이스크림 구매정보 차례대로 출력
		for(int i=0; i<amount; i++) {
			System.out.printf("%2d\t%-3s\t%-3d\n", i+1, arr[i].name, arr[i].price);
		}
		
		sc.close();
		
		
	}

}
