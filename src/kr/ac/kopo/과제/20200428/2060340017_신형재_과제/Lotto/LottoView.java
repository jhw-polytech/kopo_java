package homework0428;

public class LottoView {
	
	LottoUtil util = new LottoUtil();
	
	public void startGame(String msg) {
		System.out.println(msg);
		System.out.print("���� ���� �Է��ϼ��� : ");
		util.execute();
	}
}
