package Assignment05;

import java.util.Scanner;

public class IceCreamMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IceCream i = new IceCream();
		
		System.out.println("아이스크림 몇개 구입할거야?");
		int num=sc.nextInt();
		sc.nextLine();
		
		i.input(num);
		
		
	}
}
