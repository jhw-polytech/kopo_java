package kr.ac.kopo.day03.exam;

import java.util.Scanner;

/*
 4. 다음의 결과를 보이는 프로그램 작성하시오.
	1 - 100 사이의 정수를 입력 : 40
	2 - 10사이의 정수를 입력 : 5
	
	< 1 ~ 40사이의 5의 배수를 제외한 정수 출력>
	1 2 3 4 6 7 8 9 11 ... 39
	
	< 1 ~ 40사이의 5의 배수를 제외한 정수 5개씩 출력>
	1 2 3 4 6
	7 8 9 11 12
	...
*/

public class Day03Exam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1-100 사이의 정수 n을 입력해주세요.");
		int num1 = sc.nextInt();

		System.out.println("2-10 사이의 정수 m을 입력해주세요.");
		int num2 = sc.nextInt();

		
		System.out.printf("< 1 ~ %d 사이의 %d의 배수를 제외한 정수 출력> \n", num1, num2);
		for (int i = 1; i <= num1; i++) {
			// m의 배수가 아닌 경우에만 출력
			if (i % num2 != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.print("\n\n");

		
		System.out.printf("< 1 ~ %d 사이의 %d의 배수를 제외한 정수 5개씩 출력> \n", num1, num2);
		
		int cnt=0;
		
		/*
			아까 설명했듯이 enter가 여러번 출력될 수 있습니다.
			코드 수정아시죠?? ^^
		*/
		for (int i = 1; i <= num1; i++) {
			
			if (i % num2 != 0) {
				cnt++;
				System.out.print(i + "\t");
			}
			
			if (cnt%5==0) {
				System.out.println();
			}
		}

		sc.close();
	}

}
