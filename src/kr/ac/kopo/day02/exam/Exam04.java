package kr.ac.kopo.day02.exam;

import java.util.Scanner;

/*
	4. 화면에서 하나의 정수를 입력 받고 정수를 나눌 수를 입력 받은 다음 몫과 나머지를 화면
	에 출력하시오
	정수를 입력하세요 : 10
	나눌 수를 입력하세요 : 7
	몫 : 1
	나머지 : 3
*/

public class Exam04 {
	
	public static void main(String[] args) {
		
		
		int num1;
		int num2;
		
		int quotient;
		int remainder;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("마음에 드는 정수를 입력해주세요.");		
		num1 = sc.nextInt();
		sc.nextLine();
		
		
		
		System.out.println("앞에서 입력한 정수를 나눌 수를 입력해주세요.");
		
		while (true) {
			num2 = sc.nextInt();
			
			// 나누려는 수보다 큰 값이 입력됐을 때
			if (num2>num1) {
				System.out.println("앞에서 입력한 정수보다 같거나 작은 수를 입력해주세요.");
			
			// 0 또는 음수가 입력됐을 때
			} else if (num2<=0) {
				System.out.println("0보다 큰 정수를 입력해주세요.");

			// 원하는 값이 입력됐을 때
			} else {
				sc.nextLine();
				break;
			}
		}
				
		quotient = num1/num2;
		remainder = num1%num2;
		
		System.out.println("몫: " + quotient);
		System.out.println("나머지: "+ remainder);
		
		sc.close();
	}

}
