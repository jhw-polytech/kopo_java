package kr.ac.kopo.assignment.day12;

public class LottoUtil {

	
	public void execute() {
		
		LottoView view = new LottoView();
		int gameCnt = view.startGame();	
		int selAlgo = view.selectAlgo();
		
		switch(selAlgo) {
		case 1 : this.lottoAlgo01(gameCnt);
			break;
		case 2 : this.lottoAlgo02(gameCnt);
			break;
		case 3 : this.lottoAlgo03(gameCnt);
			break;
		case 4 : this.lottoAlgo04(gameCnt);
			break;
		default : System.out.println("ERROR 1~ 4 사이의 숫자를 입력하세요.");
			break;
		}
				
	}
	
	public void lottoAlgo01(int gameCnt) {
		LottoAlgo01 lotto = new LottoAlgo01();
		
		for(int i = 0; i < gameCnt; i++) {
			lotto.randomLottery();
			lotto.print();			
		}
	}
	
	public void lottoAlgo02(int gameCnt) {
		LottoAlgo02 lotto = new LottoAlgo02();
		
		for(int i = 0; i < gameCnt; i++) {
			lotto.randomLottery();
			lotto.print();	
			lotto.clear();
		}
	}
	
	public void lottoAlgo03(int gameCnt) {
		LottoAlgo03 lotto = new LottoAlgo03();
		
		for(int i = 0; i < gameCnt; i++) {
			lotto.randomLottery();
			lotto.print();
			lotto.clear();
		}
	}
	
	public void lottoAlgo04(int gameCnt) {
		LottoAlgo04 lotto = new LottoAlgo04();
		
		for(int i = 0; i < gameCnt; i++) {
			lotto.randomLottery();
			lotto.print();	
			lotto.clear();
		}
	}
	
	
	
	
}
