package kr.ac.jinwoo.day04.homework;

import java.util.Scanner;

public class Exam03_1 {

	public static void main(String[] args) {
		
		int numArr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		/*
			진우씨 이렇게 코드를 만드면 중첩된 반복문이 3중으로 늘어나죠??? 조건식도 많아지고...
			어떻게 하면 조금 짧게 할 수 있는지 생각을 해봅시다
			수고하셨습니다
			
			==> 수업시간에 알려주신 내용을 적용하여 수정해보았습니다. 피드백 진심으로 감사드립니다 교수님.
		*/
		
		for(int i = 0; i < numArr.length; ) {
			
			System.out.printf("%d번째 정수 : ", i+1);
			numArr[i] = sc.nextInt();
				
			if(i > 0 && (numArr[i-1] >= numArr[i])) {
				for(int j = 0; j < i; j++) {
					if(j  == i-1)
						System.out.print(numArr[j]);
					else
						System.out.print(numArr[j] + ", ");
				}
				System.out.println("보다 큰 수를 입력하세요.");
			}
			else
				i++;
			
		}
		sc.close();
		
		System.out.println("< PRINT >");
		for(int item : numArr) {
			System.out.printf("%d ", item);
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		int reverseNum = 0;
		for(int i = numArr.length-1; i >= 0; i--) {
			int temp = numArr[i];
			while(temp != 0) {
				reverseNum = reverseNum*10 + temp%10;
				temp /= 10;
			}
			System.out.printf("%d ", reverseNum);
			reverseNum = 0;
		}
	}
}
