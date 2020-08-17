package exam0409;

import java.util.Scanner;

public class no7 {
	/*
	 * char 한개를 바꾸는 거보다 완전히 반전되는 건 없을까 하다가
	 * 누군가 아스키코드를 활용해 비교하는 걸 봐서, 활용해보았습니다.
	 * 아스키코드 상에서 a -> A / A -> a 모두 32씩 차이가 나기 때문에
	 * 이를 활용하여 대소문자를 반전시킬 수 있습니다.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 대소문자 구분없이 마음대로 입력하세요.");
		String eng = sc.nextLine();
		sc.close();
		String fix = "";
		
		for (int i = 0; i < eng.length(); i++) {
			
			char ch = eng.charAt(i);
			
			if (((int) ch >= 65) && ((int) ch <= 90)) {
				char temp = (char) ((int) ch + 32);
				fix += temp;
				
			} else if (((int) ch >= 97) && ((int) ch <= 122)) {
				char temp = (char) ((int) ch - 32);
				fix += temp;
			}
		}
		System.out.println(fix);
	}
}
