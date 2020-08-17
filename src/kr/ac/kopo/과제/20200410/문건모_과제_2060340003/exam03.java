package test0411;

/*
 * 정수를 입력받아 1에서부터 입력받은 정수사이의 숫자를 출력하는 코드를 작성
 * 1-100사이의 정수를 입력 : 60
 * 
 * <1~60> 정수 출력
 * 1 2 3 ... 60
 */

import java.util.Scanner;
 
public class exam03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - 100사이의 정수를 입력하세요");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.println("<1~"+ num + ">정수출력");
		
		for(int i=1;i<=num ;i++ ) {
			
			System.out.print(i+" " );
		}
	}

}
