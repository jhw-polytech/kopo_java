package kr.ac.kopo.day11.homework;

public class LottoMain {

	public static void main(String[] args) {

		LottoService lotto = new LottoService();
		int[] arr = new int[6];
		
		try {
			arr = lotto.generateNumbers();
		} catch (LottoNumberException e) {
			e.printStackTrace();
		}		
		
		System.out.println("행운의 로또번호를 발표하겠습니다.");

		for (int i = 0; i < 6; i++) {			
			System.out.print(arr[i] + " ");
		}
	}

}
