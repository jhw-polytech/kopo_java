package Homework_0409;

import java.util.Scanner;

// 4)화면에서 하나의 정수를 입력 받고 정수를 나눌 수를 입력 받은 다음 몫과 나머지를 화면에 출력하시오.


public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// Scanner로 입력받기
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();					// 정수를 입력받는다.
		sc.nextLine();
		
		System.out.print("나눌 수를 입력하세요 : ");
		int b = sc.nextInt();					// 나눌 수를 입력받는다.
		sc.nextLine();
		
		if(b==0) {								// 만약 나눌 수를 0으로 입력한 경우 0으로 나눌 수 없다는 메시지를 출력한다.
			System.out.println("0으로 나눌 수 없습니다.");
		}else {									// 그렇지 않은 경우 정상적으로 계산한다.
			System.out.println("몫 : " + a/b);
			System.out.println("나머지 : " + a%b);
		}
	}
}
