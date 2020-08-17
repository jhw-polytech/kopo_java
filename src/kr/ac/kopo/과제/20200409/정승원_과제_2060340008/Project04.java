package kr.ac.kopo.day02.project;

import java.util.Scanner;

/**
 * 
 * @author tess
 *
화면에서 하나의 정수를 입력받고 정수를 나눌수를 입력받은 다음 몫과 나머지를 화면에 출력하는 클래스 
 */
public class Project04 {
	
	public static void main(String[] args) {
		
		// 입력을 받는다. 
		Scanner sc = new Scanner(System.in); 
		System.out.print("정수를 입력하세요 : ");
		int number = Integer.parseInt(sc.nextLine());
		System.out.print("나눌 수를 입력하세요 : ");
		int divide = Integer.parseInt(sc.nextLine());
		
		// 계산과 동시에 출력한다. 
		System.out.printf("몫: %d\n", number/divide);
		System.out.printf("나머지: %d", number%divide);
	}

}
