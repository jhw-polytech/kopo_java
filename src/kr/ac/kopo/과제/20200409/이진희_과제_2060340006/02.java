package day0409;

import java.util.Scanner;

/*3661초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오.
 * 초를 입력하세요:
 * 3600초: 
 */
public class task2 {

	public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
		int time = 3661; // time에는 초가 저장 
		int hour = time/3600; //hour에는 시간을 저장
		int minute = (time%3600) /60; // minute에는 분을 저장
		int second = time%60;  // second에는 초를 저장
		
		System.out.print("초를 입력하세요:"  );
		int time1 = sc.nextInt(); //시간 삽입, 다음 행으로
		
		System.out.println("결과출력:"+ hour+"시간"+minute+"분"+second+" 초 "); //시간,분,초 출력 

 }
}
