package day0409;

import java.util.Scanner;

/*반지름이 10인 원의 면적을 구해서 출력하시오.
 * 참고: 원주율-3.141592
 * 결과출력: 원의 면적은 143.1234입니다.
 */
public class task3 {
	public static void main (String[] args) {
		double pi = 3.141592; // 원주율3.141592
		int radius = 10;   // 반지름 10
		double area = radius * radius * pi;  //넓이 구하는 식 반지름*반지름*원주율
		
		System.out.println("반지름: " + radius + " ==> 원 넓이: " + area );
		
		radius =10;    
		area= radius * radius * pi;
		
	System.out.println("결과출력 : 원의 넓이는 "+ radius*radius*pi+" 입니다."); 
	}
}