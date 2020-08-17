package kr.co.hana.homework11;

import java.util.Random;

public class ExtractNumber {
	
	static void setNum() {
		int[] numArr = new int[6];
		Random r = new Random();

		for (int i = 0; i < 6; i++) {
			numArr[i] = r.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(numArr[i] == numArr[j]) {
					i--;
				}
			}
			System.out.print(numArr[i] + " ");
		}
	}
}
