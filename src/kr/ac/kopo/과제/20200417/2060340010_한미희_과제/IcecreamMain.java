package kr.ac.kopo.day6.assignment;

import java.util.Scanner;

public class IcecreamMain {

	public static void main(String[] args) {
		
		/*	다음의 결과를 보이는 프로그램을 작성하시오. 
		
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
		번호    아이스크림명    아이스크림가격    
		1	메로나		1000    
		2	월드콘		2000    
		3	비비빅		800 
	 */

			//구입할 아이스크림의 개수 입력받기
			System.out.print("아이스크림을 몇개 구입할래? ");
			Scanner sc = new Scanner(System.in);
			int count = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			//아이스크림 이름과 가격을 멤버변수로 갖는 Icecream클래스 이용하여 생성한 객체 count개를 담을 배열 생성
			Icecream[] iceArr = new Icecream[count];	
			
			//Icecream객체를 생성하여 배열에 담은 뒤 각각에 대해 이름과 가격 입력받기
			for(int i = 0; i < count; i++) {
				System.out.println("*** "+ (i+1) + "번째 아이스크림 구매정보 ***");
				//이름 입력받기
				System.out.print("아이스크림명 : ");
				String name = sc.nextLine();
				//가격 입력받기
				System.out.print("아이스크림가격 : ");
				int price = sc.nextInt();
				sc.nextLine();
				//생성자 호출하여 입력받은 이름과 가격 대입하기
				iceArr[i] = new Icecream(name, price, i+1);
				System.out.println();
			}
			
			//구매정보 출력 - 각각의 아이스크림 구매정보는 purchaseInformation메소드 사용
			System.out.println("< 총 "+ count + "개의 아이스크림 구매정보 출력 >");
			System.out.printf("%-5s%-10s%-10s\n", "번호", "아이스크림명", "아이스크림가격");
			for(int i = 0; i < count; i++) {
				iceArr[i].purchaseInformation();
			}
			
			
			
	}
}
		
		
	
