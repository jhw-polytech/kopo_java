package test0411;

/*
 * 정수 3개를 입력받아 큰수에서 작은수 순으로 출력하는 코드를 작성하시오
 * 정수 3개를 입력하세요 : 12 6 22
 * 22 12 6
 * 또는
 * 첫번째 정수 입력 : 12
 * 두번째 정수 입력 : 6
 * 세번째 정수 입력 : 22
 * 22 12 6
 */

import java.util.Scanner;

public class exam01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		
		if(a1>a2 && a1>a3) { // a1이 가장 큰 경우
			
			if(a2>a3) {
				
				System.out.printf("%d %d %d", a1 ,a2 ,a3);
			}else {
				
				System.out.printf("%d %d %d", a1 ,a3 ,a2);
			}
			
		}else if(a2>a1 && a2>a3) { // a2가 가장 큰 경우
			
			if(a1>a3) {
				
				System.out.printf("%d %d %d", a2 ,a1 ,a3);
			}else {
				
				System.out.printf("%d %d %d", a2 ,a3 ,a1);
			}
			
			
		}else { //a3가 가장 큰 경우
			
			if(a1>a2) {
				
				System.out.printf("%d %d %d", a3 ,a1 ,a2);
			}else {
				
				System.out.printf("%d %d %d", a3 ,a2 ,a1);
			}
		}
	}

}
