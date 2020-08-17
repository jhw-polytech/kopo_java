package kr.ac.kopo.day17.homework.callcenter;

public class Util {
	
	protected static String convertMoneySign(long money) {

		StringBuilder str = new StringBuilder();
		int decCnt = 0;

		if (money > 0) {

			while (money > 0) {
				if (decCnt == 3) {
					str.insert(0, ",");
					decCnt = 0;
				}
				str.insert(0, money % 10);
				money /= 10;
				decCnt++;
			}
		} else if (money <= 0) {

			str.append(0);
		}

		return str.toString();
	}
}
