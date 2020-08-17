package test0411;

/*
 * 다음의 결과를 보이는 프로그램을 작성하시오
 * 1-100 사이의 정수를 입력 : 40
 * 2-10 사이의 정수를 입력 : 5
 * 
 * <1-40사이의 5의 배수를 제외한 정수 출력>
 * 1 2 3 4 6 7 ... 39
 * 
 * <1~40사이의 5의 배수를 제외한 정수 5개씩 출력>
 * 1 2 3 4 6
 * 7 8 9 11 12
 */

import java.util.Scanner;

public class exam04correction {
	
	public static void main(String[] args) {
		
		System.out.print("1 ~ 100 사이의 정수를 입력 :");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("2 ~ 10 사이의 정수를 입력 :");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("<1 ~" + num1 + " 사이의 " + num2 + "의 배수를 제외한 정수 출력>");
		
		for(int i = 1;i<=num1;i++) {
			
			if(i%num2 != 0) { //전에 했던 과제에서 불필요한 조건을 없앰
				
				System.out.printf("%d  ", i);
			}
			
		}
		System.out.println();
		System.out.println("<1 ~" + num1 + " 사이의 " + num2 + "의 배수를 제외한 정수" + num2 + "개씩 출력>");
		
		int cnt = 0;
		for(int i = 1;i<=num1 ;i++) {
			
			
			if(i%num2 != 0) {
				
				
				System.out.printf("%-3d  ", i);
				cnt++;
			
     		  }	
			if(cnt == num2) {
				
				System.out.println();
				cnt = 0;
			}
			
		}
		
	}
	
}

		
		
				
				
