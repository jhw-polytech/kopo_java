package jaeheehomework;

import java.util.Scanner;

public class Homework2_8 {
	public static void main(String[] args) {
		
		//8. 시작단과 종료단을 입력받아 구구단을 출력.
		
				//시작, 종료단 받기
				Scanner sc = new Scanner(System.in);
				System.out.printf("시간단을 입력 : ");
				int startDan = Integer.parseInt(sc.nextLine());
				System.out.printf("\n종료단을 입력 : ");
				int finalDan = Integer.parseInt(sc.nextLine());
				sc.close();
				
				int sdan = startDan, edan = finalDan;
				if(startDan > finalDan) {
					sdan = finalDan;
					edan = startDan;
				}
				
				for(int dan = sdan; dan <= edan; dan++) {
					System.out.println("***" + dan + "단***");
					
					for(int i = 1; i <= 9 ; i++) {
						System.out.printf("%d * %d = %d\n", dan, i, dan*i);
					}
				}
					
				
	}

}
