package exam0410;

public class no07 {

	public static void gugu(int dan) {
		
		System.out.printf("*** %d단 ***\n\n", dan);
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("구구단을 외자~ 구구단을 외자~\n");
		for (int i = 2; i <= 9; i++) {
			gugu(i);
			System.out.println();
		}
	}
}
