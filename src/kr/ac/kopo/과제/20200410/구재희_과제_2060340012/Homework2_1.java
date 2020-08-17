package jaeheehomework;
//Homework2_1new에 고친 코드 올렸습니다!
import java.util.Scanner;

public class Homework2_1 {
	public static void main(String[] args) {
		//1. 정수 3개를 입력받아 큰수에서 작은수 순으로 출력.
				System.out.println("1번\n");
				
				Scanner sc = new Scanner(System.in);
				System.out.print("첫번째 정수 입력 : ");
				int num1 = Integer.parseInt(sc.nextLine());
				
				System.out.print("두번째 정수 입력 : ");
				int num2 = Integer.parseInt(sc.nextLine());
				
				System.out.print("세번째 정수 입력 : ");
				int num3 = Integer.parseInt(sc.nextLine());
				sc.close();
				
				
				int first = 0;
				int second = 0;
				int third = 0;
				
				//공책에 가지치기 형식으로 그림 그려서 해결했습니다. 더 간단한 방법이 있는지...
				/*
					변수를 더 사용하시면 조건문을 줄여서 표현할 수 있습니다.
					수업시간에 얘기를 해볼게요~~ ^^
				*/
				if(num1 < num2) {
					if( num2 < num3) {
						first = num1; second = num2; third = num3;
					} else {
						if(num1 < num3) {
							first = num1; second = num3; third = num2;
						} else {
							first = num3; second = num1; third = num2;
						}
					}
					
				} else {
					if(num1 < num3) {
						first = num2; second = num1; third = num3;
					} else {
						if(num2 < num3) {
							first = num2; second = num3; third = num1;
						} else {
							first = num3; second = num2; third = num1;
						}
					}
					
				}
				
				System.out.printf("%d %d %d\n", third, second, first);
	}

}
