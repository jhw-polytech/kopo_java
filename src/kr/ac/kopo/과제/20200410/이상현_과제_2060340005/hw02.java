package shlee1993.day03.homework;

import java.util.Scanner;

/*
2. 4개의 정수를 입력받아 가장 큰 수를 구하는 코드를 작성하시오.
정수는 각각 입력받아도 상관없습니다.
ex)	정수 4개를 입력하세요 : 89 4 222 6
	89 4 222 6 중 가장 큰 수 : 222
*/

//정수 네 개를 입력받아 먼저 num1,num2를 비교하여 큰 값을 max에 저장한다.
//그 후, num3과 max, num4와 max를 순서대로 비교하여 큰 값을 max에 저장한 후 출력한다.

public class hw02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 4개 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		sc.close();
		
		int max;
		
		if(num1 < num2) max = num2;
		else max = num1;
		
		if(max < num3) max = num3;
		if(max < num4) max = num4;
		
		System.out.printf("%d %d %d %d중 가장 큰 수 : %d\n", num1, num2, num3, num4 ,max);
	}

}
