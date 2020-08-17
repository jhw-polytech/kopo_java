package homework0413;

/*
 * 2060340017 신형재 과제 1번
 * 
 *임의의 10개 정수 입력
 *홀수 / 짝수 구분 및 출력
 *홀수 / 짝수 간 총합
 *
 */

import java.util.Scanner;

public class n1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 변수의 선언
		 * 짝수 / 홀수 변수는 총 합을 더하기 위해 설정
		 * 사용자 입력 반복문에서 매 총계 합산
		 */
		int num = 0;
		int[] numArr = new int[10];
		int 짝수 = 0;
		int[] 짝수Arr = new int[10];
		int 홀수 = 0;
		int[] 홀수Arr = new int[10];
		
		for(int i=1; i<=10; i++) {
		System.out.printf("%d's num ", i);
		numArr[i-1] = sc.nextInt();
		num=numArr[i-1];
		//numArr를 통해 입력되는 수의 배열을 중간 확인할 수 있음
		
		if(num%2==0) {
			짝수Arr[i-1] = num;
			짝수 = 짝수 + num;
			//짝수 총합 구하기, 해당 시점 입력된 num이 짝수면 변수 짝수에 더하기
		} else {
			홀수Arr[i-1] = num;
			홀수 = 홀수+num;
		}
		}
		
		/*
			만일 사용자가 0을 입력하면 워쩌요??? ^^
		*/
		System.out.println("<짝수>");
		for(int j : 짝수Arr) {
			if(j !=0 ) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
		System.out.println("짝수의 총합 : " + 짝수);
		System.out.println();
		
		System.out.println("<홀수>");
		for(int k : 홀수Arr) {
			if(k !=0) {
				System.out.print(k + " ");
			}
		}
		System.out.println();
		System.out.print("홀수의 총합 : " + 홀수);
	}

}
