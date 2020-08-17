package jaeheehomework;

import java.util.Scanner;

public class Homework2_3 {
	public static void main(String[] args) {
		//3. 정수를 입력받아 1에서부터 입력받은 정수사이의 숫자를 출력
				System.out.println("3번\n");
				
				System.out.println("1 ~ 100 사이의 정수를 입력 : ");
				
				Scanner sc = new Scanner(System.in);
				int num8 = Integer.parseInt(sc.nextLine());
				sc.close();
				
				System.out.printf("\n<1 ~ %d사이의 정수 출력>\n", num8);
				
				for(int i = 1; i <= num8; i++) {
					System.out.print(i + " ");
				}
				System.out.print("\n");
	}

}
