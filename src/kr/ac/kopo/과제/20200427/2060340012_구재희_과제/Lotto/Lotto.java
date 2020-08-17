package jaeheehomework;

import java.util.Scanner;

public class Lotto {

	public void lotto() throws LottoNumberException {    //main에서 처리 하도록 던져줌

		System.out.println("좋아하는 로또 번호를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());

		if (num < 1 || num > 45) {                     //이 조건일때 로또exception 생성
			throw new LottoNumberException("1-45사이만 가능합니다 " + num + "은 올바르지 않습니다");
		}
		System.out.println(num + " 를 포함해서 로또번호들을 추출하겠습니다");

	}
}

