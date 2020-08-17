package lotto;

import java.util.HashSet;

public class LottoGame3 {

	// 3. HashSet
	public void game3() {
		HashSet hs = new HashSet();
		boolean b = true;
		int num = 0;
		while (true) {
			num = (int) (Math.random() * 45) + 1;
			b = hs.add(new Integer(num));
			if (!b) {
				System.out.print("중복값 제거중...");
			}
			if (hs.size() >= 6) {
				break;
			}
		}
		System.out.print(hs);
	}

}
