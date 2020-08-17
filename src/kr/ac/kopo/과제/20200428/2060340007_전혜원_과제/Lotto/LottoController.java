package kr.ac.kopo.lotto;

import java.util.Arrays;
import java.util.Scanner;

public class LottoController {

	Scanner sc = new Scanner(System.in);

	public void lottoMarket() {

		LottoUtil lotto = new LottoUtil();

		System.out.println("로또 가게에 오신 것을 환영합니다.");
		System.out.println("자동으로 로또 번호를 추출해 드립니다.");
		System.out.println("추출 방법을 고르세요. ===>");
		System.out.println("1. 버블정렬");
		System.out.println("2. for문으로 중복 거르기");
		System.out.println("3. HashSet");
		System.out.println("4. TreeSet");
		System.out.println("0. 종료");

		int choice = sc.nextInt();
		sc.nextLine();

		System.out.println("번호가 생성되었습니다. :");

		switch (choice) {
		case 1:
			System.out.println(Arrays.toString(lotto.method01()));
			lottoRebuying();
			break;
		case 2:
			System.out.println(Arrays.toString(lotto.method02()));
			lottoRebuying();
			break;
		case 3:
			lotto.method03();
			lottoRebuying();
			break;
		case 4:
			System.out.println(lotto.method04());
			lottoRebuying();
			break;
		case 0:
			System.out.println("로또 구매가 완료되었습니다.");
			break;
		}

		sc.close();
	}

	public void lottoRebuying() {
		System.out.println("한장 더 구매하시겠습니까?");
		System.out.println("1. 구매한다");
		System.out.println("2. 구매하지 않는다.");
		System.out.println("===> ");
		int choice = sc.nextInt();
		sc.nextLine();

		if (choice == 1) {
			lottoMarket();
		} else if (choice == 2) {
			System.out.println("로또 구매가 완료되었습니다.");
		} else {
			System.out.println("1 또는 2만 입력 가능합니다.");
			lottoRebuying();
		}

		sc.close();
	}

}
