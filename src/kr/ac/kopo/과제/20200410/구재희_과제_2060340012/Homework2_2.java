package jaeheehomework;

import java.util.Scanner;

public class Homework2_2 {
	public static void main(String[] args) {
		//2. 4개의 정수를 입력받아 가장 큰 수를 구하시오.
				System.out.println("2번\n");
				Scanner sc = new Scanner(System.in);
				
				System.out.print("첫번째 정수 입력 : ");
				int num4 = Integer.parseInt(sc.nextLine());
				System.out.print("두번째 정수 입력 : ");
				int num5 = Integer.parseInt(sc.nextLine());
				System.out.print("세번째 정수 입력 : ");
				int num6 = Integer.parseInt(sc.nextLine());
				System.out.print("네번째 정수 입력 : ");
				int num7 = Integer.parseInt(sc.nextLine());
				sc.close();
				
				//토너먼트 형식으로 두 개, 두 개 먼저 비교하고, 다시 두 개를 비교하는 방법으로 했습니다.
				int winner1 = Math.max(num4, num5);
				int winner2 = Math.max(num6, num7);
				int finalWinner = Math.max(winner1, winner2);
				System.out.printf("%d, %d, %d, %d 중 가장 큰수 : %d\n", num4, num5, num6, num7, finalWinner);
				
	}

}
