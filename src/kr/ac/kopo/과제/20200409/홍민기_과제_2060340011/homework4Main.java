package kr.ac.kopo.day02.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 4. 화면에서 하나의 정수를 입력 받고 정수를 나눌 수를 입력 받은 다음 몫과 나머지를 화면에 출력하시오
 * 정수를 입력하세요 : 10
 * 나눌 수를 입력하세요 : 7
 * 몫 : 1
 * 나머지 : 3
 * 
 */

public class homework4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int div; // 나누는 수를 미리 선언

		while(true) { // 나누는 수가 0이 아닐때까지 반복문 수행
			System.out.print("나눌 수를 입력하세요 : ");
			div = sc.nextInt();
			if(div != 0) { // 0이 아닌 수가 나왔을 때, 반복문 종료
				break;
			}
			System.out.println(div+"으로 나눌 수 없습니다!!");
		}
		
		System.out.println("몫 : "+num/div);
		System.out.println("나머지 : " +num%div);
	}

}
