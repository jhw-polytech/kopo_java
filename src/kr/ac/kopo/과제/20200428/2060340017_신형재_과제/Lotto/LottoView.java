package homework0428;

public class LottoView {
	
	LottoUtil util = new LottoUtil();
	
	public void startGame(String msg) {
		System.out.println(msg);
		System.out.print("게임 수를 입력하세요 : ");
		util.execute();
	}
}
