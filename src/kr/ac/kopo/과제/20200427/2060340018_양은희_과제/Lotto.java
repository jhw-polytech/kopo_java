package homework0427;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	
	public static void main(String[] args) { // 메인 실행 메소드

		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 로또 번호를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();

		if(num>65) {
			throw new LottoException("1 - 45 사이만 가능합니다. "+num+"은 올바르지 않습니다.");
		}
		
		System.out.println(num + "를 포함해서 로또번호들을 추출하겠습니다.");
		System.out.print(num + " ");
		randomNum();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void randomNum() { // 로또 번호를 추출하는 메소드
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			System.out.print(arr[i] + " ");
		}
	}
}