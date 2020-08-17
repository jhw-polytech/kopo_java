package kr.ac.kopo.day04.exam;

import java.util.Scanner;

public class Day04Exam01Solution {

	public static void main(String[] args) {

		int[] nums = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(i + 1 + "'s 정수: ");
			nums[i] = sc.nextInt();
			sc.nextLine();
		}

		System.out.println("< 짝수 >");
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.print(nums[i] + " ");
			}

		}

		System.out.println();

		System.out.println("< 홀수 >");
		for (int num : nums) {
			if (num % 2 == 1) {
				System.out.print(num + " ");
			}

			sc.close();
		}

	}

}
