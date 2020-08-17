package Assignment02;

import java.util.Scanner;

public class P6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d",num, i, num*i);
			System.out.println();
		}
		
	}
}

//for문을 사용하여 입력받은 변수의 구구단을 구함.