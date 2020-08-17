package kr.co.hana.homework06;

public class CheckChar {
	static int cnt;

	public static int checkChar(String strData, char ch) {
		cnt = 0;
		int searchIdx = -1;

		while ((searchIdx = strData.indexOf(ch, searchIdx + 1)) != -1) {
			cnt++;
		}
		return cnt;

	}

	public static void print(char ch, int cnt) {
		System.out.println("ch = '" + ch + "'인 경우 => " + cnt);
	}
}
