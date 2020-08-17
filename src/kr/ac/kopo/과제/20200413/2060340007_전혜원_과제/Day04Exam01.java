package kr.ac.kopo.day04.exam;

import java.util.Scanner;

/*
1. 10개의 정수를 입력받아 다음과 같이 출력하는 코드를 작성하시오.
	1's num : 12
	2's num : 5
	3's num : 8
	4's num : 30
	5's num : 22
	6's num : 87
	7's num : 9
	8's num : 4
	9's num : 15
	10's num : 22
	
	< 짝수 >
	12 8 30 22 4 22
	짝수의 총합 : XXX
	
	< 홀수 >
	5 87 9 15
	홀수의 총합 : XXX
*/
public class Day04Exam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 크기가 10인 배열 arr 생성
		int[] arr = new int[10];

		// 정수를 입력받아 arr배열에 저장
		for (int i = 1; i <= 10; i++) {
			System.out.printf("정수를 입력해주세요 %d 's num: ", i);
			arr[i - 1] = sc.nextInt();
			System.out.println();
		}

		// 짝수와 홀수의 각 총합을 저장할 변수
		int even = 0;
		int odd = 0;

		// 짝수와 홀수로 나눠 저장할 배열(몇 개가 입력될지 모르므로 크기는 각 10개로 지정)
		int[] evenArr = new int[10];
		int[] oddArr = new int[10];

		// 배열에 저장된 값을 불러올 인덱스
		int arrIndex = 0;
		int evenIndex = 0;
		int oddIndex = 0;

		/*
			혜원씨 그럴리는 없겠지만 사용자가 0을 입력하면 어떻게 될까요??? 그것도 한번 생각해주세요...
		*/

		while (arrIndex < 10) {

			// 저장된 값이 짝수일 때
			if (arr[arrIndex] % 2 == 0) {
				evenArr[evenIndex] = arr[arrIndex]; // 짝수 배열에 저장
				even += arr[arrIndex]; // 짝수 총합에 누적
				arrIndex++;
				evenIndex++;

			// 저장된 값이 홀수일 때
			} else {
				oddArr[oddIndex] = arr[arrIndex]; // 홀수 배열에 저장
				odd += arr[arrIndex]; // 홀수 총합에 누적
				arrIndex++;
				oddIndex++;

			}

		}

		System.out.println("< 짝  수  >");
		for (int i = 0; i < 10; i++) {
			if (evenArr[i] == 0)
				break;
			System.out.print(evenArr[i] + " ");
		}
		System.out.println("\n 짝수의 총합: " + even);

		System.out.println();

		System.out.println("< 홀  수  >");
		for (int i = 0; i < 10; i++) {
			if (oddArr[i] == 0)
				break;
			System.out.print(oddArr[i] + " ");
		}
		System.out.println("\n 홀수의 총합: " + odd);

		sc.close();

	}

}
