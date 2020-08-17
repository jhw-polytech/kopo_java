package jaeheehomework;

import java.util.Scanner;

public class Homework3_1 {
	/*
	 1. 10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오.
		
		1's num : 12
		2's num : 5
		3's num : 8
		4's num : 30
		5's num : 22
		6's num : 87
		7's num : 9
		8's num : 4
		9's num : 15
		10's num : 22

		< 짝수 >
		12 8 30 22 4 22
		짝수의 총합 : XXX
		
		< 홀수 >
		5 87 9 15
		홀수의 총합 : XXX
	 */
	public static void main(String[] args) {
		
		// for문을 이용해 숫자 받고, array1이라는 배열에 숫자 담기
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[10]; 
		
		for(int i = 0; i < array1.length; i++) {
			
			System.out.printf("%d's num : ", i+1);
			array1[i] = sc.nextInt();
		}
		
		//짝수, 홀수를 모아둘 배열 만들기
		int[] arrayOdd = new int[array1.length];
		int[] arrayEven = new int[array1.length];
		
		//짝수, 홀수 합을 대입할 변수 만들기
		int sumOdd = 0;
		int sumEven = 0;
		
		// 짝수와 홀수를 각각 다른 배열로 분리. 조건이 만족하지 않는 인덱스에는 default에는 0이 들어갈 것임?
		for(int i = 0; i < 10; i++) {
			if(array1[i] % 2 == 0) {
				arrayEven[i] = array1[i];
			}else {
				arrayOdd[i] = array1[i];
			}
		}

		/*
			재희씨 만일 사용자가 0을 입력하면 어떻게요??
			그리고 만일 100개 입력받는다하면 약간 이 코드는 비효율적일 거 같아요
			100개중에 짝수 99개 홀수 1개여도 200번의 반복문을 수행할 거 같거든요
			다시한번 생각해봅시다
		*/
		
		System.out.println("\n< 짝수 >");
		// 초기값으로 설정된 0을 제외하고 출력
		for(int i = 0; i < arrayEven.length; i++) {
			if(arrayEven[i] != 0) {
				System.out.print(arrayEven[i] + " ");
				sumEven += arrayEven[i];    //배열의 값을 더해줌
			}
		}
		System.out.println("");
		System.out.printf("짝수의 총 합 : %d\n", sumEven);
		
		
		
		//같은 방법으로 홀수도 진행
		
		System.out.println("\n< 홀수 >");
		
		for(int i = 0; i < arrayOdd.length; i++) {
			if(arrayOdd[i] != 0) {
				System.out.print(arrayOdd[i] + " ");
				sumOdd += arrayOdd[i];    //배열의 값을 더해줌
			}
		}
		System.out.println("");
		System.out.printf("홀수의 총 합 : %d", sumOdd);
		
	}
}
