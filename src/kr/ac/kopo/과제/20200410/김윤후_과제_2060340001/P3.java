package Assignment02;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("정수 입력하시오");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		/*
			1부터 출력하는 코드였죠??? 초기화를 수정하시던지 출력할 대상의 변수는 i+1로 변경하시던지 하셔야 할거 같네요...
			사실 그리 중요하진 않지만 ^^
		*/
		for (int i =0; i<=num; i++) {
			System.out.print(i+" ");
		}
	}
}

// 정수를 입력받아 반복문을 통해 도출