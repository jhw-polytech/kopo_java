package exam0428.LottoGame;

import java.util.Scanner;

public class Lotto {
	
	private Scanner sc;
	private int		insertCoin;

	public void start() {
		try {
			sc = new Scanner(System.in);
			System.out.print("게임 수를 입력하세요. (1부터 ~ 최대 4): ");
			insertCoin = sc.nextInt();
		} catch (Exception e) {
			System.out.println("숫자만 입력이 가능합니다.");
			System.out.println("비정상적인 입력으로 프로그램을 종료합니다.");
		} finally {
			sc.close();
		}
		
		LottoGenerator gen1 = new GeneratorOne();
		LottoGenerator gen2 = new GeneratorTwo();
		LottoGenerator gen3 = new GeneratorThree();
		LottoGenerator gen4 = new GeneratorFour();
		
		switch(insertCoin) {
		case 1: gen1.lottoGenerator(); break;
		case 2: gen1.lottoGenerator();
				gen2.lottoGenerator(); break;
		case 3:	gen1.lottoGenerator();
				gen2.lottoGenerator();
				gen3.lottoGenerator(); break;
		case 4: gen1.lottoGenerator();
				gen2.lottoGenerator();
				gen3.lottoGenerator();
				gen4.lottoGenerator(); break;
		}

		
		
		
	}
}
