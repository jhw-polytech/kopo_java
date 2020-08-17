package kr.ac.kopo.day10.project.project02;

public class StringUtil {
	
	public static void main(String[] args) {
		System.out.println("hokeyGraphics( '*', 4, false)");
		hokeyGraphics( '*', 4, false); 
		
		System.out.println("hokeyGraphics( '$', 4, true)");
		hokeyGraphics( '$', 4, true); 
	}
	
	// hokeyGraphics 메소드는 cell 문자와 size 값을 이용하여 특정 모양을 출력한다.
	// isRect 값이 true 이면 사각형 모양을 출력하고, false 이면 삼각형을 출력한다. 
	public static void hokeyGraphics(char cell, int size, boolean isRect)  {
		if(isRect) { // true면,
			square(cell, size);
		} else {
			triangle(cell, size);
		}
	}
	
	public static void square(char cell, int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j<size;  j++) {
				System.out.print(cell);
			}
			System.out.println();
		}
	}
	
	public static void triangle(char cell, int size) {
		for (int i = 0; i <= size; i++) {
			for (int j = size; j<size+i;  j++) {
				System.out.print(cell);
			}
			System.out.println();
		}
	}
}
