package homework0410;

/*
 * 2060340017 신형재 과제 1번
 * 
 * 입력되는 정수 3개를 크기 순으로 출력하는 문장
 * if문을 통해 경우의 수 3가지(1, 2, 3번째가 가장 큰 수일때)와
 * 세부 경우의 수 (ex. 1번 숫자가 가장 크고 2, 3번 순서일때 vs 1번 숫자가 가장 크고 3, 2번 순서일때)로
 * 나누어서 작성
 * 
 * (for문으로 가능할까 싶어 고민해봤지만 잘 모르겠습니다.)
 *  ==>
	for문을 사용하려면 배열을 사용해야겠지요~~ ^^
	변수를 사용하면 조금 더 줄일 수 있을 거 같아요
 */

import java.util.Scanner;

public class n1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 정수 입력 : ");
		int num3 = sc.nextInt();
		
		if((num1<=num2)&&(num2<=num3)) {
			System.out.print(num3);
			if(num1<num2) {
				System.out.print(num2);
				System.out.print(num1);	
			}
		}else if((num1<=num2)&&(num3<=num2)) {
			System.out.print(num2);
			if(num1<num3) {
				System.out.print(num3);
				System.out.print(num1);
			}
		} else {
			System.out.print(num1);
			if(num2<num3) {
				System.out.print(num3);
				System.out.print(num2);
			}else {
				System.out.print(num2);
				System.out.print(num3);
			}
		}
	}
}
