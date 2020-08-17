package shlee1993.day03.homework;

import java.util.Scanner;

/*
1. 정수 3개를 입력받아 큰수에서 작은수 순으로 출력하는 코드를 작성하시오
ex)	정수 3개를 입력하세요 : 12 6 22
	22 12 6
*/

//먼저 세 개의 정수를 입력받은 후, num1과 num2를 비교하여 num1이 작다면 num1과 num2 값을 바꾸고
//num1과 num3 역시 같은방법으로 진행하여 num1에 가장 큰 수가 들어가도록 작성
//그 후, num2에 저장된 값과 num3에 저장된 값을 비교하여 큰 값을 num2에 저장 후, 출력

public class hw01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수를 입력하세요 : ");
		String numInput = sc.nextLine();
		int num1 = Integer.parseInt(numInput);	//세개를 한번에 받을 경우 int num1 = sc.nextInt();을 사용하면 될 것 같습니다.

		System.out.print("두번째 정수를 입력하세요 : ");
		numInput = sc.nextLine();
		int num2 = Integer.parseInt(numInput);
		
		System.out.print("세번째 정수를 입력하세요 : ");
		numInput = sc.nextLine();
		int num3 = Integer.parseInt(numInput);
		sc.close();	//책 받은날 질문 결과, 일단 경고를 없애기 위해 사용하기로 했습니다.

		int temp;	//값을 임시로 저장하기 위한 변수 선언

		if(num1 < num2) {	//첫번째 정수가 두번쨰보다 작을 경우 num1과 num2의 값을 바꿔줌
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		if(num1 < num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}

		if(num2 < num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}

		System.out.println(num1 + " " + num2 + " " + num3);		
	}
}
