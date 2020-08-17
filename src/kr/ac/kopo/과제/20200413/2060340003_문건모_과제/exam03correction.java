package test0414;

/*
다음의 결과를 보이는 코드를 작성하시오

1번째 정수 : 10 
2번째 정수 : 5 
 10보다 큰수가 와야합니다 
2번째 정수 : 12 
3번째 정수 : 36 
4번째 정수 : 6
  10, 12, 36보다 큰수가 와야합니다 
4번째 정수 : 22
  10, 12, 36보다 큰수가 와야합니다
4번째 정수 : 40 
5번째 정수 : 67

< PRINT >    
10  12  36  40  67

< REVERSE >
 76  4  63  21  1 
     
*/

import java.util.Scanner;

import java.util.Arrays;

public class exam03correction {
	
	public static void main(String[] args) {
		
		int[] ar = new int[5];
		int[] revesre = new int[5];
		int cnt = 1;
		
		
		
		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0;i<ar.length;i++) {
			
			ar[i] = sc.nextInt();
			sc.nextLine();
			
			if(i == 0) {
				
				System.out.println("1번째 정수 : " + ar[0]);
				
			}else if(ar[i]>ar[i-1]) {
				
				
				++cnt;
				System.out.println(cnt + "번째 정수 : " + ar[i]);
				
			}else {
				
				
				cnt+=0;
				System.out.println(cnt + "번재 정수 :" + ar[i]);

                for(int j = 0;j<i;j++) {
                	
                	System.out.print(ar[j] + " ");
                }
                System.out.println("보다 큰수가 나와야 합니다");
				
				i--;  // ar[i]에 할당하지 않고 반복시킴
				
			}
			
		}
		
		System.out.println("<PRINT>");
		System.out.println(Arrays.toString(ar));
		
		System.out.println("<REVERSE>");
		
		for(int i = ar.length - 1;i>=0;i--) {
			
			int num_10 = ar[i]/10;
			int num_1 = ar[i]%10;
			
			if(num_1 == 0) {
				
			  System.out.print(num_10 + "  ");
			
			}else {
				
			  System.out.printf("%d%d  ",num_1, num_10);
			}
		}
	
			
		
		
	}
	
}
				
				
				
