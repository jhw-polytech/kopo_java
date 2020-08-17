package jaeheehomework;

public class LottoMain {
	public static void main(String[] args) {
		Lotto l = new Lotto();
		
		try {
			l.lotto();
		} catch(LottoNumberException e) {   //try - catch로 예외 처리 해줌
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
