package day0409;

import java.util.Scanner;

/*화면에서 하나의 정수를 입력받고 정수를 나눌 수를 입력 받은 다음 몫과 나머지를 화면에 출력하시오.
정수를 입력하세요: 
나눌 수를 입력하세요:
몫  나머지
*/
public class task4 {
	public static void main (String[] args) {

	Scanner sc = new Scanner(System.in);  //scanner클래스는 정수,실수,문자열을 읽어온다.

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();    //int_ 숫자입력받기
		int div; // 나누는 수 선언 

	
		System.out.print("나눌 수를 입력하세요 : ");
		div = sc.nextInt();
			
	System.out.println("몫 : "+num/div);           // 숫자/나눌수

	System.out.println("나머지 : " +num%div);       // 숫자/나눌수의 나머지
	}
}	
 
