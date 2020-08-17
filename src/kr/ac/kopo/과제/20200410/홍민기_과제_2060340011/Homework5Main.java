package kr.ac.kopo.day03.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 5. 다음의 설명을 보고 코드를 작성하세요.
 * 달팽이가 100M 깊이의 우물을 빠졌습니다
 * 달팽이는 1시간에 5M속도로 움직입니다
 * 올라온 높이가 50M미만일땐 1시간에 1M씩 미끌어지고
 * 50M이상일때 1시간에 2M씩 미끌어집니다
 * 달팽이가 총 몇시간만에 탈출하는지를 코드로 작성하세요.
 *
 * < 출력결과 >
 * [1시간후] 달팽이가 올라간 총 높이 : 4M
 * [2시간후] 달팽이가 올라간 총 높이 : 8M
 * ...
 * [XX시간후] 달팽이가 올라간 총 높이 : 100M or 101M or 102M
 * 
 */
public class Homework5Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("우물의 깊이를 입력 : ");
		
		int height = sc.nextInt();
		
		int snail = 0;
		
		int time = 0;
		
		while(true) {
			time++;
			snail+=5;
			if(snail>=height) {
				System.out.println("["+time+"시간]후 달팽이가 올라간 총 높이 : "+snail+"M"); // 달팽이가 우물을 넘어가기만 하면 되므로 break를 해준다.
				break;
			}
			if(snail<50) {
				snail-=1;
			}
			else {
				snail-=2;
			}
			System.out.println("["+time+"시간]후 달팽이가 올라간 총 높이 : "+snail+"M");
		}

	}
}
