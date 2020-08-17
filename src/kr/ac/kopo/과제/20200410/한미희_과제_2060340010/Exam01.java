package kr.ac.kopo.day3.assignment;

import java.util.Scanner;

public class Exam01 {
	
	public static void main(String[] args) {
	//정수 3개를 입력받아 큰 수에서 작은 수 순으로 출력하기
		
		//정수 3개 입력 받기
		System.out.println("정수 3개를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();      
		sc.nextLine();
		/*??공백은 자동으로 인식 안하고 다음 정수를 받아들이는 건가??
		 *nextInt() : 입력 값은 기본적으로 문자열인데, 이를 int타입으로 반환한다(null값이 아니고 정수인 값을 반환)
		 Scanner 클래스는 사용자가 입력하는 값을 공백('\t, '\f', '\r', ' ', '\n')으로 구분하여 읽는다
		 */
		
		
		//입력받은 정수들을 크기 순서대로 담을 변수 선언
		int first;
		int second;
		int third;
		
		
		//입력받은 정수들을 서로 크기 비교하여 차례대로 변수에 대입
		//1. 정수 2개 먼저 비교해서 크기 순서대로 변수 first, second에 담기
		if (number1 > number2) {	
			first =	number1;
			second = number2;
		}else {
			first =	number2;
			second = number1;
		}
		
		//2. 마지막 정수 1개와 가장 큰 수(first)와 비교
		/*마지막 정수 1개가 가장 큰 수(first)보다 크다면, 
		first, second 변수에 있는 정수를 한칸씩 뒤 차례의 변수로 이동시키고, 마지막 정수(number3)를 first에 대입*/
		if (number3 > first) {		
			third = second;			
			second = first;
			first =	number3;
		/*마지막 정수가 가장 큰 수(first)보다는 작다면, 두번째로 큰 수와 비교하기*/
		}else if(number3 > second) {	
			third = second;
			second = number3;
		}else {
			third = number3;
		}
		
		
		//first, second, third 순서대로 정수 출력
		System.out.printf("%d %d %d", first, second, third);
	}

}
