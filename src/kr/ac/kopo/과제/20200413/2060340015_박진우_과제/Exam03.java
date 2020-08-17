package kr.ac.jinwoo.day04.homework;

import java.util.Scanner;

/*
    -점점 수가 커지는 정수를 5개 입력받는 코드를 작성
 */

public class Exam03 {

	public static void main(String[] args) {
		
		int numArr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		/*
			진우씨 이렇게 코드를 만드면 중첩된 반복문이 3중으로 늘어나죠??? 조건식도 많아지고...
			어떻게 하면 조금 짧게 할 수 있는지 생각을 해봅시다
			수고하셨습니다
		*/

		int input;
		for(int i = 0; i < 5; i++) {
			
			while(true) {
				System.out.printf("%d번째 정수 : ", i+1);
				input = sc.nextInt();
				
				if(i == 0) {
					numArr[i] = input;
					break;
				}
				
				if(input > numArr[i-1]) {
					numArr[i] = input;
					break;
				}
				else {
					for(int j = 0; j < i; j++) {
						if(j==0)
							System.out.printf("  %d ", numArr[j]);
						else
							System.out.printf(",%d ", numArr[j]);
					}
					System.out.println("보다 큰 수가 와야합니다.");
				}
			}
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
			while(true) {
				reverseNum = reverseNum*10 + temp%10;
				temp /= 10;
				
				if(temp == 0) 
					break;
			}
			System.out.printf("%d ", reverseNum);
			reverseNum = 0;
		}
	}
}
