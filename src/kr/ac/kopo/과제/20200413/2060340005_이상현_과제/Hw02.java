package shlee1993.day04.homework;

import java.util.Scanner;

/*
2. 5개의 짝수를 입력받아 출력하는 코드를 작성
1's 정수 : 12
2's 정수 : 5
2's 정수 : 20
3's 정수 : 10
4's 정수 : 26
5's 정수 : 5
5's 정수 : 11
5's 정수 : 4
< 5개의 정수 출력 >
12 20 10 26 4
*/

//정수를 입력받고 출력하는 것은 똑같으나,
//짝수가 아니면 저장하지 않고, 다시 입력받는 작업을 위해서 while문의 무한루프를 사용하고 짝수일 경우에 break로 탈출을 하게 작성

public class Hw02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];

		for (int i = 0; i < 5; i++) {
			/*
				상현씨 while(true)가 정말 맘에 들어서 작성하시는 거에요??? ^^
				중첩된 반복문을 사용하지 않아도 편하게 작성할 수 있는 방법이 있을 거 같아요....
				지금 코드도 좋지만 조금 더 생각해주세요 ^^
			*/
			while (true) {
				System.out.printf("%d's 정수 : ", i + 1);
				num[i] = sc.nextInt();
				if (num[i] % 2 == 0)	//2의 배수(짝수 일때만 while문을 탈출)
					break;
			}
		}
		sc.close();
		System.out.println("< 5개의 정수 출력 >");
		for (int i = 0; i < 5; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
