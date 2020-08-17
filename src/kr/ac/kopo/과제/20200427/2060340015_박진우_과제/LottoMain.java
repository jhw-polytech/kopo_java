package kr.ac.jinwoo.day11.homework;

public class LottoMain {
	
	public static void main(String[] args) {
		
		System.out.print("좋아하는 로또 번호를 입력하세요 : ");
		
		int num = Lotto.chooseLotNum();
		System.out.println("\n" + num + " 을(를) 포함해서 로또번호를 추출하겠습니다.\n");
		
		int nums[] = Lotto.makeLotArr(num);
		
		System.out.print("추출된 로또 번호 : ");
		for(int item : nums)
			System.out.print(item + " "); 
		
	}
	
}
