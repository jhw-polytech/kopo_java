package kr.ac.jinwoo.day04.homework;

import java.util.Scanner;

/*
	10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오.
	
	< 짝수 >
	12 8 30 22 4 22
	짝수의 총합 : XXX
	
	< 홀수 >
	5 87 9 15
	홀수의 총합 : XXX

 */

 /*
     이번 과제는 다른 분들에 비해 전체적으로 굉장히 코드가 길어진 것 같습니다.
	 
	 for문 while문 사용법이 문제인가 싶습니다.
	 더 공부해서 코드를 단축하여 업데이트 하도록 하겠습니다.
	 
	 더 좋은 코드를 만들 수 있도록 피드백 부탁드립니다. 교수님

	 ==>
	     코드 잘만드셨어요... 수업시간에 배운거 잘 응용하셔서 만드셨습니다~~~
		 조금 짧게 만드는 코드는 수업시간에 해볼게요~~~
 */
 
public class Exam01 {

	public static void main(String[] args) {
		
		int[] numArr = new int[10];
		int totalEven = 0, totalOdd = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.printf("%d's num : ", i+1);
			
			numArr[i] = sc.nextInt();
			sc.nextLine();
		}
		sc.close();
		System.out.println();
		
		System.out.println("< 짝수 >");
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] % 2 == 0) {
				totalEven += numArr[i];
				System.out.printf("%d ", numArr[i]);
			}
		}
		System.out.println("\n짝수의 총합 : " + totalEven + '\n');
		
		System.out.println("< 홀수 >");
		for(int i = 0; i < numArr.length; i++) {
			if(numArr[i] % 2 != 0) {
				totalOdd += numArr[i];
				System.out.printf("%d ", numArr[i]);
			}
		}
		System.out.println("\n홀수의 총합 : " + totalOdd);
		
	}

}
