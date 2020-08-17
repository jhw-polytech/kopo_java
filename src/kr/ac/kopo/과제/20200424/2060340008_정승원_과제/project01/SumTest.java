package kr.ac.kopo.day10.project.project01;

import java.util.Scanner;

public class SumTest {
	static int sum;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int num = Integer.parseInt(scanner.nextLine());
		if (num%2 == 0) { // 0이면
			System.out.printf("결과 값: %d", even(num));
		} else {
			System.out.printf("결과 값: %d", odd(num));
		}
	}
	
	static int odd(int num) {
		for (int i = (num+1); i > 0; i --) {
			if(i%2 == 1) {
				sum += i;
			}
		}
		return sum;
	}
	
	static int even(int num) {
		for (int i = (num+1); i > 0; i --) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		return sum;		
	}
}
