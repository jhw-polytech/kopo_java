package kr.ac.kopo.day02.exam;

import java.util.Scanner;

/*
	2. 3661초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오
	
	결과출력 : 1시간 1분 1초
	
	초를 입력하세요 : 3600	
	3600초 : 1시간 0분 0초  1시간
	
	초를 입력하세요 : 3610	
	3610초 : 1시간 0분 10초  1시간 10초
*/



public class Exam02 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 정수로 입력해 주세요.");
		int time = sc.nextInt();
		
		int h=time/3600;
		int m=(time%3600)/60;
		int s=(time%3600)%60;
		
		
		if (h != 0) {
			System.out.print(h + "시간  ");			
		}
		
		if (m != 0) {
			System.out.print(m + "분  ");			
		}
		
		if (s != 0) {
			System.out.print(s + "초  ");			
		}
		
		System.out.println("입니다.");
		
		sc.close();
	}

}
