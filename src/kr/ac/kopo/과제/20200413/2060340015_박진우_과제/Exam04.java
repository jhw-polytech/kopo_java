package kr.ac.jinwoo.day04.homework;

import java.util.Scanner;

/*
        다음의 결과를 보이는 프로그램을 작성하시오.
    
    1-100사이의 정수를 입력하시오 : 64
    64의 약수의 개수 : 7개
    < 64의 7개 약수 출력 >
    1 2 4 8 16 32 64

 */

public class Exam04 {

	public static void main(String[] args) {
		
		int[] numArr = new int[30];
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		while(true) {
			System.out.printf("1 - 100 사이의 정수를 입력하시오 : ");
			input = sc.nextInt();
			sc.nextLine();
			
			if(1 <= input && input <= 100) break;
		}
		sc.close();
		
		for(int i = 1; i <= input; i++) {
			if(input%i == 0) 
				numArr[index++] = i;
		}
		
		System.out.printf("%d의 약수의 개수 : %d개\n", input, index);
		System.out.printf("< %d의 %d개 약수 출력 >\n", input, index);
		
		for(int i = 0; i < index; i++)
			System.out.printf("%d ", numArr[i]);	
	}
}
