package shlee1993.day03.homework;

import java.util.Scanner;

/*
3. 정수를 입력받아 1에서부터 입력받은 정수사이의 숫자를 출력하는 코드를 작성
ex)	1-100사이의 정수를 입력 : 60
	<1 ~ 60> 정수 출력
	1 2 3 ... 60
*/

//for문을 이용해 인덱스의 초기값을 1로 잡고 인덱스가 입력받은 정수와 같아질때까지 숫자를 출력

public class hw03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		sc.close();
		
		if(num <= 0 || num > 100)
			System.out.println("0보다 크고 100보다 작은 수를 입력해주세요");
		else {
			System.out.printf("<1 ~ %d> 정수 출력\n", num);
			for(int i = 1; i <= num; i++)
				System.out.print(i + " ");
		}
	}

}
