package shlee1993.day06.homework;

import java.util.Scanner;

/*
9. 다음의 결과를 보이는 프로그램을 작성하시오(객체 지향적으로)
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

//객체화를 위해 main을 간단히 하고, 재사용이 편하게 작성하려고 하다보니, 아이스크림을 정보를 관리하는 클래스가 필요할 것 같아서
//IcecreamManagement클래스(입력값 저장, 출력 메소드 포함)를 추가했습니다.

public class IcecreamMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IcecreamManagement iceM = new IcecreamManagement();	//아이스크림 관리를 위한 IcecreamManagement객체 생성

		System.out.println("아이스크림을 몇개 구입할래?");
		int num = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < num; i++)	//입력받은 숫자만큼 아이스크림 정보 생성
			iceM.setIce();		

		iceM.getAllInfo();
		sc.close();
	}

}
