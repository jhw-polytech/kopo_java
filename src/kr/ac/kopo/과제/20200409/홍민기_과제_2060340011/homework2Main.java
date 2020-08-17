package kr.ac.kopo.day02.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 2. 3661초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오
 * 결과출력 : 1시간 1분 1초
 * 초를 입력하세요 : 3600
 * 3600초 : 1시간 0분 0초 -> 1시간
 * 초를 입력하세요 : 3610
 * 3610초 : 1시간 0분 10초 -> 1시간 10초
 * 
 */
public class homework2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력하세요 : ");
		int sec = Integer.parseInt(sc.nextLine());
		
		int hour = sec/3600; // 1시간은 3600초
		
		int minute = sec%3600/60; // 시간을 제외한 나머지 초로 분을 계산

		int second = sec%3600%60; // 시간과 분을 제외한 나머지 초
		
		System.out.print(sec+"초 : ");
		
		if(hour!=0) { // 시간이 있으면 시간 출력
			System.out.print(hour+"시간 ");
		}
		if(minute!=0) { // 분이 있으면 분 출력
			System.out.print(minute+"분 ");
		}
		if(second!=0) { // 초가 있으면 초 출력
			System.out.print(second+"초");
		}
		if(sec==0) { // 없어도 되는 부분... [0초 :   ] 가 허전해서 추가했습니다.
			System.out.print("0초");
		}
	}

}
