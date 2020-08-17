package exam0413;

import java.util.Scanner;

public class no01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 정수를 입력해주세요. 짝수를 고르고 합을 출력합니다.");
		
		int temp = 0, even = 0, odd = 0;
		int evenArr[] = new int[10], oddArr[] = new int[10];
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+"\'s num : ");
			temp = sc.nextInt();
			
			if (temp % 2 == 0) {
				evenArr[i-1] = temp;
				even += temp;
			} else {
				oddArr[i-1] = temp;
				odd += temp;
			}
		}
		
		sc.close();
		// i는 계속 돌기 때문에 위에서 짝수가 아닐경우 다음 짝수때까지 0이 순서대로 기록된다.
		// 따라서 배열을 순차적으로 돌면서 0인 경우는 출력하지 않음.
		/*
			재원씨 만일 사용자가 0을 입력했을 때는 어떻게 나올지 생각을 해보시겠습니까??
			지금 코드도 좋긴 한데.. 그런 문제를 한번 생각해봅시당!
		*/
		System.out.println("< 짝 수  > ");
		for (int evenPrint : evenArr) {
			if (evenPrint != 0) {
				System.out.print(evenPrint + " ");
			}
		}
		System.out.printf("\n짝수의 총합 : %d", even);
		
		System.out.println("\n\n < 홀 수  > ");
		for (int oddPrint : oddArr) {
			if (oddPrint != 0) {
				System.out.print(oddPrint + " ");
			}
		}
		System.out.printf("\n홀수의 총합 : %d", odd);

	}
}
