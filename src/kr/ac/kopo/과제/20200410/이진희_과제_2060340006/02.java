package day0410;
//4개의 정수를 입력받아 가장 큰 수 구하기 

import java.util.Scanner;

public class pr2 {
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 4개를 입력하세요 : ");  
		
	    // abcd입력
		int a = sc.nextInt();  
		int b = sc.nextInt(); 
		int c = sc.nextInt(); 
		int d = sc.nextInt(); 
		int max=0;    //최댓값 입력 
		
	
		if(a>=b) max= a;             //a, b비교 후 큰 값을 max에 저장 
		else max=b;
		if (c>=max) max=c;           //max값과 c값을 비교 후 최댓값 저장
		if (d>=max) max=d;           //max값과 d값을 비교 후 최댓값 저장
		
		System.out.printf("%d, %d, %d, %d 중 가장 큰 값은 = %d",a,b,c,d, max);
		
		
		
		
		
	}

}
