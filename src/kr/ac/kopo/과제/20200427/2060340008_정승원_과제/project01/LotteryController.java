package kr.ac.kopo.day11.project01;

import java.util.Scanner;

public class LotteryController {

	public static void execute() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("좋아하는 로또 번호를 입력하세요 : ");
			int num = Integer.parseInt(sc.nextLine());
			try {
				// 제대로 숫자가 입력된 상태면 Lottery를 실행시켜서 로또번호를 가져오면 된다.
				Lottery lottery = new Lottery(num);
				lottery.getNumbers(); // 여기까지 들어가면, 에러발생이 되지 않은 상태이므로,
				break; // 정상적으로 while문을 빠져나온다.
			} catch (LottoNumberException e) {
				e.getMessage();
				e.getStackTrace();
			}
		
		}
		sc.close();
		
	}

}
