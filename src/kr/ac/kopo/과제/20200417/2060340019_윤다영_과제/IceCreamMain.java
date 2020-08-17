package kr.ac.kopo.assignment.day06;

import java.util.Scanner;

public class IceCreamMain {	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		IceCream ice = new IceCream();
		
		System.out.print("아이스크림을 몇 개 구입할래? ");
		int num = sc.nextInt();
		sc.nextLine();
		
		IceCream[] iceArrMain = ice.iceCreamInput(num);
		ice.iceCreamOutput(num, iceArrMain);
		
	}

}
