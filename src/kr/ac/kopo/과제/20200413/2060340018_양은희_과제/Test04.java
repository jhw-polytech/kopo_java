package Homework_0413;

import java.util.Scanner;

// 4) 1-100 사이의 정수를 입력받고 약수의 개수 및 약수 출력

public class Test04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1 - 100사이의 정수를 입력하시오 : ");
		int num = sc.nextInt();

		int[] nums = new int[30]; // 약수의 개수를 담을 배열 생성
		int cnt = 0; // 약수 개수 변수 생성

		for (int i = 1; i <= num; i++) { // 약수를 카운트한다
			if (num % i == 0) {	// 입력받은 값이 i로 나눴을 때 나머지가 0이면
				nums[cnt++] = i;	// 약수로 취급하여 개수를 센다.
			}
		}

		System.out.println(num + "의 약수의 개수 : " + cnt +"개"); // 개수를 출력

		System.out.println("< " + num + "의 " + cnt + "개 약수 출력 >");
		for (int i = 1; i <= num; i++) { // 약수를 출력하는 알고리즘
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
