package kr.ac.kopo.day13.lotto01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoView {

	private Scanner sc;

	public LottoView() {
		// TODO Auto-generated constructor stub
	}

	public void start() {

		System.out.println("Lotto 게임 v1");
		System.out.println("게임수를 입력: ");
		int gameCount = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= gameCount; i++) {
			System.out.println("게임 " + i + " : " + getLottoNums());
		}
	}

	
	/*
		방법1.
	*/
	//외부에서는 이 메소드를 알 필요가 없기 때문에 private으로 만듦
	private String getLottoNums1() {		
		int[] lottonums = new int[6];
		Random r = new Random();
		
		for(int i = 0; i  < lottonums.length; i++) {
			lottonums[i] = r.nextInt(45) + 1;
			
			for(int j = 0; j<i; j++) {
				if(lottonums[i] == lottonums[j]) {
					// System.out.println("A"); -- 중복체크 확인코드
					i--;
					break;
				}
			}
		}
		
		
		return Arrays.toString(lottonums);
	}
	
	/*	
	 * 방법 2.
	*/
	private String getLottoNums2() {
		
		
	}
	
}
