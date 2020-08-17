package kr.ac.kopo.day11.homework;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("좋아하는 로또 번호를 입력하세요 : ");
			int num = sc.nextInt();
			if(num<1 || num >45) {
				throw new LottoNumberException("1 - 45사이만 가능합니다. "+num+"은 올바르지 않습니다");
			}
			System.out.println(num+"를 포함해서 로또번호들을 추출하겠습니다");
		} catch (LottoNumberException e) {
			e.printStackTrace();
		}
		

	}

}
