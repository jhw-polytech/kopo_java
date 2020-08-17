package kr.co.hana.homework04;

import java.util.Scanner;

public class IcecreamMain {

/*
	현택씨... new IceCream();으로 객체 왜 만들었어요??
	밑에서 안사용하는 거 같은데...
	그리고 ice가 IcecreamMain클래스의 멤버변수로 설정한거 맞아요????
	이해가 잘안가는디~~~~~~
	구성하다가 잘 안되어서 그냥 놔두고 String[] name, int[] price를 설정한건가요???
	코드보다 궁금증이 많이 생겼어요 ^^

	참 그리고 키보드 입력받기 위해 굳이 sc1, sc2로 객체 2개 만들필요 없어요
	하나가지고 메소드를 계속 호출해주시면 됩니다 ^^
*/

	IceCream ice = new IceCream();

	public static void main(String[] args) {

		System.out.println("아이스크림을 몇개 구입할래? ");
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		sc.nextLine();

		IceCream[] ice = new IceCeram[cnt];   // 잘못된 부분 체크

		for (int i = 0; i < cnt;) {
			ice[i] = new IceCream();

			System.out.print("아이스크림 명: ");
			ice[i].name = sc.nextLine();

			System.out.print("아이스크림 가격: ");
			ice[i].price = sc.nextInt();
			sc.nextLine();
		}

		System.out.printf("<총 %d개의 아이스크림 구매정보 출력>\n", cnt);
		System.out.println("번호	아이스크림명	아이스크림가격");

		for (int j = 0; j < cnt; j++) {
			System.out.println((j + 1) + "\t" + ice[j].name + "\t\t" + ice[j].price);
		}
		sc.close();

	}

}
