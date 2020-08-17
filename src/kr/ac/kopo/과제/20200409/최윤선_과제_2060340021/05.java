package prac;

import java.util.Scanner;

public class prac_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("달러를 입력하세요 : ");
		int usd = sc.nextInt();
		sc.nextLine();
		System.out.println("원화 : "+ (usd * 1092.50)+"원");
		//원화 = input된수 * 환율(1092.50)
		
	}
}