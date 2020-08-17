package kr.ac.kopo.assignment.day07;

public class StringUtilMain {
	
	public static void main(String[] args) {
		
//		StringUtil strUtil = new StringUtil();
		
		
		System.out.println("<<문자열에서 특정 char의 개수 찾기>>");
		String strData = StringUtil.inputStr();
		char c = StringUtil.inputChar();
		int i = StringUtil.checkChar(strData, c);
		System.out.printf("\"%s\"의 \'%c\' 개수는  : %d\n", strData, c, i);
		
		System.out.println();
		
		System.out.println("<<문자열에서 특정 char 삭제하기>>");
		String oriStr = StringUtil.inputStr();
		char delChar = StringUtil.inputChar();
		String strNew = StringUtil.removeChar(oriStr, delChar);
		System.out.printf("\"%s\" 중 \'%c\'를 삭제한 문자열은 : %s\n", oriStr, delChar, strNew);
	}

}
