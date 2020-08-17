package Homework_0409;

import java.util.Scanner;

// 2)3661초가 몇 시간 몇 분 몇 초인지 환산해서 출력하시오.

public class Test2 {

	/*
		은희씨. 이렇게 코드를 만들면 3609초는 0분이 나오지 않을까요??? 한번만 다시 생각해서 풀어봐주세요. ^^
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 스캐너로 입력받는다.
		System.out.print("초를 입력하세요 : ");
		int sec = sc.nextInt();

			if(sec>3600) {					// 1시간 보다 클 경우 시간, 분, 초가 모두 출력된다.
				System.out.println(sec/3600 +"시간"+ sec%3600/60 +"분" + sec%3600%60+"초");
				}
		
			if(sec%3600==0) {				// 시간 단위로 떨어질 경우
				System.out.println(sec/3600 +"시간");
					} else if(60<=sec && sec<3600){		// 1분보다 크고 1시간보다 작을 경우 분, 초가 출력된다.
				System.out.println(sec/60 +"분" + sec%60 + "초");
				} 
		
			if(sec<60) {					// 1분보다 작을 경우 초만 출력된다.
				System.out.println(sec+ "초");
			}
		}
	}
