package exam0424.etc;

public class _02StringUtil {
	
	public static void hokeyGraphics(char cell, int size, boolean isRect) {
		
		if (isRect == true) {
			for (int i = 1; i <= size; i++) {
				System.out.print(cell);
				for (int j = 1; j <= size; j++) {
					System.out.print(cell);
				}
				System.out.println();
			}
			
		} else {
			
			for (int i = 1; i <= size; i++) {
				System.out.print(cell);
				for (int j = 1; j < i; j++) {
					System.out.print(cell);
				}
				System.out.println();
			} 
		}
	}
	
	public static void main(String[] args) {
		hokeyGraphics('@', 5, true);
		hokeyGraphics('$', 4, false);
		
	}

}
