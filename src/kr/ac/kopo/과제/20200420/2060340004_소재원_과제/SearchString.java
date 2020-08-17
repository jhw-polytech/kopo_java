package exam0420;

public class SearchString {

	public static int checkChar(String strData, char ch) {

		/*
			재원씨.. idx를 -1로 초기화하고 시작하면 if문 필요 없지 않을까요????
			return cnt로 통일될 거 같은데요...
		*/

		int cnt = 0, idx = 0;
		if ((idx = strData.indexOf(ch)) != -1) {
			cnt++;
			while( (idx = strData.indexOf(ch, idx + 1)) != -1) {
				cnt++;
			}
			return cnt;
		} else {
			return 0;
		}
	}
	
	public static String removeChar(String oriStr, char delChar) {
		oriStr = oriStr.replaceAll(String.valueOf(delChar), "");
		return oriStr;
	}
	
}
