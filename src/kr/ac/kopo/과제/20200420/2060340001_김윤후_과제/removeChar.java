package Assignment06;

import java.util.Scanner;


/*
	StringBuffer에 있는 메소드를 사용해서 문제해결하시라는 것은 생각도 못했네요..
	원래 알고있는 메소드였어요???? ^^
*/
public class removeChar {

	Scanner sc=new Scanner(System.in);
	private StringBuffer sb =new StringBuffer();
	private char delchar;
	private String oriStr;
	
	removeChar(){
		
	}
	
	
	
	removeChar(String oriStr, char delchar) {
		this.delchar = delchar;
		this.oriStr=oriStr;

	}
	
	String getstr(){
		System.out.println("입력스트링: ");
		oriStr=sc.nextLine();
		return oriStr;
		}
		
	char getchar(){
		System.out.println("삭제할 문자: ");
		delchar=sc.next().charAt(0);
		return delchar;
	}
	
	
	
	void removeChar() {
		//str = "hello world";
		//String searchStr = "l";
		//System.out.println("< " + str + "에서 \"" + searchStr + "\" 위치 >");
		sb=sb.append(oriStr);
		for(int i=0; i<oriStr.length();i++) {
			if(oriStr.charAt(i)==delchar) {
				sb=sb.deleteCharAt(i);
			}
		}
		
//		
		System.out.println("입력 캐릭터 = '"+oriStr+"' 인 경우 =>\t"+sb+"리턴");
//		
	}
}
