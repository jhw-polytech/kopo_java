package homework0417;

/*
 * 2060340017 신형재 과제 9번
 * 
 */

import java.util.Scanner;

public class IceNew {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이스크림을 몇개 구입할래 ? ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Ice ic = new Ice();
		
		ic.execute(num);
		
	}
		
}
