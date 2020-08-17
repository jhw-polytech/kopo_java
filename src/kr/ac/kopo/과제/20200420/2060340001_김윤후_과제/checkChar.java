package Assignment06;

import java.util.Scanner;

/*
	클래스이름은 꼭 대문자로 시작하셔야 합니다~~ ^^
	그리고 checkChar() 메소드 제가 static으로 구성하라 하지 않았나요??? 호출방식이 달라져야할 거 같은데요....
*/
public class checkChar {

	Scanner sc=new Scanner(System.in);
	private String strData;
	private char ch;
	private int cnt;
	
	checkChar(){
		strData=null;
		ch=0;
		
	}
	checkChar[] check;
	
	
	checkChar(String strData, char ch) {
		this.strData=strData;
		this.ch = ch;

	}
	
	String getstr(){
		System.out.println("입력스트링: ");
		strData=sc.nextLine();
		return strData;
		}
		
	char getchar(){
		System.out.println("입력캐릭터: ");
		ch=sc.next().charAt(0);
		return ch;
	}
	
	
	
	void checkChar() {
		//str = "hello world";
		//String searchStr = "l";
		//System.out.println("< " + str + "에서 \"" + searchStr + "\" 위치 >");
		int searchIdx = strData.indexOf(ch);
		while(searchIdx != -1) {
			searchIdx = strData.indexOf(ch, searchIdx+1);
			cnt+=1;
		}
		System.out.println("입력 캐릭터 = '"+ch+"' 인 경우 =>\t"+cnt+"리턴");
		
	}
	
//	public static void checkChar() {
//		
//		System.out.println(strData);
//		System.out.println(ch);
//		
//		
		
		
	
}
