package exam0410;

import java.util.Scanner;

public class no08 {

	public static void gugu(int dan) {
		
		System.out.printf("*** %d단 ***\n", dan);
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단의 시작 단을 입력 : ");
		int start = sc.nextInt();
		System.out.println("구구단의 종료 단을 입력 : ");
		int end = sc.nextInt();
		sc.close();
		
		if (start > end) {
			for (int i = end; i <= start; i++) {
				gugu(i);
				System.out.println();
			}
		} else {
			for (int i = start; i <= end; i++) {
				gugu(i);
				System.out.println();
			}
		}
	}
}
