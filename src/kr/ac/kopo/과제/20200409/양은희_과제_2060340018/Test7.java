package Homework_0409;

import java.util.Scanner;

// 7)화면에서 알파벳을 입력 받아 대문자는 소문자로 소문자는 대문자로 출력하는 프로그램을 작성하시오

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력(알파벳) : ");
		String inputStr = sc.nextLine();
		
		System.out.print("변경된 값 : ");
		
		 char[] a= inputStr.toCharArray();		// toCharArray()메소드를 활용하여 문자열을 char형의 배열으로 바꾼다.
	        
	        for(int i = 0; i<a.length; ++i){
	            if(65<=a[i] && a[i]<=90){		// 만약 대문자가 입력된다면
	                	a[i]=(char)(a[i]+32);	// 32를 더해 소문자로 출력
	                	continue;
	                }
	            if (97<=a[i] && a[i]<=122){		// 만약 소문자가 입력된다면
	            		a[i]=(char)(a[i]-32);	// 32를 빼 대문자로 출력
	            		continue;
	            	}
	            }
	        System.out.print(a);
		
		}
}
