package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2 ~ 9단을 입력 : ");
		int num1 = sc.nextInt(); 
		sc.nextLine();
		
		System.out.printf("**** %d 단 ****\n",num1);
		for (int i=1;i<=9;i++) {
			System.out.printf(" %d * %d = %d\n", num1,i,num1*i);
		}
		
	}
}