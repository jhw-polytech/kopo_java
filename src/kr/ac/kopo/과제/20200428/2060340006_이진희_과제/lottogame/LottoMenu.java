package lottogame;

import java.util.Scanner;

public class LottoMenu {
	void setMenu() {
		Lotto lotto = new Lotto();
		Scanner scan = new Scanner(System.in);	
		while(true) {
			System.out.println("1.로또게임 2.종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.print("게임 수를 입력하세요 : ");
				int count = scan.nextInt();	
				lotto.setLotto(count);
			}else if(sel == 2) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
	}
}
