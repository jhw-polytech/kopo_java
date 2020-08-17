package jaeheehomework;

public class HokeyGraphics {

	public static void hokeyGraphics(char cell, int size, boolean isRect) {

		if (isRect == true) {
			for (int i = 1; i <= size; i++) {
				for (int j = 1; j <= size; j++) {
					System.out.print(cell);
				}
				System.out.println();
			}
		} else {
			for (int i = 1; i <= size; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(cell);
				}
				System.out.println();
			}

		}
	}

	public static void main(String[] args) {
		hokeyGraphics('$', 4, false);
	}
}
