package jaeheehomework;

import java.util.Arrays;

public class ThreeSixNine {
	public static void main(String[] args) {

		int i;
		String[] tsn = new String[] { "3", "6", "9" };

		for (i = 1; i < 100; i++) {

			String num1 = Integer.toString(i % 10);
			String num2 = Integer.toString(i / 10);

			if (Arrays.asList(tsn).contains(num1) && Arrays.asList(tsn).contains(num2)) {
				System.out.println(i + "짝짝");
			} else if (Arrays.asList(tsn).contains(num1) || Arrays.asList(tsn).contains(num2)) {
				System.out.println(i + "짝");
			}
		}
	}
}
