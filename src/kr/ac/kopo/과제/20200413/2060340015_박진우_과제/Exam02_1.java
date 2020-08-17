package kr.ac.jinwoo.day04.homework;

import java.util.Scanner;

/*
5개의 짝수를 입력받아 출력하는 코드 작성

< 5개의 정수 출력 >
12 20 10 26 4

*/

public class Exam02_1 {

	public static void main(String[] args) {
		
		int numArr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		/*
			while문을 사용하지 않고 작성할 수 있는 방법을 한번 생각해봐요~~ ^^
			
			==> 수업시간에 알려주신 내용을 적용하여 수정해보았습니다. 피드백 진심으로 감사드립니다 교수님.
		*/
		
		int input;
		for(int i = 0; i < 5; ) {
			System.out.printf("%d's 정수 : ", i+1);
			numArr[i] = sc.nextInt();
			sc.nextLine();
			
			if(numArr[i]%2 == 0)
				i++;
		}
		sc.close();
		
		System.out.println("\n< 5개의 정수 출력 >");
		for(int item : numArr) {
			System.out.printf("%d ", item);
		}
	}
}
