package shlee1993.day02.homework;

import java.util.Scanner;

/*
4. 화면에서 하나의 정수를 입력 받고 정수를 나눌 수를 입력 받은 다음 몫과 나머지를 화면에 출력
ex)정수를 입력하세요 : 10
나눌수를 입력하세요 : 7
몫	: 1
나머지	: 3
*/

// 분모가 0인 경우와 분자가 음수인 경우를 error로 출력하고 나머지 경우에만 출력.

public class hw04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		String numInput = sc.nextLine();
		int num1 = Integer.parseInt(numInput);	//첫번째 입력칸 저장 후, numInput 변수를 뒤에 다시 사용
		
		System.out.print("나눌 수를 입력하세요 : ");
		numInput = sc.nextLine();
		int num2 = Integer.parseInt(numInput);
		
		if(num2 == 0 || num1 < 0)
			System.out.println("error!!");	//분모가 0이거나 분자가 음수인 경우 error 출력
		else
			System.out.println("몫 : " + num1 / num2 + "\n나머지 : " + num1 % num2);
	}
}
