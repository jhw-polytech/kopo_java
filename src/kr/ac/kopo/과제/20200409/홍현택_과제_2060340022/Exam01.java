package kr.co.hana.homework01;

public class Exam01 {
	
	public static void main(String[] args) {
	
		String alpa = "AEIOU";
			for(int i = 0; i < alpa.length(); i++) {
				char askii = alpa.charAt((int)i);
				System.out.printf(askii + " = %d\n", (int)askii);
			}	
	}
}


/*
1. "AEIOU"를 입력
2. for문 내에 charAt() 활용해 알파벳 각각 선택
3. "A = 65" 형태로 출력
Q. 문자열의 charAt은 0,1,2,3... 순서고 length는 1,2,3,4... 순서?
	for(int i = 0; i < alpa.length(); i++) 에서 '<'을 '<='로 고치면
	에러가 남....

	==> 답변
	    만일 문자열을 hello라고 입력받으면 length값은 5가 됩니다. 하지만 컴퓨터에 저장되어 hello 문자를 각각 가지고 올때는 
		0~4번지까지만 저장이 되어있죠. 그래서 <= 를 사용하면 5번지를 접근하기 때문에 예외가 발생하게 됩니다.
*/
