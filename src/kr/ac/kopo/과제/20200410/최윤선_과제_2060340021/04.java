package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~100 사이의 정수 입력 : ");
		int num1 = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("2~10 사이의 정수 입력 : ");
		int num2 = sc.nextInt(); 
		sc.nextLine();
		
		int cnt=0;
		
		
		for (int i=1 ; i<=num1 ; i++) {
			System.out.printf("%3d ", i);
			cnt++;
				
			if(cnt==num2) {
				System.out.print("\n");
				cnt=0;
			}
		}
	}
}