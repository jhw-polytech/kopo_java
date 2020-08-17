package kr.ac.kopo.day11.assignment;

import java.util.Random;
import java.util.Scanner;

public class LottoNumberExceptionMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("좋아하는 로또 번호를 입력하세요: ");
			//사용자로부터 입력받기
			int num = sc.nextInt();
			sc.nextLine();
			//입력받은 숫자가 1 ~ 45 범위를 넘어가면 예외를 발생시킴
			if( num < 1 | num > 45) {
				throw new LottoNumberException("1 - 45사이만 가능합니다. " + num + "은 올바르지 않습니다.");
			}
			System.out.println(num + "를 포함해서 로또번호들을 추출하겠습니다");
			//로또번호 추출 메소드 호출
			randomNums(num);		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	//매개변수와 난수5개를 합쳐 총 6개의 로또번호를 추출하는 메소드
	public static void randomNums(int num) {
		Random r = new Random();
		System.out.print(num);
		for(int i = 1; i <= 5; i++) {
			System.out.print(", " + (r.nextInt(45) + 1));
		}
	}
	
}

