package shlee1993.day03.homework;

import java.util.Scanner;

/*
4. 다음의 결과를 보이는 프로그램을 작성하시오
ex)	1-100 사이의 정수를 입력 : 40
	2-10 사이의 정수를 입력 : 5
 
	<1-40사이의 5의 배수를 제외한 정수 출력>
	1 2 3 4 6 7 ... 39
	 
	<1~40사이의 5의 배수를 제외한 정수 5개씩 출력>
	1 2 3 4 6
	7 8 9 11 12
*/

//if문과 %를 이용하여 num2의 배수일 때를 제외하고 출력을 진행한다,
//5개씩 출력하기 위해 0으로 초기화된 변수를 두고 숫자가 출력될 때마다 변수값을 1씩 증가시키고 변수가 5의 배수가 될 때마다 줄 바꿈을 입력한다.

public class hw04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("1-100 사이의 정수를 입력하세요 : ");
		String numInput = sc.nextLine();
		int num1 = Integer.parseInt(numInput);
		
		System.out.print("2-10 사이의 정수를 입력하세요 : ");
		numInput = sc.nextLine();
		int num2 = Integer.parseInt(numInput);
		sc.close();
		
		System.out.printf("<1-%d사이의 %d의 배수를 제외한 정수 출력>\n", num1, num2);
		for (int i = 1; i <= num1; i++) {
			if (i % num2 != 0)
				System.out.print(i + " ");
		}
		System.out.println("\n");
		
		int cnt = 0;	//5개마다 줄을 바꾸기 위해 5까지 카운트를 위한 변수
		System.out.printf("<1-%d사이의 %d의 배수를 제외한 정수 5개씩 출력>\n", num1, num2);
		for (int i = 1; i <= num1; i++) {
			if (i % num2 != 0) {
				System.out.print(i + " ");
				cnt++;	//출력이 될 때마다 cnt가 1씩 증가
				if(cnt%5==0)	//cnt가 5의 배수일 때 줄 바꿈
					System.out.println();
			}
		}
	}

}
