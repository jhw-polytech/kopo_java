package kr.ac.kopo.day12.homework.lotto;
// 기능클래스 View, PickLottoNum과 상위클래스 Lotto의 객체를 만들어 실제로 프로그램을 돌리는 클래스 
// 대부분 기능클래스이고, kind of 관계가 성립하는게 없어 상속을 활용하지 않고 객체로 받았다. 
import java.util.Scanner;

public class LottoManage {
	
	private Scanner sc = new Scanner(System.in);
	View view = new View();
	Lotto lotto = new Lotto();
	PickLottoNum pln = new PickLottoNum();
	
	public void initiate() {
		System.out.println("게임 수를 입력하세요. ");
		lotto.setGameNum(Integer.parseInt(sc.nextLine()));
		execute();
	}
	
	public void execute() {
		for(int i = 1; i <= lotto.getGameNum(); i++) {
			lotto.setLottoNum(pln.pickLottoNum());
			System.out.printf("%s%d%s", "게임 ", i, " : ");
			view.viewLottoNum(lotto.getLottoNum());
		}
	}
	
}
