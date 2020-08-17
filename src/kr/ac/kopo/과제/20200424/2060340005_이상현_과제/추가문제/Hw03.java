package shlee1993.day10.homework;

import java.util.Scanner;

/*
 * 문제3 최대공약수 구하기
 * 최대공약수는 두 숫자를 공통된 숫자로 나누어도 나머지가 0 이 되는 가장 큰 수
를 의미합니다 . 예를 들어 2 와 5 의 최대 공약수는 1 입니다 . 왜냐하면 , 1 부터 2 까
지의 숫자중 공통으로 나눌 수 있는 숫자는 1 뿐이기 때문입니다 . 다른 예로 , 5 와
15 의 최대 공약수는 5 가 됩니다 . 메소드의 이름은 gcd 로 하며 , 매개변수는 두개
의 정수를 받으며 , 리턴 하는 타입 역시 정수입니다
 */

public class Hw03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = Integer.parseInt(sc.nextLine());
		int n2 = Integer.parseInt(sc.nextLine());
		sc.close();

		System.out.println(gcd(n1, n2));
	}

	public static int gcd(int n1, int n2) { // 대학 시절 정보암호화 정수론때 배운 유클리드 호제법을 사용했습니다.
		int temp;

		if (n1 < n2) { // 유클리드 호제법를 사용하기 위해 큰 수를 n1에 저장하고 작은 수를 n2에 저장
			temp = n1;
			n1 = n2;
			n2 = temp;
		}

		while (true) {
			temp = n2;
			n2 = n1 % n2;
			n1 = temp;
			if (n2 == 0) { // 나머지 값이 0일 경우 n1이 최소공배수임
				return n1;
			}
		}
	}
}