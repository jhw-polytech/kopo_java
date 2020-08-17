package kr.ac.kopo.day12.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto01Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int[] numbers;

		System.out.println("게임수를 입력하세요: ");
		int cnt = sc.nextInt();
		sc.nextLine();

		// 선택한 게임 수만큼 반복
		for (int i = 0; i < cnt; i++) {
			numbers = new int[6];
			
			for (int j = 0; j < 6; j++) {
				numbers[j] = random.nextInt(45) + 1;

				// 번호 오름차순 정렬
				// : 새 번호가 앞 번호보다 작을 시 순서 변경
				if (j > 0 && numbers[j - 1] > numbers[j]) {
					int cvt = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = cvt;
				}

				// 번호 중복 방지
				// : 앞번호와 같은 숫자가 나오면 인덱스 되돌림
				if (j > 0 && numbers[j - 1] == numbers[j]) {
					j--;
				}
			}

			// 생성된 배열 출력
			System.out.printf("게임 %d : ", i + 1);
			System.out.println(Arrays.toString(numbers));

		}

		sc.close();

	}

}
