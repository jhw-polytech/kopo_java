package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시작단을 입력 : ");
		int num1 = sc.nextInt(); 
		sc.nextLine();
		
		System.out.println("종료단을 입력 : ");
		int num2 = sc.nextInt(); 
		sc.nextLine();
		
		int min=0, max=0;
		
		if(num1>=num2) {
			max=num1;
			min=num2;
		}
		else {
			max=num2;
			min=num1;
		}
		
		for (int i=min ; i<=max ; i++) {
			System.out.printf("**** %d 단 ****\n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf(" %d * %d = %d\n", i,j,j*i);
			}
			System.out.printf("\n");
		}
		
	}
}