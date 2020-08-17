package shlee1993.day05.homework;

import java.util.Scanner;

/*
1. 다음의 결과를 보이는 프로그램을 작성하시오
ex)	아이스크림을 몇개 구입할래? 3 (입력)
	*** 1번째 아이스크림 구매정보 ***
	아이스크림명 : 메로나 (입력)
	아이스크림가격 : 1000 (입력)
	*** 2번째 아이스크림 구매정보 ***
	아이스크림명 : 월드콘 (입력)
	아이스크림가격 : 2000 (입력)
 	*** 3번째 아이스크림 구매정보 ***
	아이스크림명 : 비비빅 (입력)
	아이스크림가격 : 800 (입력)
	< 총 3개의 아이스크림 구매정보 출력 >
	번호 아이스크림명 아이스크림가격
	1 메로나 1000
	2 월드콘 2000
	3 비비빅 800
*/

//정수를 입력받아 입력받은 정수만큼 ice라는 객체의 배열을 만들고
//반복문을 사용해 배열의 길이만큼 Icecream객체를 만들어주고 객체의 멤버변수에 입력받은 값을 대입한 후 출력하도록 작성

public class Hw01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이스크림을 몇개 구입할래?");
		int num = Integer.parseInt(sc.nextLine());
		Icecream[] ice = new Icecream[num];

		for (int i = 0; i < ice.length; i++) {
			ice[i] = new Icecream();

			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i + 1);
			System.out.println("아이스크림명 : ");
			ice[i].name = sc.nextLine();

			System.out.println("아이스크림가격 : ");
			ice[i].price = Integer.parseInt(sc.nextLine());
		}
		sc.close();

		System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", num);
		for (int i = 0; i < ice.length; i++)
			System.out.printf("%d %s %d\n", i + 1, ice[i].name, ice[i].price);
	}

}
