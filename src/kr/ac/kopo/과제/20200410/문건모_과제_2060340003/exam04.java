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

public class exam04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - 100 사이의 정수를 입력 :");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("2 - 10 사이의 정수를 입력");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("<1 ~" + num1 +">사이의" + num2 + "의 배수를 제외한 정수 출력");
		for(int i = 1;i<=num1 ;i++ ) {
			
			/*
				건모씨 굳이 if문이 필요한가요??? 이거때문에 결과모양이 이쁘지 않을꺼 같은데.....
			*/
			if(i%num2 == 0) {
				
				System.out.print(" ");  // num2의 배수를 공백으로 입력
			}else {
				System.out.print(i+" "); // 나머지 숫자를 차례대로 입력
			}
			
		}
	
		System.out.println();
		System.out.println("<1 ~" + num1 +">사이의" + num2 + "의 배수를 제외한 정수" + num2 + "개씩 출력");
		
		int cnt = 0;  //  num2개씩 출력하기 위해서 새로운 변수를 추가
        for(int i = 1;i<=num1 ;i++ ) {
			
			
        	if(i%num2 == 0) {
				
				System.out.print(" ");
			}else {
								
				cnt++;  // for문의 성질을 이용하여 자동적으로 1씩 증가
				System.out.print(i+" ");
				
				if(cnt%num2==0) { // cnt가 num2가 되는 순간 줄바꿈을 입력, 
					
				System.out.println();
			  }
				
				
			}
			
        	
        	
		}
		
		
		
	}

}
