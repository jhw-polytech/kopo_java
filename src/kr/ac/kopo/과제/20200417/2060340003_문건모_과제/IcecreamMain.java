package test0418;

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

import java.util.Scanner;

public class IcecreamMain {
	
	public static void main(String[] args) {
		
		System.out.print("아이스크림을 몇개 구입할래? ");
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		Icecream ice = new Icecream();
		
		ice.icecreamInfo(num);
		
		
		
		
	}

}
