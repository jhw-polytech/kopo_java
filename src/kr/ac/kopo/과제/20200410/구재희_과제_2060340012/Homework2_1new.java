package jaeheehomework;

import java.util.Scanner;

public class Homework2_1 {
	public static void main(String[] args) {
		//1. 정수 3개를 입력받아 큰수에서 작은수 순으로 출력.
				System.out.println("1번\n");
				
				Scanner sc = new Scanner(System.in);
				System.out.print("첫번째 정수 입력 : ");
				int num1 = Integer.parseInt(sc.nextLine());
				
				System.out.print("두번째 정수 입력 : ");
				int num2 = Integer.parseInt(sc.nextLine());
				
				System.out.print("세번째 정수 입력 : ");
				int num3 = Integer.parseInt(sc.nextLine());
				sc.close();
				
				int min = num2;
				int max = num1;
				
				if(num1 < num2) {
					min = num1;
					max = num2;
				}
				
				if(num3 < min) {
					System.out.printf("%d %d %d", max, min, num3);
				} else if(num3 > max) {
					System.out.printf("%d %d %d", num3, max, min);
				} else {
					System.out.printf("%d %d %d", max, num3, min);
				}
				
				
	}

}
