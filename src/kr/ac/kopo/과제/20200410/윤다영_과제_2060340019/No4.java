package kr.ac.kopo.assignment.day03;

import java.util.Scanner;

public class No4 {
	/*
	 정수 a, b 입력,
	 1) 1 ~ a 사이의 b의 배수를 제외한 정수 출력
	 2) 1 ~ a 사이의 b의 배수를 제외한 정수 5개씩 출력
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 100 사이의 정수를 입력 : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("2 - 10 사이의 정수를 입력 : ");
		int b = sc.nextInt();
		sc.nextLine();
		
	
		System.out.printf("< 1 ~ %d 사이의 %d의 배수를 제외한 정수 출력 >\n", a, b);
		for(int temp = 1; temp <= a ; temp++) {
			if(temp % b != 0) System.out.print(temp + " ");
		}
			
		
		System.out.printf("\n< 1 ~ %d 사이의 %d의 배수를 제외한 정수 %d개씩 출력 >\n", a, b, b);
		for(int temp = 1; temp <= a; temp++) {			
			if(temp % b != 0) {
				System.out.print(temp + " ");
				if(temp % (b+1) == 0) System.out.print("\n");
			}
			/*
			 공배수 처리를 어떤 식으로 해야할지 잘 모르겠습니다ㅜ 
			 밑에 if 문을 추가하지 않으면, 공배수가 포함된 두 line이 붙게 되고, 
			 밑 if 문을 추가하게 되면 공배수 자리에 공간이 비게 됩니다ㅜ
			 */
			 /*
			 	if문의 위치를 생각하시면 됩니다... '\n'가 여러번 출력되는 경우가 생기는 이유를 차근히 생각해보세요
				 과제하시느라 고생하셨어요
			 */
			if(temp % (b+1) == 0 && temp % b == 0) {
				System.out.print("\n");
			}
					
			
		}
		
	}

}
