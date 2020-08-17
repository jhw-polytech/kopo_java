package day0409;

import java.util.Scanner;

/*
 * 9,480원어치 물건을 사고 10,000원을 지불했을 때의 거스름돈과 1,000원, 500원, 100원, 50원,10원의 개수를 출력하는 프로그램을 작성하시오. 
 * 이때 물건값과 거스름돈은 키보드로 입력할 수 있어야 한다. 액수가 정해져 있는 것은 아님. 모든 경우가 되도록 작성할 것. 
 * 물건 값을 입력하세요: 
 * 지불한 돈의 액수를 입력하세요:
 * 거스름돈:
 * 1,000원: n개
 * 500원: m개
 * 100원:
 * 50원
 * 10원
 */
//char c= inputStr.charAt(0); 문자열 중에서 가장 첫번째 글자를 가져오는 
//거스름돈에서 가장 첫번째 열을 써주면 1000원 몇개인지
//두번째 열을 써주면 500이 몇개인지
//세번째 열을 써주면 100이 몇개인지
//네번째 열을 써주면 50이 몇개인지
//5번째 열을 써주며 10이 몇개인지 
//더 고민하기 
 public class task8 {
    public static void main(String []args) {
		
       Scanner sc1 = new Scanner(System.in);
		System.out.println("물건값을 입력하세요 : ");
		int price = sc1.nextInt();
		
	   Scanner sc2 = new Scanner(System.in);
		System.out.println("지불한 돈의 액수를 입력하세요 : ");
		int pay = sc2.nextInt();
		
	int change = pay - price;    // 거스름돈: 지불한 돈-가격   

		   
		if(change > 0) {                   //거스름돈이 >0 , <0인 경우 두가지를 나누어 생각
			
		System.out.println("거스름돈 : " + change + " 원");
			
		int money1000 = change / 1000;
		System.out.println("1000원 : " + money1000 + "개");
			
		int money500 = (change % 500) / 100;
		System.out.println("500원 : " + money500 + "개");
			
		int money100 = (change % 500) / 100;
		System.out.println("100원 : " + money100 + "개");
			
		int money50 = (change % 100) / 50;
		System.out.println("50원 : " +money50+ "개");
			
		int money10 = (change % 50) / 10;
		System.out.println("10원 : " + money10 + "개");
			
			
	    } else if(change < 0) {
			System.out.println(-change + " 원이 부족합니다");
	 }
 }

}