package kr.ac.kopo.day03.homework;

import java.util.Scanner;

/*
 * 2060340011 홍민기
 * 
 * 1. 정수 3개를 입력받아 큰수에서 작은수 순으로 출력하는 코드를 작성하시오
 * 정수 3개를 입력하세요 : 12 6 22
 * 22 12 6
 * 또는
 * 첫번째 정수 입력 : 12
 * 두번째 정수 입력 : 6
 * 세번째 정수 입력 : 22
 * 22 12 6
 * 
 */
public class Homework1Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하세요 : ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		// 비교를 하는 경우의 수는 3개중에 2개를 뽑으므로 3C2 = 3가지 경우를 생각하면 된다.
		
		if(num1<=num2) { // 첫 번째 수와 두 번째 수를 비교하여 큰 수를 첫 번째, 작은 수를 두 번째에 넣는다.
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		if(num1<=num3) { // 첫 번째 수와 세 번째 수를 비교하여 큰 수를 첫 번째, 작은 수를 세 번째에 넣는다.
			int tmp = num1;
			num1 = num3;
			num3 = tmp;
		}
		if(num2<=num3) { // 두 번째 수와 세 번째 수를 비교하여 큰 수를 두 번째, 작은 수를 세 번째에 넣는다.
			int tmp = num2;
			num2 = num3;
			num3 = tmp;
		}
		// 이렇게 하면 num1 > num2 > num3 가 된다.
		
		System.out.println(num1+" "+num2+" "+num3);
	}
}
