package homework08;

import java.util.*;

public class StringUtil {
	
	public static int checkChar(String strData, char ch) {
		int cnt =0;
		//System.out.println(strData+" 와 "+ch);
		for (int i=0  ;  i< strData.length()  ;i++) {
			if (ch == strData.charAt(i)) {
				cnt++;
			}
		}
		return cnt;
	}
	public static String removeChar(String oriStr, char delChar) {
		String after_remove="";
		
		for(int i=0 ; i<oriStr.length()  ; i++) {
			if (delChar != oriStr.charAt(i)) {
				after_remove += oriStr.charAt(i);
			}
		}
		return after_remove;
	}

}
