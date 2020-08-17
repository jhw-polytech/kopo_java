package test0421;



public class exam02 {
	
	String oriStr;
	char   delChar;
		
	/**
	 * 문자열 (oriStr)의 내용 중 주어진 문자(delChar)를 삭제한다
	 * 삭제된 내용으로 문자열의 내용을 변경한다
	 * @param oriStr
	 * @param delChar
	 * @return
	 */
	
	/* (질문)
	 * replace 메소드를 사용해 delChar를 다른 문자로 바꾼 뒤, 바꾼 문자를 제외한 나머지 문자들을 배열에 할당하려했습니다
	 * 현재는 delchar 자리에 ' '이 할당되는 것을 확인했습니다.
	 * else에 어떠한 조건을 줘야 ' '없이, 처음에 의도했던대로 차례대로 배열을 할당할 수 있는지 고민하고 있습니다
	 */
	 /*
	 	=> 답변
		 chArr배열에 저장되는 변수는 별도로 만드세요
		 int loc = 0; 이런 변수요...

		 if(str.charAt(i) != '<' ) {
			chArr[loc++] = str.charAt(i);
		}
		이렇게 구성하시면 굳이 replace.를 이용해서 str에 '<'로 삭제할 문자를 변환할 필요없이 바로 조건에 적용할 수 있을거 같네요...

	 */
	
	public static String removeChar(String oriStr, char delChar) {
		
        
		
		String str = oriStr.replace(delChar, '<');
		
		
		char[] chArr = new char[str.length()];
		for(int i = 0;i<str.length();i++) {
			
			if(str.charAt(i) != '<' ) {
			
				chArr[i] = str.charAt(i);
			}
			
			
		}
		
		
		String str2 = String.valueOf(chArr);
		
		
		return str2;
	}
	
	public static void print(char delChar, String str2) {
		
		System.out.println("delChar = " + delChar + " 인 경우");
		System.out.println(str2 + " 리턴");
	}
	
}
		 
			
			
		
		
	

