package kr.ac.kopo.day3.assignment;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
	/*1~100 사이의 정수a와 2~10 사이의 정수b를 입력받아
	b의 배수를 제외한 1~a사이의 정수를 2가지 방법으로 출력하기*/
		
		//정수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - 100사이의 정수를 입력 :");
		int inputNumber1 = sc.nextInt();
		System.out.println("2 - 10사이의 정수를 입력 :");
		int inputNumber2 = sc.nextInt();		
		
		
		//inputNumber2의 배수를 제외한 1~inputNumber1사이의 정수 출력
		//1. 한줄로 출력
		System.out.printf("< 1 ~ %d사이의 %d의 배수를 제외한 정수 출력 >", inputNumber1, inputNumber2);
		System.out.print('\n');
		for (int i = 1; i <= inputNumber1; i++) {
			if (i % inputNumber2 != 0) {
				System.out.print(i);
				System.out.print(' ');				
			}
		}
		
		System.out.print('\n');
		System.out.print('\n');
		
		/*
			수업시간에 설명한것처럼 결과가 다르게 나올거에요.. .다시 코드를 수정해주세요...	=>수정 완료
		*/
		
		//2. 5개씩 출력
		System.out.printf("< 1 ~ %d사이의 %d의 배수를 제외한 정수 5개씩 출력 >", inputNumber1, inputNumber2);		
		System.out.print('\n');
		//출력한 숫자 개수를 세기 위한 변수 선언	
		int count = 0;
		for (int i = 1; i <= inputNumber1; i++) {
			//inputNumber2의 배수가 아니라면, 출력한다
			if (i % inputNumber2 != 0) {
				System.out.print(i);
				System.out.print(' ');
				//출력한 횟수를 센다
				count += 1;		
				//출력한 숫자 개수가 5의 배수에 도달하면 줄 바꾸기
				if (count % 5 ==0) {
					System.out.print('\n');
				}
			} 	 //i가 inputNumber2와 5의 공배수일 때, count가 증가하지 않아 줄바꿈을 한번 더 실행 
				 //i가 배수가 아닐때만 줄 바꿀지 말지 결정하면 되므로 두번째 if문은 첫번째 if문 안에 포함
		}	



/* 수정 전
//2. inputNumber2 개씩 출력		//=>5개씩 고정적으로 출력하는 것
System.out.printf("< 1 ~ %d사이의 %d의 배수를 제외한 정수 %d개씩 출력 >", inputNumber1, inputNumber2, inputNumber2);
System.out.print('\n');
//출력한 숫자 개수를 세기 위한 변수 선언	
int count = 0;
for (int i = 1; i <= inputNumber1; i++) {
	//inputNumber2의 배수가 아니라면, 출력한다
	if (i % inputNumber2 != 0) {
		System.out.printf("%5d", i);
		//출력한 횟수를 센다
		count += 1;		  
	}
	출력한 숫자 개수가 inputNumber2의 배수에 도달하면 줄 바꾸기  
	if (count % inputNumber2 ==0) {
		System.out.print('\n');
	}	
}	
*/			
			
				
	}
}
