package homework0410;

/*
 * 2060340017 신형재 과제 2번
 * 
 * 입력되는 정수 4개를 크기 순으로 출력하는 문장
 * if문을 통해 경우의 수 를 만들어보고자 하였으나, 너무 많은 경우의수 발생
 * for문으로 문제를 작성하고자 시도, 매 정수 입력 시 변수 최신화를 통해 문제 해결
 * 
 * 
 */

import java.util.Scanner;

public class n2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 예외값 발생으로 무의미한 코드 (for문을 이용하여 입력 즉시 비교, 값을 최신화한다.)
//		System.out.print("첫 번째 정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두 번째 정수 입력 : ");
//		int num2 = sc.nextInt();
//		System.out.print("세 번째 정수 입력 : ");
//		int num3 = sc.nextInt();
//		System.out.print("네 번째 정수 입력 : ");
//		int num4 = sc.nextInt();
		
		
//		if((num1<=num2)&&(num2<=num3)&&(num3<=num4)) {
//			System.out.println(num4);
//		} else if((num1<=num2)&&(num2<=num3)&&(num4<=num3)) {
//			System.out.println(num3);
//		} else if((num1<=num2)&&(num3<=num2)&&(num4<=num2)) {
//			System.out.println(num2);
//		}  else if((num2<=num1)&&(num3<=num1)&&(num4<=num1)) {
//			System.out.println(num1);
//		}
		
		// 변수 2개 설정(num, nnum), 최초 변수 num보다 더 큰 정수가 nnum에 입력될 경우
		// nnum값을 num에 최신화
		int num = 0;
		int nnum;
		
		for(int i = 1; i<=4; i++) {
			System.out.print(i+"번째 정수를 입력하세요 : ");
			nnum = sc.nextInt();
			
			if(num<=nnum) {
				num=nnum;
				//중간 확인을 위해 num 변수가 최신화 되는 부분 확인
//				System.out.println("num 변수 최신화 참고용 : "+ num);
			}
		}
		System.out.print("가장 큰 수 : " + num);
	}
}
