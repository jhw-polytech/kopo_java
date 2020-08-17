package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력 : ");
		int num1 = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("두번째 정수 입력 : ");
		int num2 = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("세번째 정수 입력 : ");
		int num3 = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("네번째 정수 입력 : ");
		int num4 = sc.nextInt(); 
		sc.nextLine();
		
		int max=num1; //임의의 수를 max로 일단 지정
		
		if (num2>max) { //임의의 수를 제외하고 max값 찾기
			max=num2;
		}
		else if (num3>max) {
			max=num3;
		}
		else if(num4>max) {
			max=num4;
		}
		
		System.out.printf("%d %d %d %d 중 가장 큰 수 : %d",num1,num2,num3,num4,max);
		
	}
}