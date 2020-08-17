package Homework0417;

import java.util.Scanner;

public class IcecreamMain2 {

	public static void main(String[] args) {

		Icecream2 new_ice = new Icecream2(); // 객체 생성

		Scanner sc = new Scanner(System.in);

		System.out.print("아이스크림을 몇개 구입할래? ");

		int num = Integer.parseInt(sc.nextLine());

		new_ice.icebox(num); 	// 메소드 호출
	}
}