package kr.ac.kopo.day11.homework;

import java.util.Random;
import java.util.Scanner;

public class LottoService {

	private Random r;
	private Scanner sc;
	private int favorite;
	private int[] lottoArr;

	
	// 생성자
	public LottoService() {
		sc = new Scanner(System.in);
		r = new Random();
		lottoArr = new int[6];
	}

	
	// 로또 번호를 생성하는 메소드
	public int[] generateNumbers() throws LottoNumberException {

		System.out.println("좋아하는 로또 번호를 입력하세요 : ");

		favorite = sc.nextInt();
		sc.nextLine();

		if (favorite < 0 || favorite > 45) {
			throw new LottoNumberException("1 - 45사이만 가능합니다." + favorite + " 은 올바르지 않습니다");
		}

		System.out.printf("%d가 포함된 로또번호들을 추출하겠습니다.\n", favorite);

		lottoArr[0] = favorite;

		for (int i = 1; i < 6; i++) {
			lottoArr[i] = r.nextInt(45) + 1;
			if (lottoArr[i] == favorite)
				i--;
		}
		
		return lottoArr;

	}

}
