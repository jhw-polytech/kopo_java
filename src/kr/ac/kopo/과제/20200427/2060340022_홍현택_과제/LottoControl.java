package kr.co.hana.homework11;

import java.util.Scanner;

public class LottoControl {

	public void getNum() throws LottoNumberException {
		Scanner sc = new Scanner(System.in);
	

		System.out.println("좋아하는 로또 번호를 입력하세요: ");
		int num = sc.nextInt();

		if (num >= 1 && num <= 45) {
			System.out.println(num);
		} else {
			throw new LottoNumberException("1 - 45 사이만 가능합니다. " + num + "은 올바르지 않습니다.");
		}
	}
}
