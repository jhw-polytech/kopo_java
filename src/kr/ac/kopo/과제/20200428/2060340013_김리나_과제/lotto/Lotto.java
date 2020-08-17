package kr.ac.kopo.day12.homework.lotto;
/**
 * 1. 로또 게임

게임수를 입력하세요 : 3
게임 1 : [2, 6, 13, 25, 20, 7]
게임 2 : [2, 9, 3, 7, 38, 13]
게임 3 : [40, 10, 38, 39, 42, 18]

알고리즘 4개이상...
 * @author Lina
 *
 */
public class Lotto {

	private int gameNum;
	private int[] lottoNum;
	
	Lotto() {}
	
	public Lotto(int gameNum, int[] lottoNum) {
		super();
		this.gameNum = gameNum;
		this.lottoNum = lottoNum;
	}
	
	public int getGameNum() {
		return gameNum;
	}
	
	public void setGameNum(int gameNum) {
		this.gameNum = gameNum;
	}
	
	public int[] getLottoNum() {
		return lottoNum;
	}
	
	public void setLottoNum(int[] lottoNum) {
		this.lottoNum = lottoNum;
	}
	
	
}
