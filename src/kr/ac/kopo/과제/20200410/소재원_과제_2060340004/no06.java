package exam0410;

import java.util.Scanner;

public class no06 {
	
	public static void gugu(int dan) {
		
		System.out.printf("*** %d단 ***\n", dan);
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("몇 단을 외울까요? 2 ~ 9 :");
		Scanner sc = new Scanner(System.in);
		gugu(sc.nextInt());
		sc.close();
	}
}
