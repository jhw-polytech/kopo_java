package test0427;

import java.util.Scanner;

public class LottoMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		   System.out.print("좋아하는 로또 번호를 입력하세요 : ");
		   int lotto = sc.nextInt();
		   sc.nextLine();
		   
		   if(lotto>46) {
			   throw new LottoException("1 - 45 사이만 가능합니다 " + lotto + "은 올바르지 않습니다");
		   }
		   System.out.println(lotto + "를 포함해서 로또번호들을 추출하겠습니다");
		   
		} catch(LottoException le) {
			System.out.println(le.getMessage());
		}
		
	}

}
