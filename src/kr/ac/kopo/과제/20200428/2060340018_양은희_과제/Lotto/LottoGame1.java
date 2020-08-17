package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
public class LottoGame1 {
	// 1. 배열
	public void game1() {
		Random r = new Random();
		int num[] = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
				}
			}
		}
		for (int k = 1; k < num.length; k++) {
			System.out.print(num[k] + " ");
		}
	}	
}