package test0421;

/*
	건모씨.... 클래스이름 대문자로 작성 잊지마세요~~ ^^
*/

public class exam01 {
	
	
	String strData;
	char ch;
	
	exam01(){}	
	
	/**
	 * 문자열의 각 내용들을 비교하여 입력 받는 char c의 값과 동일한 char의 개수를 리턴한다.
	 * 대소문자 구별하여 비교한다.
	 * @param strData
	 * @param ch
	 * @return
	 */
	
	
	
	public static int checkChar(String strData, char ch) {
		
		int cnt = 0;
		int num = -1;
		
		while((num = strData.indexOf(ch, num+1)) != -1) {  //수업 내용 활용
			cnt++;
		}
		
		return cnt;
	}
	
		public static void print(char ch, int cnt) {
			
			System.out.println("ch = " + ch + "인경우 " + cnt);
		}
		
		
		
	
	
	
	
		
	
	
	
}
		
		
		
		
	
		
		
			

			
		
	
		
		
	

