package shlee1993.day04.homework;

import java.util.Scanner;

/*
4. 다음의 결과를 보이는 프로그램을 작성하시오.
int[] nums = new int[30];
ex)	1 – 100사이의 정수를 입력하시오 : 64
	64의 약수의 개수 : 7개
	< 64의 7개 약수 출력 >
	1 2 4 8 16 32 64
*/

//정수를 입력받고, 0번 인덱스부터 입력받은 정수의 약수 값을 저장한다.((입력받은 정수)%(1~입력받은 정수) == 0)
//이때, 오늘 배운 인덱스 저장값 loc변수를 생성해서 저장될때마다 +1씩 해주도록 작성

public class Hw04 {
	public static void main(String[] args) {
		System.out.println("1 - 100사이의 정수를 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		sc.close();
		
		int[] nums = new int[30]; // 충분한 저장 공간 생성
		int loc = 0; // 인덱스 값을 위한 변수

		for (int i = 1; i <= 100; i++) {
			if (inputNum % i == 0)
				nums[loc++] = i; // 편의를 위해 인덱스0은 신경쓰지 않고 작성
		}

		System.out.printf("%d의 약수의 개수 : %d개\n", inputNum, loc);
		System.out.printf("< %d의 %d개 약수 출력 >\n", inputNum, loc);
		for (int i = 0; i < 30; i++)
			if (nums[i] != 0)	//뒤에 저장되지 않은 공간에 0이 저장되어있고, 이 값을 출력하지 않기 위해
				System.out.print(nums[i] + " ");
	}

}
