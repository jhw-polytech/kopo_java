package kr.co.hana.homework11;

public class LottoMain {

	public static void main(String[] args) {
		LottoControl lc = new LottoControl();
		try {
			lc.getNum();
			ExtractNumber.setNum();
			
		} catch (LottoNumberException e) {
			String message = e.getMessage();
//			System.out.println(message);
			e.printStackTrace();
		} 
	}
}
