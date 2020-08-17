package jaeheehomework;

import java.util.Scanner; 

public class Homework2_6 {

	public static void main(String[] args) {
		
		//6. 단을 입력받아 구구단을 출력
				System.out.println("6번\n");
				
				System.out.print("\n2-9 단을 입력 :  ");
				
				Scanner sc = new Scanner(System.in);
				int gugudanNum = Integer.parseInt(sc.nextLine());
				sc.close();
				
				System.out.printf("\n***%d단***\n", gugudanNum);
				
				for(int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %d\n", gugudanNum, i, gugudanNum*i);
				}
				
	}
}
