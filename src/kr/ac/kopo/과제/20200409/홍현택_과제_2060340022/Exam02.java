package kr.co.hana.homework01;

import java.util.Scanner;

public class Exam02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력하세요 : ");
		int num = sc.nextInt();		
				
		int hour = num/3600;
		int min = (num%3600)/60;
		int sec = (num%3600)%60;
		      
		if(hour != 0) {
		System.out.print(hour +"시간 ");
		} 
		if(min != 0) {
			System.out.print(min +"분 ");
		}
		if(sec != 0) {
			System.out.print(sec + "초");
		}
	}
}


		/* 
		1. Scanner 사용해서 입력값 받기
		2. 먼저 1시간 0분 0초로 코드 짜기
			- x/3600 => 몫 = a(시간) , 나머지 = b
			- b/60 => 몫 = c(분), 나머지 = d(초)
		3. 입력값에 따라 나오는 0분, 0초 등 없애기  
			- if문으로 정수값만 출력(num != 0)
		*/

