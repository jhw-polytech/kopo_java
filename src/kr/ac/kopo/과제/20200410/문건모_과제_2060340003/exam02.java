package test0411;

/*
 * 4개의 정수를 입력받아 가장 큰 수를 구하는 코드를 작성하시오.
 * 정수는 각각 입력받아도 상관없습니다.
 * 정수 4개를 입력하세요 : 89 4 222 6
 * 89 4 222 6 중 가장 큰 수 : 222
 */

import java.util.Scanner;

public class exam02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 4개를 입력하세요");
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		
		/*
			if문 만드느라 고생하셨어요~~~
			다른 방법이 있으면 더 좋겠다는 생각을 해보셨죠???
			수업시간에 이야기해봅시당!!! 수고했어요
		*/

		if(a1>a2 && a1>a3 && a1>a4) {  // a1이 가장 큰 경우 
			
			System.out.printf("%d %d %d %d 중 가장 큰 수 : %d",a1 ,a2 ,a3 ,a4 ,a1);
		
		}else if(a2>a1 && a2>a3 && a2>a4) {  // a2가 가장 큰 경우
			
			System.out.printf("%d %d %d %d 중 가장 큰 수 : %d",a1 ,a2 ,a3 ,a4 ,a2);
		
		}else if(a3>a1 && a3>a2 && a3>a4) {  // a3가 가장 큰 경우
			
			System.out.printf("%d %d %d %d 중 가장 큰 수 : %d",a1 ,a2 ,a3 ,a4 ,a3);
		
		}else {  // a4가 가장 큰 경우
			
			System.out.printf("%d %d %d %d 중 가장 큰 수 : %d",a1 ,a2 ,a3 ,a4 ,a4);
		}
		
		
	}

}
